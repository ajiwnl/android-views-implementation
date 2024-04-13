package com.intprog.implementlistandrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String[] namelist;
    int[] imglist;

    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String names[], int [] imgs){
        this.context = ctx;
        this.namelist = names;
        this.imglist = imgs;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return namelist.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.activity_for_custom, null);
        TextView txtView = convertView.findViewById(R.id.textView);
        ImageView imageView = convertView.findViewById(R.id.imgIcon);
        txtView.setText(namelist[position]);
        imageView.setImageResource(imglist[position]);
        return convertView;
    }
}
