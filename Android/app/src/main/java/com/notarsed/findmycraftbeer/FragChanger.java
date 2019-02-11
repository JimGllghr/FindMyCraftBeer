package com.notarsed.findmycraftbeer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragChanger extends FragmentStatePagerAdapter {

    private final List<Fragment> frags = new ArrayList<>();
    private final List<String> fragNames = new ArrayList<>();

    public FragChanger(FragmentManager fm) {
        super(fm);
    }

    public void addFrag(Fragment frag){
        frags.add(frag);
    }

    @Override
    public Fragment getItem(int i) {
        return frags.get(i);
    }

    @Override
    public int getCount() {
        return frags.size();
    }
}
