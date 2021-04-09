package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.net.Inet4Address;

public class M_01_01_02 extends AppCompatActivity {
    LinearLayout group_m_01_01_02_market_price, group_m_01_01_02_closing_price, group_m_01_01_02_high_price, group_m_01_01_02_low_price;
    TextView text_m_01_01_02_hi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_01_02);
        text_m_01_01_02_hi = (TextView)findViewById(R.id.text_m_01_01_02_hi);
        group_m_01_01_02_market_price = (LinearLayout)findViewById(R.id.group_m_01_01_02_market_price);
        group_m_01_01_02_closing_price = (LinearLayout)findViewById(R.id.group_m_01_01_02_closing_price);
        group_m_01_01_02_high_price = (LinearLayout)findViewById(R.id.group_m_01_01_02_high_price);
        group_m_01_01_02_low_price = (LinearLayout)findViewById(R.id.group_m_01_01_02_low_price);

        group_m_01_01_02_market_price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(getApplicationContext(), M_02_01_01.class);
                Toast.makeText(M_01_01_02.this, "clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}