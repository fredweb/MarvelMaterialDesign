package com.example.george.materialdesign.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.george.materialdesign.R;
import com.example.george.materialdesign.app.AppController;
import com.example.george.materialdesign.vo.Character;
import com.example.george.materialdesign.vo.EnumPortrait;
import com.example.george.materialdesign.vo.Thumbnail;

import java.util.List;

/**
 * Created by george on 02/11/15.
 */
public class CustomListCharacterAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Character> list;
    private NetworkImageView thumbNail;
    ImageLoader imagemLoader = AppController.getInstance().getImageLoader();

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


        if(imagemLoader == null)
            imagemLoader = AppController.getInstance().getImageLoader();

        thumbNail = (NetworkImageView) convertView.findViewById(R.id.thumbnail);

        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView modified = (TextView) convertView.findViewById(R.id.modified);

        Character c = list.get(position);

        Thumbnail image = (Thumbnail) c.getTumbnail();

        thumbNail.setImageUrl(image.getPortrait(EnumPortrait.INCREBILE),imagemLoader);
        title.setText(c.getName());

        return convertView;
    }
}
