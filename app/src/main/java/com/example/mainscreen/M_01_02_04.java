package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class M_01_02_04 extends AppCompatActivity {
    TextView text_m_01_02_04_finish, text_m_01_02_04_warning;
    EditText edit_m_01_02_04_username;
    Button btn_m_01_02_04_save;
    private String username_input, username_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_02_04);
        text_m_01_02_04_finish = (TextView)findViewById(R.id.text_m_01_02_04_finish);
        text_m_01_02_04_warning = (TextView)findViewById(R.id.text_m_01_02_04_warning);
        edit_m_01_02_04_username = (EditText)findViewById(R.id.edit_m_01_02_04_username);
        btn_m_01_02_04_save =(Button)findViewById(R.id.btn_m_01_02_04_save);

        text_m_01_02_04_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //TODO: 입력된 username 값과 서버에 저장된 값을 비교하여 존재여부를 검사
        username_input = edit_m_01_02_04_username.getText().toString();
        if (username_input.equals(username_data)){
            text_m_01_02_04_warning.setVisibility(View.VISIBLE);
            btn_m_01_02_04_save.setEnabled(false);
        } else {
            text_m_01_02_04_warning.setVisibility(View.INVISIBLE);
            btn_m_01_02_04_save.setEnabled(true);
        }

        btn_m_01_02_04_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), M_01_02_05.class);
                startActivity(intent);
            }
        });
    }
}