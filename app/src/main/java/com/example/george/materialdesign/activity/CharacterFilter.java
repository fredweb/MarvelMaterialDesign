package com.example.george.materialdesign.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.example.george.materialdesign.R;


/**
 * Created by george on 29/11/15.
 */
public class CharacterFilter extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

        View rootView = inflater.inflate(R.layout.character_filter, container, false);

        Button btn =  (Button) rootView.findViewById(R.id.btn_filter_character);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txt = (EditText) v.findViewById(R.id.edi_filter_personagens);
                if(txt!=null)
                {
                    if(!txt.getText().equals(""))
                    {
                        Intent i = new Intent(getContext(), CharacterDetail.class );
                        Bundle b = new Bundle();
                        b.putString("FirstName",txt.getText().toString());
                        i.putExtras(b);
                        startActivity(i);

                    }
                }
            }
        });

        return rootView;
    }

}
