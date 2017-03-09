package com.example.marcmenard.applivisiteur;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;

public class AdapteurDeListeGroupeAcl extends ArrayAdapter<String> {
    private Integer[] tab_images_pour_la_liste = {
            R.drawable.Koala, R.drawable.Penguins,
    };

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.groupe_acl, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        textView.setText(getItem(position));

        if(convertView == null )
            imageView.setImageResource(tab_images_pour_la_liste[position]);
        else
            rowView = (View)convertView;

        return rowView;
    }

    public AdapteurDeListeGroupeAcl(Context context, String[] values) {
        super(context, R.layout.groupe_acl, values);
    }
}
