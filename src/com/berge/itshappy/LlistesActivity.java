package com.berge.itshappy;

import com.berge.itshappy.fragments.llistes.AdapterFragmentLlistes;
import com.viewpagerindicator.LinePageIndicator;
import com.viewpagerindicator.PageIndicator;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class LlistesActivity extends FragmentActivity {
	AdapterFragmentLlistes mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //The look of this sample is set via a style in the manifest
        setContentView(R.layout.activity_llistes);

        mAdapter = new AdapterFragmentLlistes(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (LinePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        
    }

}
