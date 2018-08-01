package com.warm.tablayoutdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.warm.tablayout.ExTabLayout;

public class MainActivity extends AppCompatActivity {
    private android.support.design.widget.TabLayout tabDesign;
    private ExTabLayout tabMy, tabMy2, tab_my3;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabDesign = findViewById(R.id.tab_design);
        tabMy = findViewById(R.id.tab_my);
        tabMy2 = findViewById(R.id.tab_my2);
        tab_my3 = findViewById(R.id.tab_custom);
        mPager = findViewById(R.id.pager);
        fixed();
        for (int i = 0; i < tab_my3.getTabCount(); i++) {
            tab_my3.getTabAt(i).setCustomView(R.layout.item);
        }
    }

    private void fixed() {
        mPager.setAdapter(new Adapter(getSupportFragmentManager(), 3));
//        tabMy.setTabMode(ExTabLayout.MODE_FIXED);
//        tabMy.setupWithViewPager(mPager);
//
//        tabDesign.setTabMode(ExTabLayout.MODE_FIXED);
//        tabDesign.setupWithViewPager(mPager);
//
        tabMy2.setTabMode(ExTabLayout.MODE_FIXED);
        tabMy2.setupWithViewPager(mPager);

//        tab_my3.setTabMode(ExTabLayout.MODE_FIXED);
//        tab_my3.setupWithViewPager(mPager);

    }

    private void scroll() {
        mPager.setAdapter(new Adapter(getSupportFragmentManager(), 10));
        tabMy.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tabMy.setupWithViewPager(mPager);

        tabDesign.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tabDesign.setupWithViewPager(mPager);

        tabMy2.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tabMy2.setupWithViewPager(mPager);

        tab_my3.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tab_my3.setupWithViewPager(mPager);
    }

}
