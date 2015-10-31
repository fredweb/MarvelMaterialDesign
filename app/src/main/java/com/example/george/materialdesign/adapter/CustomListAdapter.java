package com.example.george.materialdesign.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

/**
 * Created by george on 28/10/15.
 */
public class CustomListAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<T> movieItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();
}
