package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class Customadapter extends BaseAdapter {
    int img[];
    String detail[];
    String address[];
    Context context;
    public Customadapter(Context context, int img[],String detail[],String address[])
    {
        this.context=context;
        this.img=img;
        this.detail=detail;
        this.address=address;
    }
    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v=inflater.inflate(R.layout.custom,null);
        ImageView iv=v.findViewById(R.id.imageView);
        TextView tv1=v.findViewById(R.id.textView5);
        TextView tv2=v.findViewById(R.id.textView6);
        iv.setImageResource(img[i]);
        tv2.setText(address[i]);
        tv1.setText(detail[i]);

        return v;
    }
}
