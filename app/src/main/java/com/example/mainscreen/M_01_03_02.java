package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;


public class M_01_03_02 extends AppCompatActivity {
    TabLayout tab_m_01_03_02;
    TextView text_m_01_03_02_exit = (TextView)findViewById(R.id.text_m_01_03_02_exit);
    ViewPager viewpager_m_01_03_02 = (ViewPager)findViewById(R.id.viewpager_m_01_03_02);
    M_01_03_02_Fragment_Id fragment_id;
    M_01_03_05_Fragment_pw fragment_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_03_02);

        text_m_01_03_02_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        fragment_id = new M_01_03_02_Fragment_Id();
        fragment_pw = new M_01_03_05_Fragment_pw();

        getSupportFragmentManager().beginTransaction().add(R.id.container,fragment_id).commit();

        tab_m_01_03_02 = findViewById(R.id.tab_m_01_03_02);
        tab_m_01_03_02.addTab(tab_m_01_03_02.newTab().setText("아이디 찾기"));
        tab_m_01_03_02.addTab(tab_m_01_03_02.newTab().setText("비밀번호 찾기"));

        M_01_03_02_Fragment_Adapter adapter = new M_01_03_02_Fragment_Adapter(getSupportFragmentManager(), 0);
        viewpager_m_01_03_02.setAdapter(adapter);

        tab_m_01_03_02.setupWithViewPager(viewpager_m_01_03_02);
        viewpager_m_01_03_02.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_m_01_03_02));
    }
}