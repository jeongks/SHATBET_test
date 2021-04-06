package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class M_01_01_01 extends AppCompatActivity {
    TextView text_m_01_01_01_hi;
    Button btn_m_01_01_01_login;
    ImageButton imgBtn_m_01_01_01_game, imgBtn_m_01_01_01_predict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_01_01);

        /*
        * 할일
        * M-01-01-01 화면 구현
        * m-01-01-02 화면 연결
        * m-01-01-03 화면 연결
        * m-03-01-01 화면 연결
        * */
        text_m_01_01_01_hi = (TextView)findViewById(R.id.text_m_01_01_01_hi);
        btn_m_01_01_01_login = (Button)findViewById(R.id.btn_m_01_01_01_login);
        imgBtn_m_01_01_01_game = (ImageButton)findViewById(R.id.imgBtn_m_01_01_01_game);
        imgBtn_m_01_01_01_predict = (ImageButton)findViewById(R.id.imgBtn_m_01_01_01_predict);

        btn_m_01_01_01_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), M_01_03_01.class);
                startActivity(intent);
            }
        });
    }
}