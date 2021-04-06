package com.example.mainscreen;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class M_01_03_02_Fragment_Adapter extends FragmentPagerAdapter {
    int behavior;
    public M_01_03_02_Fragment_Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm);
        this.behavior = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                M_01_03_02_Fragment_Id fragment_id = new M_01_03_02_Fragment_Id();
                return fragment_id;
            case 1:
                /*
                M_01_03_02_Framgment_pw fragment_pw = new M_01_03_02_Fragment_pw();
                return fragment_pw;
                 */
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return behavior;
    }
}
