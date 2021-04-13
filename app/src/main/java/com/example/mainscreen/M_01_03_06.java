package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class M_01_03_06 extends AppCompatActivity {

    TextView text_m_01_03_02_exit;
    M_01_03_02_Fragment_Id fragment_id;
    M_01_03_05_Fragment_pw fragment_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_03_02);
        M_01_03_06_Fragment_Adapter adapter = new M_01_03_06_Fragment_Adapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        Intent i = getIntent();
        viewPager.setAdapter(adapter);
        int tabIndex = i.getIntExtra("tabIndex",-1);
        if(tabIndex != -1){
            viewPager.setCurrentItem(tabIndex);
        }
        text_m_01_03_02_exit = (TextView)findViewById(R.id.text_m_01_03_02_exit);


        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        text_m_01_03_02_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}