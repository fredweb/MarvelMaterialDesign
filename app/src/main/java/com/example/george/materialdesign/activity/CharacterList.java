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

import com.example.george.materialdesign.R;
import com.example.george.materialdesign.adapter.CustomListCharacterAdapter;
import com.example.george.materialdesign.commom.AutorizeKey;
import com.example.george.materialdesign.vo.Character;
import com.example.george.materialdesign.vo.Data;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Request;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;

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
        View rootView = inflater.inflate(R.layout.characterlist, container, false);

        listView = (ListView) rootView.findViewById(R.id.list);
        adapter = new CustomListCharacterAdapter(movieList,inflater);
        listView.setAdapter(adapter);

        pDialog = new ProgressDialog(this.getContext());
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading...");
        pDialog.show();


        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AutorizeKey.getInstance().getUrlBase())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        String ts = AutorizeKey.getInstance().getTimeStamp();

        CharacterInterface objCharacter = retrofit.create(CharacterInterface.class);

        Call<Data> call = objCharacter.getData(AutorizeKey.getInstance().getkey(ts),"10");
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(retrofit.Response<Data> response, Retrofit retrofit) {
                int statusCode = response.code();
                Data data = response.body();
                if(data != null)
                {
                    Log.i(TAG,data.getResults().toString());
                }
            }


            @Override
            public void onFailure(Throwable t) {
                Log.i(TAG,"");
            }
        });

        hidePDialog();
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


    public interface CharacterInterface {
        // Request method and URL specified in the annotation
        // Callback for the parsed response is the last parameter

        @GET("/v1/public/character{parametros}&limit={limites}")
        Call<Data> getData(
                @Path("parametros") String parametros,
                @Path("limites") String limites
        );

    }

}
