package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class M_01_02_02 extends AppCompatActivity {
    TextView text_m_01_02_02_finish, text_m_01_02_02_timer, text_m_01_02_02_clear;
    EditText edit_m_01_02_02_verify_number;
    Button button_m_01_02_02_verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_02_02);
        text_m_01_02_02_finish = (TextView)findViewById(R.id.text_m_01_02_02_finish);
        text_m_01_02_02_timer = (TextView)findViewById(R.id.text_m_01_02_02_timer);
        text_m_01_02_02_clear = (TextView)findViewById(R.id.text_m_01_02_02_clear);
        edit_m_01_02_02_verify_number = (EditText)findViewById(R.id.edit_m_01_02_02_verify_number);
        button_m_01_02_02_verify = (Button)findViewById(R.id.button_m_01_02_02_verify);

        text_m_01_02_02_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        text_m_01_02_02_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_m_01_02_02_verify_number.getText().clear();
            }
        });
        button_m_01_02_02_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: update verification action
                Intent intent= new Intent(getApplicationContext(), M_01_02_03.class);
                startActivity(intent);
            }
        });
    }
}