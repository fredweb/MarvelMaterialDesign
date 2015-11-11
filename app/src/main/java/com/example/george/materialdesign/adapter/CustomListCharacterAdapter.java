package com.example.george.materialdesign.adapter;

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
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by george on 02/11/15.
 */
public class CustomListCharacterAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Character> list;

    public CustomListCharacterAdapter(List<Character> list, LayoutInflater inflater)
    {
        this.inflater = inflater;
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

        ImageView thumbNail = (ImageView) convertView.findViewById(R.id.thumbnail);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView modified = (TextView) convertView.findViewById(R.id.modified);
        Character c = list.get(position);
        Thumbnail image = (Thumbnail) c.getTumbnail();
        Picasso.with(convertView.getContext()).load(image.getPortrait(EnumPortrait.INCREBILE)).resize(100,100).into(thumbNail);
        title.setText(c.getName());
        return convertView;
    }
}
