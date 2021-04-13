package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;


public class M_01_03_02 extends AppCompatActivity {

    TextView text_m_01_03_02_exit;
    M_01_03_02_Fragment_Id fragment_id;
    M_01_03_05_Fragment_pw fragment_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_03_02);
        M_01_03_02_Fragment_Adapter adapter = new M_01_03_02_Fragment_Adapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        Intent i = getIntent();
        int tabIndex = i.getIntExtra("tabIndex",-1);
        if(tabIndex != -1){
            viewPager.setCurrentItem(tabIndex);
        } else {
            Toast.makeText(this, "tabIndex == -1", Toast.LENGTH_SHORT).show();
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