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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

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


        // Creating volley request obj
        JsonArrayRequest movieReq = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d(TAG, response.toString());
                        hidePDialog();

                        // Parsing json
                        for (int i = 0; i < response.length(); i++) {
                            try {

                                JSONObject obj = response.getJSONObject(i);
                                //Movie movie = new Movie();
                                //movie.setTitle(obj.getString("title"));
                                //movie.setYear(obj.getInt("releaseYear"));

                                // Genre is json array
                                //JSONArray genreArry = obj.getJSONArray("genre");
                                //ArrayList<String> genre = new ArrayList<String>();
                                //for (int j = 0; j < genreArry.length(); j++) {
                                //   genre.add((String) genreArry.get(j));
                                //}
                                //movie.setGenre(genre);

                                // adding movie to movies array
                                //movieList.add(movie);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }

                        // notifying list adapter about data changes
                        // so that it renders the list view with updated data
                        adapter.notifyDataSetChanged();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                hidePDialog();

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
