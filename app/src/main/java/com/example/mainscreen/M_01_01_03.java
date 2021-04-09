package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class M_01_01_03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_01_03);
        M_01_01_03_Fragment_Adapter adapter = new M_01_01_03_Fragment_Adapter(this, getSupportFragmentManager());
        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager_m_01_01_03);
        viewPager.setAdapter(adapter);
        TabLayout tabs = findViewById(R.id.tabs_m_01_01_03);
        tabs.setupWithViewPager(viewPager);

    }
}