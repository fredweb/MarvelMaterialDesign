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
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.george.materialdesign.R;
import com.example.george.materialdesign.adapter.CustomListCharacterAdapter;
import com.example.george.materialdesign.commom.AutorizeKey;
import com.example.george.materialdesign.vo.Character;
import com.example.george.materialdesign.vo.Data;
import com.squareup.okhttp.Request;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
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


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .build();


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
