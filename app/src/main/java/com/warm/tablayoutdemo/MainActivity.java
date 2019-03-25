package com.warm.tablayoutdemo;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.warm.tablayout.ExTabLayout;

public class MainActivity extends AppCompatActivity {
    private android.support.design.widget.TabLayout tabDesign;
    private ExTabLayout tabNo, ex, tabMy, tabMy2, tabMy3, tab_textAppearance;
    private ExTabLayout tab_custom;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabDesign = findViewById(R.id.tab_design);
        ex = new ExTabLayout(this);
        ex.setTabIndicatorColor(ContextCompat.getColor(this, R.color.colorPrimary));
        ex.setTabIndicatorPadding(8);
        ex.setTabIndicatorStretch(1f);
        ex.setTabTextAppearance(R.style.AppTheme_TabTextAppearance, R.style.AppTheme_TabSelectedTextAppearance);
        ((LinearLayout) findViewById(R.id.line)).addView(ex, 1);

        tabNo = findViewById(R.id.tab_no);

        tabMy = findViewById(R.id.tab_my);

        tabMy2 = findViewById(R.id.tab_my2);
        tabMy3 = findViewById(R.id.tab_my3);
        tab_custom = findViewById(R.id.tab_custom);
        tab_textAppearance = findViewById(R.id.tab_textAppearance);
        mPager = findViewById(R.id.pager);
        scroll();

    }

    private void fixed() {
        mPager.setAdapter(new Adapter(getSupportFragmentManager(), 3));

        tabDesign.setTabMode(ExTabLayout.MODE_FIXED);
        tabDesign.setupWithViewPager(mPager);

        ex.setTabMode(ExTabLayout.MODE_FIXED);
        ex.setupWithViewPager(mPager);

        tabNo.setTabMode(ExTabLayout.MODE_FIXED);
        tabNo.setupWithViewPager(mPager);

        tabMy.setTabMode(ExTabLayout.MODE_FIXED);
        tabMy.setupWithViewPager(mPager);

        tabMy2.setTabMode(ExTabLayout.MODE_FIXED);
        tabMy2.setupWithViewPager(mPager);

        tabMy3.setTabMode(ExTabLayout.MODE_FIXED);
        tabMy3.setupWithViewPager(mPager);

        tab_custom.setTabMode(ExTabLayout.MODE_FIXED);
        tab_custom.setupWithViewPager(mPager);

        tab_textAppearance.setTabMode(ExTabLayout.MODE_FIXED);
        tab_textAppearance.setupWithViewPager(mPager);
    }

    private void scroll() {
        mPager.setAdapter(new Adapter(getSupportFragmentManager(), 10));

        tabDesign.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tabDesign.setupWithViewPager(mPager);

        tabNo.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tabNo.setupWithViewPager(mPager);

        ex.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        ex.setupWithViewPager(mPager);

        tabMy.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tabMy.setupWithViewPager(mPager);

        tabMy2.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tabMy2.setupWithViewPager(mPager);

        tabMy3.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tabMy3.setupWithViewPager(mPager);


        tab_custom.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tab_custom.setupWithViewPager(mPager);

        tab_textAppearance.setTabMode(ExTabLayout.MODE_SCROLLABLE);
        tab_textAppearance.setupWithViewPager(mPager);
    }

}
