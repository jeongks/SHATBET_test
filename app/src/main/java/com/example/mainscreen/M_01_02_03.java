package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class M_01_02_03 extends AppCompatActivity {
    TextView text_m_01_02_03_finish;
    EditText edit_m_01_02_03_id, edit_m_01_02_03_pw, edit_m_01_02_03_pw_confirm;
    Button btn_m_01_02_03_save;
    private String id_input;
    private String password_input;
    private String password_confirm_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_02_03);
        text_m_01_02_03_finish = (TextView)findViewById(R.id.text_m_01_02_03_finish);
        edit_m_01_02_03_id = (EditText)findViewById(R.id.edit_m_01_02_03_id);
        edit_m_01_02_03_pw = (EditText)findViewById(R.id.edit_m_01_02_03_pw);
        edit_m_01_02_03_pw_confirm = (EditText)findViewById(R.id.edit_m_01_02_03_pw_confirm);
        btn_m_01_02_03_save = (Button)findViewById(R.id.btn_m_01_02_03_save);

        text_m_01_02_03_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        id_input = edit_m_01_02_03_id.getText().toString();
        password_input = edit_m_01_02_03_pw.getText().toString();
        password_confirm_input = edit_m_01_02_03_pw_confirm.getText().toString();

        btn_m_01_02_03_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), M_01_02_04.class);
                startActivity(intent);
            }
        });
    }
}