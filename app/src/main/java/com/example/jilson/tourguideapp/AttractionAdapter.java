package com.example.jilson.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Jilson on 01-02-2018.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction>{
    public AttractionAdapter(@NonNull Context context, @NonNull ArrayList<Attraction> objects) {
        super(context,0, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Attraction attraction = getItem(position);

        TextView descriptionTextView = listItemView.findViewById(R.id.attraction_description);
        descriptionTextView.setText(attraction.getAttractionDescription());

        ImageView attractionImageView = listItemView.findViewById(R.id.attraction_image);
        attractionImageView.setImageResource(attraction.getAttractionImageResourceId());


        return listItemView;

    }
}
