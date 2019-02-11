package com.notarsed.findmycraftbeer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ViewPager viewPager;
    private viewPageAdapter vpAdapter;
    private BreweryViewFrag breweryViewFrag;
    private BreweryViewFrag brewery2;
    private breweryLoader nBreweryLoader;
    private List<Brewery> breweryList;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //load breweries;
        nBreweryLoader = new breweryLoader();
        //Get Brewery List
        breweryViewFrag = new BreweryViewFrag();
        brewery2 = new BreweryViewFrag();
        breweryList = nBreweryLoader.getBreweryList(getApplicationContext(), breweryViewFrag);


        //Set up View Pager
        setViewPager();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void setViewPager(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        vpAdapter = new viewPageAdapter(getSupportFragmentManager());

        //breweryViewFrag.setBrewery(breweryList.get(0));
        vpAdapter.addFrag(breweryViewFrag);
        viewPager.setAdapter(vpAdapter);
        vpAdapter.addFrag(brewery2);
    }

}
