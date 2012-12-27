package com.berge.itshappy.fragments.llistes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class AdapterFragmentLlistes extends FragmentPagerAdapter{
    protected static final Fragment[] CONTENT = new Fragment[] { 
    	new ListasAmigos(),new MisListas(),new Reservats()};
    
    public AdapterFragmentLlistes(FragmentManager fm) {
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

}