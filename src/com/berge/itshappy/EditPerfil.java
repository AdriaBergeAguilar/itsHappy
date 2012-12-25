package com.berge.itshappy;

import com.berge.itshappy.fragments.AdapterFragmentDadesPersonals;
import com.viewpagerindicator.LinePageIndicator;
import com.viewpagerindicator.PageIndicator;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class EditPerfil extends FragmentActivity {
    

    AdapterFragmentDadesPersonals mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //The look of this sample is set via a style in the manifest
        setContentView(R.layout.activity_edit_perfil);

        mAdapter = new AdapterFragmentDadesPersonals(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (LinePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
    }
}