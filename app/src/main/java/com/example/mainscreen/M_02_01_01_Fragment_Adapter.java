package com.example.mainscreen;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class M_02_01_01_Fragment_Adapter extends FragmentPagerAdapter {
    private static final int[] TAB_TITLES = new int[] {};
    private final Context context;

    public M_02_01_01_Fragment_Adapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;

    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new M_02_01_Game_Fragment_market_price();
                break;
            case 1:
                fragment = new M_02_01_Game_Fragment_closing_price();
                break;
            case 2:
                fragment = new M_02_01_Game_Fragment_high_price();
                break;
            case 3:
                fragment = new M_02_01_Game_Fragment_low_price();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return context.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 4;
    }
}
