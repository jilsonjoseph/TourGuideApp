package com.example.jilson.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Location1Fragment extends Fragment {


    public Location1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list,container,false);

        ArrayList<Attraction> attractions =new ArrayList<Attraction>();
        attractions.add(new Attraction(R.drawable.attraction_image_1, getResources().getString(R.string.description1)));
        attractions.add(new Attraction(R.drawable.attraction_image_2, getResources().getString(R.string.description2)));
        attractions.add(new Attraction(R.drawable.attraction_image_3, getResources().getString(R.string.description3)));
        attractions.add(new Attraction(R.drawable.attraction_image_4,getResources().getString(R.string.description4)));
        attractions.add(new Attraction(R.drawable.attraction_image_5,getResources().getString(R.string.description5)));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),attractions);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

}
