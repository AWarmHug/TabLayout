package com.warm.tablayoutdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.warm.tablayout.TabLayout;

public class MainActivity extends AppCompatActivity {
    private android.support.design.widget.TabLayout tabDesign;
    private TabLayout tabMy;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabDesign = findViewById(R.id.tab_design);
        tabMy = findViewById(R.id.tab_my);
        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new Adapter(getSupportFragmentManager()));
        tabMy.setupWithViewPager(mPager);
        tabDesign.setupWithViewPager(mPager);
    }

}
