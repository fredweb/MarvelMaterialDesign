package com.example.george.materialdesign.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.george.materialdesign.Interface.CharacterInterface;
import com.example.george.materialdesign.R;
import com.example.george.materialdesign.commom.AutorizeKey;
import com.example.george.materialdesign.deserialize.CharacterDeserializer;
import com.example.george.materialdesign.model.DataCharacter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by george on 29/11/15.
 */
public class CharacterDetail extends Fragment {

    String firstName;
    private ProgressDialog pDialog;
    String ts = AutorizeKey.getInstance().getTimeStamp();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getActivity().getIntent();

        if(intent !=null)
        {
            Bundle b = intent.getExtras();
            if(b!=null)
            {
                firstName = b.getString("FirstName");
                montarDialogo();
            }
        }

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_character, container, false);

        try
        {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .registerTypeAdapter(DataCharacter.class, new CharacterDeserializer())
                    .create();


            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(AutorizeKey.getInstance().getUrlBase())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            CharacterInterface objCharacter = retrofit.create(CharacterInterface.class);
            Call<DataCharacter> call = objCharacter.getCharatersByFirstName(firstName,ts
                    , AutorizeKey.getInstance().getPublicKey()
                    , AutorizeKey.getInstance().getkey(ts));

            call.enqueue(new Callback<DataCharacter>() {
                @Override
                public void onResponse(retrofit.Response<DataCharacter> response, Retrofit retrofit) {
                    int statusCode = response.code();
                    DataCharacter data = response.body();
                    if (data != null) {

                    }
                    hidePDialog();
                }
                @Override
                public void onFailure(Throwable t) {
                    Log.i("ERRO", t.getMessage());
                    hidePDialog();
                }
            });

        }catch (Exception ex)
        {

        }
        return rootView;
    }


    private void montarDialogo()
    {
        pDialog = new ProgressDialog(this.getContext());
        pDialog.setMessage("Loading...");
        pDialog.show();
    }

    private void hidePDialog() {
        if (pDialog != null) {
            pDialog.dismiss();
            pDialog = null;
        }
    }
}
