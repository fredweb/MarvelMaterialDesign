package com.example.george.materialdesign.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.Response;
import com.example.george.materialdesign.Interface.CharacterInterface;
import com.example.george.materialdesign.R;
import com.example.george.materialdesign.adapter.CustomListCharacterAdapter;
import com.example.george.materialdesign.commom.AutorizeKey;
import com.example.george.materialdesign.deserialize.CharacterDesirializer;
import com.example.george.materialdesign.model.Character;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void onResume() {
        super.onResume();
        String ts = AutorizeKey.getInstance().getTimeStamp();

        try {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .registerTypeAdapter(Character.class, new CharacterDesirializer())
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(AutorizeKey.getInstance().getUrlBase())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            CharacterInterface objCharacter = retrofit.create(CharacterInterface.class);

            Call<List<Character>> call = objCharacter.getCharaters(ts
                    , AutorizeKey.getInstance().getPublicKey()
                    , AutorizeKey.getInstance().getkey(ts));


            call.enqueue(new Callback<List<Character>>() {
                @Override
                public void onResponse(retrofit.Response<List<Character>> response, Retrofit retrofit) {
                    int statusCode = response.code();
                    List<Character> data = response.body();
                    if (data != null) {
                        for (Character c : data) {
                            movieList.add(c);
                        }
                        Log.i(TAG, "");
                    }
                    hidePDialog();
                }


                @Override
                public void onFailure(Throwable t) {
                    Log.i(TAG, t.getMessage());
                    hidePDialog();
                }
            });
        }catch (Exception E)
        {
            Log.i(TAG, E.getMessage());
        }

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
        View rootView = inflater.inflate(R.layout.characterlist, container, false);
        listView = (ListView) rootView.findViewById(R.id.list);
        adapter = new CustomListCharacterAdapter(movieList,inflater);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        pDialog = new ProgressDialog(this.getContext());
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading...");
        pDialog.show();


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
