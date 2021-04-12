package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class M_01_02_01 extends AppCompatActivity {
    TextView text_m_01_02_01_exit;
    EditText edit_m_01_02_01_name, edit_m_01_02_01_Phone_Num;
    Button btn_m_01_02_01_loginButton;

    String name,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_02_01);

        text_m_01_02_01_exit = (TextView) findViewById(R.id.text_m_01_02_01_exit);
        edit_m_01_02_01_name = (EditText)findViewById(R.id.edit_m_01_02_01_name);
        edit_m_01_02_01_Phone_Num = (EditText)findViewById(R.id.edit_m_01_02_01_name);
        btn_m_01_02_01_loginButton = (Button)findViewById(R.id.btn_m_01_02_01_loginButton);
        name = edit_m_01_02_01_name.getText().toString();
        phone = edit_m_01_02_01_Phone_Num.getText().toString();

        edit_m_01_02_01_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                name = edit_m_01_02_01_name.getText().toString();
                phone = edit_m_01_02_01_Phone_Num.getText().toString();
                if(name.length() > 0 && phone.length() >0){
                    btn_m_01_02_01_loginButton.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                name = edit_m_01_02_01_name.getText().toString();
                phone = edit_m_01_02_01_Phone_Num.getText().toString();
                if(name.length() > 0 && phone.length() >0){
                    btn_m_01_02_01_loginButton.setEnabled(true);
                }
            }
        });
        edit_m_01_02_01_Phone_Num.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                name = edit_m_01_02_01_name.getText().toString();
                phone = edit_m_01_02_01_Phone_Num.getText().toString();
                if(name.length() > 0 && phone.length() >0){
                    btn_m_01_02_01_loginButton.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                name = edit_m_01_02_01_name.getText().toString();
                phone = edit_m_01_02_01_Phone_Num.getText().toString();
                if(name.length() > 0 && phone.length() >0){
                    btn_m_01_02_01_loginButton.setEnabled(true);
                }
            }
        });
        btn_m_01_02_01_loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), M_01_02_02.class );
                startActivity(intent);
            }
        });



    }
}