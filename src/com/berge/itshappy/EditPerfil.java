package com.berge.itshappy;

import com.berge.itshappy.fragments.AdapterFragmentDadesPersonals;
import com.viewpagerindicator.LinePageIndicator;
import com.viewpagerindicator.PageIndicator;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Button;

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
        
        Button Cancelar = (Button)findViewById(R.id.button1);
        Button Aceptar = (Button)findViewById(R.id.button2);
        
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        Cancelar.setWidth((display.getWidth()/2)-10);
        Aceptar.setWidth((display.getWidth()/2)-5);
    }
}