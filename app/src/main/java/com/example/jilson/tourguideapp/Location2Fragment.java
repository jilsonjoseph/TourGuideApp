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
public class Location2Fragment extends Fragment {


    public Location2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list,container,false);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.drawable.attraction_image_6,getResources().getString(R.string.description6)));
        attractions.add(new Attraction(R.drawable.attraction_image_7,getResources().getString(R.string.description7)));
        attractions.add(new Attraction(R.drawable.attraction_image_8,getResources().getString(R.string.description8)));
        attractions.add(new Attraction(R.drawable.attraction_image_9,getResources().getString(R.string.description9)));
        attractions.add(new Attraction(R.drawable.attraction_image_10,getResources().getString(R.string.description10)));

        ListView listView = rootView.findViewById(R.id.list);
        AttractionAdapter adapter = new AttractionAdapter(getActivity(),attractions);
        listView.setAdapter(adapter);

        return rootView;
    }

}
