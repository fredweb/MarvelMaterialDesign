package com.example.george.materialdesign.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.george.materialdesign.R;
import com.example.george.materialdesign.model.NavDrawerItem;
import java.util.Collections;
import java.util.List;

/**
 * Created by george on 23/10/15.
 */
public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.MyViewHolder> {

    List<NavDrawerItem> data = Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;

    public NavigationDrawerAdapter(Context context, List<NavDrawerItem> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    public void delete(int position) {
        data.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.nav_drawer_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NavDrawerItem current = data.get(position);
        holder.title.setText(current.getTitle());
        switch (holder.title.getText().toString())
        {
            case "Personagens":
                holder.image.setImageResource(R.drawable.characters);
                break;
            case "Revista":
                holder.image.setImageResource(R.drawable.comics);
                break;
            case "Autores":
                holder.image.setImageResource(R.drawable.alert);
                break;
            case "Eventos":
                holder.image.setImageResource(R.drawable.events);
                break;
            case "Historia":
                holder.image.setImageResource(R.drawable.stories);
                break;

            default:
                holder.image.setImageResource(R.drawable.exit);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            image = (ImageView) itemView.findViewById(R.id.imageTitle);
        }
    }
}
