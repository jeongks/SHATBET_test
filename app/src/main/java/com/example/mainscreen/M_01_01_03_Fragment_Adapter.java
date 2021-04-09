package com.example.mainscreen;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class M_01_01_03_Fragment_Adapter extends FragmentPagerAdapter {
    private static final int[] TAB_TITLES = new int[] {R.string.tab_m_01_01_03_home,R.string.tab_m_01_01_03_game, R.string.tab_m_01_01_03_predict,
            R.string.tab_m_01_01_03_priceInfo, R.string.tab_m_01_01_03_charge, R.string.tab_m_01_01_03_exchange};
    private final Context context;
    public M_01_01_03_Fragment_Adapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new M_01_01_03_Fragment_home();
                break;
            case 1:
                fragment = new M_01_01_03_Fragment_game();
                break;
            case 2:
                fragment = new M_01_01_03_Fragment_predict();
                break;
            case 3:
                fragment = new M_01_01_03_Fragment_priceInfo();
                break;
            case 4:
                fragment = new M_01_01_03_Fragment_charge();
                break;
            case 5:
                fragment = new M_01_01_03_Fragment_exchange();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return context.getResources().getString(TAB_TITLES[position]);
    }
}
