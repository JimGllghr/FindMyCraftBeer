package com.notarsed.findmycraftbeer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Sets Up the Brewery information Frag
 * Frag Displays Details of th Brewery
 */

public class BreweryViewFrag extends Fragment {

    private Brewery brewery;
    private TextView nameView;
    private TextView addView;
    private ImageView imageView;

    public void setBrewery(Brewery nBrewery){
        brewery = nBrewery;
        nameView.setText(brewery.getName());
        addView.setText(brewery.getAddress());
    }

    public static BreweryViewFrag newInstance() {
        BreweryViewFrag fragment = new BreweryViewFrag();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_brewery_view, container, false);
        // Inflate the layout for this fragment
        nameView = (TextView) view.findViewById(R.id.bName);
        addView = (TextView) view.findViewById(R.id.bAdd);
        return inflater.inflate(R.layout.fragment_brewery_view, container, false);
    }



}
