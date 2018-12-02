package com.example.jilson.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jilson on 01-02-2018.
 */

public class SimpleFragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new Location1Fragment();
        }if(position == 1) {
            return new Location2Fragment();
        }if(position == 2){
            return new Location3Fragment();
        } else {
            return new Location4Fragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return context.getString(R.string.location1);
        }if(position == 1) {
            return context.getString(R.string.location2);
        }if(position == 2){
            return context.getString(R.string.location3);
        } else {
            return context.getString(R.string.location4);
        }
    }
}
