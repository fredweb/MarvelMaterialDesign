package com.example.george.materialdesign.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.george.materialdesign.R;
import com.example.george.materialdesign.model.Character;
import com.example.george.materialdesign.model.EnumPortrait;
import com.example.george.materialdesign.model.Thumbnail;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by george on 02/11/15.
 */
public class CustomListCharacterAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Character> list;
    private Context context;
    private View row;

    public CustomListCharacterAdapter(List<Character> list, Context context)
    {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
            return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);

    }

    @Override
    public long getItemId(int position) {
            return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        try {
            inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_row, parent, false);
            if(list.get(position)!=null){

            ImageView thumbNail = (ImageView) row.findViewById(R.id.thumbnail);
            TextView title = (TextView) row.findViewById(R.id.title);
            TextView modified = (TextView) row.findViewById(R.id.modified);

            Thumbnail image = (Thumbnail)list.get(position).getTumbnail();
            Picasso.with(row.getContext()).load(image.getPortrait(EnumPortrait.INCREBILE)).resize(100, 100).into(thumbNail);
            title.setText(list.get(position).getName());
            }
        }catch (Exception ex)
        {
            Log.i("ERRO",ex.getMessage());
        }
        return row;
    }
}
