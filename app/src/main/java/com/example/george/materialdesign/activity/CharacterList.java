package com.example.george.materialdesign.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.george.materialdesign.Interface.CharacterInterface;
import com.example.george.materialdesign.R;
import com.example.george.materialdesign.adapter.CustomListCharacterAdapter;
import com.example.george.materialdesign.commom.AutorizeKey;
import com.example.george.materialdesign.deserialize.CharacterDeserializer;
import com.example.george.materialdesign.model.Character;
import com.example.george.materialdesign.model.DataCharacter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by george on 28/10/15.
 */
public class CharacterList extends Fragment {


    private static final String TAG = CharacterList.class.getSimpleName();

    // Movies json url
    private static final String url = AutorizeKey.getInstance().getUrlCharacter();
    private ProgressDialog pDialog;
    private List<Character> movieList = new ArrayList<Character>();
    private ListView listView;
    private CustomListCharacterAdapter adapter;
    public CharacterList()
    {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        hidePDialog();
    }

    private void hidePDialog() {
        if (pDialog != null) {
            pDialog.dismiss();
            pDialog = null;
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        pDialog = new ProgressDialog(this.getContext());
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading...");
        pDialog.show();

        String ts = AutorizeKey.getInstance().getTimeStamp();
        View rootView = inflater.inflate(R.layout.characterlist, container, false);
        listView = (ListView) rootView.findViewById(R.id.list);
        adapter = new CustomListCharacterAdapter(movieList,this.getContext());

        try {

            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .registerTypeAdapter(DataCharacter.class, new CharacterDeserializer())
                    .create();


            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(AutorizeKey.getInstance().getUrlBase())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            CharacterInterface objCharacter = retrofit.create(CharacterInterface.class);
            Call<DataCharacter> call = objCharacter.getCharaters(ts
                    , AutorizeKey.getInstance().getPublicKey()
                    , AutorizeKey.getInstance().getkey(ts));
            call.enqueue(new Callback<DataCharacter>() {
                @Override
                public void onResponse(retrofit.Response<DataCharacter> response, Retrofit retrofit) {
                    int statusCode = response.code();
                    DataCharacter data = response.body();
                    if (data != null) {

                        movieList.addAll(data.getResults());
                    }
                    hidePDialog();
                }
                @Override
                public void onFailure(Throwable t) {
                    Log.i(TAG, t.getMessage());
                    hidePDialog();
                }
            });

            listView.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        }catch (Exception E)
        {
            Log.i(TAG, E.getMessage());
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView value = (TextView)parent.findViewById(R.id.IdNumber);

            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
