package com.example.mainscreen;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class M_01_03_02_Fragment_Adapter extends FragmentPagerAdapter {
    private static final int[] TAB_TITLES = new int[] {R.string.tab_text_1,R.string.tab_text_2};
    private final Context context;

    public M_01_03_02_Fragment_Adapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;

    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new M_01_03_02_Fragment_Id();
                break;
            case 1:
                fragment = new M_01_03_05_Fragment_pw();
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
        return 2;
    }
}
