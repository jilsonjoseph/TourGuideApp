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
public class Location4Fragment extends Fragment {


    public Location4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list,container,false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.drawable.attraction_image_16, getResources().getString(R.string.description16)));
        attractions.add(new Attraction(R.drawable.attraction_image_17, getResources().getString(R.string.description17)));
        attractions.add(new Attraction(R.drawable.attraction_image_18, getResources().getString(R.string.description18)));
        attractions.add(new Attraction(R.drawable.attraction_image_19, getResources().getString(R.string.description19)));
        attractions.add(new Attraction(R.drawable.attraction_image_20, getResources().getString(R.string.description20)));

        ListView listView = rootView.findViewById(R.id.list);

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),attractions);
        listView.setAdapter(adapter);

        return rootView;
    }

}
