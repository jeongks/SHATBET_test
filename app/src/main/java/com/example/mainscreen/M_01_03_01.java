package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class M_01_03_01 extends AppCompatActivity {
    TextView text_m_01_03_01_exit,text_m_01_03_01_find_id,text_m_01_03_01_find_pw;
    EditText edit_m_01_03_01_id, edit_m_01_03_01_pw;
    Button btn_m_01_03_01_login, btn_m_01_03_01_join;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_03_01);
        text_m_01_03_01_exit = (TextView)findViewById(R.id.text_m_01_03_01_exit);
        text_m_01_03_01_find_id = (TextView)findViewById(R.id.text_m_01_03_01_find_id);
        text_m_01_03_01_find_pw = (TextView)findViewById(R.id.text_m_01_03_01_find_pw);
        edit_m_01_03_01_id = (EditText)findViewById(R.id.edit_m_01_03_01_id);
        edit_m_01_03_01_pw = (EditText)findViewById(R.id.edit_m_01_03_01_pw);
        btn_m_01_03_01_login = (Button)findViewById(R.id.btn_m_01_03_01_login);
        btn_m_01_03_01_join = (Button)findViewById(R.id.btn_m_01_03_01_join);

        text_m_01_03_01_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_m_01_03_01_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit_m_01_03_01_id.getText().toString() == null || edit_m_01_03_01_id.getText().toString().equals("")){
                    Toast.makeText(M_01_03_01.this, "아이디를 입력해주세요", Toast.LENGTH_SHORT).show();
                    edit_m_01_03_01_id.requestFocus();
                } else if(edit_m_01_03_01_pw.getText().toString() == null || edit_m_01_03_01_pw.getText().toString().equals("")){
                    Toast.makeText(M_01_03_01.this, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show();
                    edit_m_01_03_01_pw.requestFocus();
                } else {
                    //로그인
                }
            }
        });

        text_m_01_03_01_find_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //m-01-03-02 activity start
                Intent intent = new Intent(M_01_03_01.this, M_01_03_02.class);
                startActivity(intent);
            }
        });
        text_m_01_03_01_find_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //m-01-03-05 activity start
                //Intent intent = new Intent(getApplicationContext(), );
            }
        });

        btn_m_01_03_01_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //m-01-02-01 activity start
                Intent intent = new Intent(getApplicationContext(), M_01_02_01.class );
                startActivity(intent);
            }
        });
    }
}