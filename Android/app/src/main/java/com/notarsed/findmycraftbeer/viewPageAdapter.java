package com.notarsed.findmycraftbeer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class viewPageAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> nFragmentList = new ArrayList<>();
    public viewPageAdapter(FragmentManager fm) {
        super(fm);
    }
    public void addFrag(Fragment frag)
    {
        nFragmentList.add(frag);
    }

    @Override
    public Fragment getItem(int i) {
        return nFragmentList.get(i);
    }

    @Override
    public int getCount() {
        return nFragmentList.size();
    }
}
