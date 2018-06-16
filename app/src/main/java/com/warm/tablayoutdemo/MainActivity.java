package com.warm.tablayoutdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.warm.tablayout.TabLayout;

public class MainActivity extends AppCompatActivity {
    private android.support.design.widget.TabLayout tabDesign;
    private TabLayout tabMy, tabMy2;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabDesign = findViewById(R.id.tab_design);
        tabMy = findViewById(R.id.tab_my);
        tabMy2 =findViewById(R.id.tab_my2);
        mPager = findViewById(R.id.pager);
        scroll();
    }

    private void fixed(){
        mPager.setAdapter(new Adapter(getSupportFragmentManager(),4));
        tabMy.setTabMode(TabLayout.MODE_FIXED);
        tabMy.setupWithViewPager(mPager);

        tabDesign.setTabMode(TabLayout.MODE_FIXED);
        tabDesign.setupWithViewPager(mPager);

        tabMy2.setTabMode(TabLayout.MODE_FIXED);
        tabMy2.setupWithViewPager(mPager);
    }

    private void scroll(){
        mPager.setAdapter(new Adapter(getSupportFragmentManager(),10));
        tabMy.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabMy.setupWithViewPager(mPager);

        tabDesign.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabDesign.setupWithViewPager(mPager);

        tabMy2.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabMy2.setupWithViewPager(mPager);
    }

}
