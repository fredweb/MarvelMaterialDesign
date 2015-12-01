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
import com.example.george.materialdesign.model.EnumLandScape;
import com.example.george.materialdesign.model.Thumbnail;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by george on 30/11/15.
 */
public class adapterDetailsCharacter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Character> list;
    private Context context;
    private View row;

    public adapterDetailsCharacter(List<Character> list, Context context)
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
            row = inflater.inflate(R.layout.detail_character, parent, false);
            if(list.get(position)!=null){

                ImageView thumbNail = (ImageView) row.findViewById(R.id.img_detail);
                TextView nameCharacter = (TextView) row.findViewById(R.id.id_detail_name);
                TextView descricao = (TextView) row.findViewById(R.id.id_detail_label_descrition);

                Thumbnail image = (Thumbnail) (Thumbnail)list.get(position).getTumbnail();
                Picasso.with(row.getContext()).load(image.getLandScape(EnumLandScape.XLARGE)).into(thumbNail);
                nameCharacter.setText(list.get(position).getName());
                descricao.setText(list.get(position).getDescription());
            }
        }catch (Exception ex)
        {
            Log.i("ERRO", ex.getMessage());
        }
        return row;
    }
}
