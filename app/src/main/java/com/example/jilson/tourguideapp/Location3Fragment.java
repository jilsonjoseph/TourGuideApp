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
public class Location3Fragment extends Fragment {


    public Location3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list,container,false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.drawable.attraction_image_11, getResources().getString(R.string.description11)));
        attractions.add(new Attraction(R.drawable.attraction_image_12, getResources().getString(R.string.description12)));
        attractions.add(new Attraction(R.drawable.attraction_image_13, getResources().getString(R.string.description13)));
        attractions.add(new Attraction(R.drawable.attraction_image_14, getResources().getString(R.string.description14)));
        attractions.add(new Attraction(R.drawable.attraction_image_15, getResources().getString(R.string.description15)));

        ListView listView = rootView.findViewById(R.id.list);

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),attractions);
        listView.setAdapter(adapter);

        return rootView;
    }

}
