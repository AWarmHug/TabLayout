package com.warm.tablayoutdemo;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * 作者：warm
 * 时间：2018-06-01 09:00
 * 描述：
 */
public class Adapter extends FragmentStatePagerAdapter {
    private int size;

    public Adapter(FragmentManager fm,int size) {
        super(fm);
        this.size=size;
    }


    @Override
    public Fragment getItem(int position) {
        return new MyFragment();
    }

    @Override
    public int getCount() {
        return size;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Title" + position;
    }
}
