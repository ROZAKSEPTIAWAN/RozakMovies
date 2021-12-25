package com.example.rozakmovies;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    public SectionsPagerAdapter(FragmentManager fm, Context context)
    {
        super(fm);
        this.context = context;
    }
    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new HorrorFragment();
            case 2:
                return new AdventureFragment();
            case 3:
                return new ScienceFragment();
        }
        return null;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getResources().getText(R.string.home_tab);
            case 1:
                return context.getResources().getText(R.string.horror_tab);
            case 2:
                return context.getResources().getText(R.string.adventure_tab);
            case 3:
                return context.getResources().getText(R.string.science_tab);
        }
        return null;
    }
}
