package com.example.jilson.tourguideapp;

/**
 * Created by Jilson on 01-02-2018.
 */

public class Attraction {
    private int attractionImageResourceId;
    private String attractionDescription;

    public Attraction(int attractionImageResourceId, String attractionDescription) {
        this.attractionImageResourceId = attractionImageResourceId;
        this.attractionDescription = attractionDescription;
    }



    public int getAttractionImageResourceId() {
        return attractionImageResourceId;
    }

    public String getAttractionDescription() {
        return attractionDescription;
    }
}
