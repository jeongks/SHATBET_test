package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;


public class M_01_03_02 extends AppCompatActivity {
    TabLayout tab_m_01_03_02 = (TabLayout)findViewById(R.id.tab_m_01_03_02);
    TextView text_m_01_03_02_exit = (TextView)findViewById(R.id.text_m_01_03_02_exit);
    ViewPager viewpager_m_01_03_02 = (ViewPager)findViewById(R.id.viewpager_m_01_03_02);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_03_02);
        tab_m_01_03_02.addTab(tab_m_01_03_02.newTab().setText("아이디 찾기"));
        tab_m_01_03_02.addTab(tab_m_01_03_02.newTab().setText("비밀번호 찾기"));
        tab_m_01_03_02.setTabGravity(tab_m_01_03_02.GRAVITY_FILL);

        M_01_03_02_Fragment_Adapter adapter = new M_01_03_02_Fragment_Adapter(getSupportFragmentManager(), 0);
        viewpager_m_01_03_02.setAdapter(adapter);

        tab_m_01_03_02.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewpager_m_01_03_02));
        viewpager_m_01_03_02.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_m_01_03_02));
    }
}