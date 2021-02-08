package com.example.girdviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CoustomAdapter extends BaseAdapter {

    private Context context;
    private String [] country_name;
    private int [] flags;
    private LayoutInflater layoutInflater;

    CoustomAdapter(Context context, String [] country_name, int [] flags){
        this.context = context;
        this.country_name = country_name;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return country_name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        if (view == null){
            layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.resource_activity,parent,false);
        }
        ImageView imageView = (ImageView)view.findViewById(R.id.flag_id);
        TextView textView = (TextView)view.findViewById(R.id.source_title);
        imageView.setImageResource(flags[i]);
        textView.setText(country_name[i]);
        return view;
    }
}
