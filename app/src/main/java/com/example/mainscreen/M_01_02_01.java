package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class M_01_02_01 extends AppCompatActivity {
    TextView text_m_01_02_01_exit;
    EditText edit_m_01_02_01_name, edit_m_01_02_01_Phone_Num;
    Button btn_m_01_02_01_loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_02_01);

        text_m_01_02_01_exit = (TextView) findViewById(R.id.text_m_01_02_01_exit);
        edit_m_01_02_01_name = (EditText)findViewById(R.id.edit_m_01_02_01_name);
        edit_m_01_02_01_Phone_Num = (EditText)findViewById(R.id.edit_m_01_02_01_name);
        btn_m_01_02_01_loginButton = (Button)findViewById(R.id.btn_m_01_02_01_loginButton);

        btn_m_01_02_01_loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), M_01_02_02.class );
                startActivity(intent);
            }
        });



    }
}