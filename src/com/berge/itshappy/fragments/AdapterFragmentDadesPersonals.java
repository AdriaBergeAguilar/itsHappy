package com.berge.itshappy.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.viewpagerindicator.IconPagerAdapter;

public class AdapterFragmentDadesPersonals extends FragmentPagerAdapter implements IconPagerAdapter {
    protected static final Fragment[] CONTENT = new Fragment[] { 
    	new DadesPersonals(),new DadesPersonalsImatge(),new DadesPersonalsContrasenya(),
    	new DadesPersonalsOtros()};
    
    public AdapterFragmentDadesPersonals(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return CONTENT[position];
    }

    @Override
    public int getCount() {
        return CONTENT.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
      return CONTENT[position].getClass().getName();
    }

    @Override
    public int getIconResId(int index) {
      return 0;
    }
}