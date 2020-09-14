package com.example.poppickimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends BaseAdapter {
    private Context context;
    private int[] image;
    private String[] lang_name;
    public CustomList(Context context, int[] image, String[] lang_name) {
        this.context = context;
        this.image = image;
        this.lang_name = lang_name;
    }

    @Override
    public int getCount() {
        return image.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.design,null,false);
        }

        ImageView imageView = view.findViewById(R.id.imageId);
        imageView.setImageResource(image[i]);
        TextView textView = view.findViewById(R.id.textId);
        textView.setText(lang_name[i]);
        return view;
    }
}
