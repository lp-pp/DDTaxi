package com.lp.ddtaxi.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.lp.ddtaxi.base.BaseFragment;

import java.util.ArrayList;

public class CallCarTabPagerAdapter extends FragmentPagerAdapter {


    private final ArrayList<BaseFragment> fragments;

    public CallCarTabPagerAdapter(FragmentManager fm, ArrayList<BaseFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).gettitle();
    }

}

