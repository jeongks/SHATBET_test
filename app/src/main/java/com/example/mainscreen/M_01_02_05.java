package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class M_01_02_05 extends AppCompatActivity {
    TextView text_m_01_02_05_finish, text_m_01_02_05_my_code;
    EditText edit_m_01_02_05_reference;
    Button btn_m_01_02_05_reference, btn_m_01_02_05_copy, btn_m_01_02_05_share, btn_m_01_02_05_save;
    public String my_code;
    public String reference_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_02_05);
        text_m_01_02_05_finish = (TextView)findViewById(R.id.text_m_01_02_05_finish);
        text_m_01_02_05_my_code = (TextView)findViewById(R.id.text_m_01_02_05_my_code);
        edit_m_01_02_05_reference = (EditText)findViewById(R.id.edit_m_01_02_05_reference);
        btn_m_01_02_05_reference = (Button)findViewById(R.id.btn_m_01_02_05_reference);
        btn_m_01_02_05_copy = (Button)findViewById(R.id.btn_m_01_02_05_copy);
        btn_m_01_02_05_share = (Button)findViewById(R.id.btn_m_01_02_05_share);
        btn_m_01_02_05_save =(Button)findViewById(R.id.btn_m_01_02_05_save);

        text_m_01_02_05_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        my_code = text_m_01_02_05_my_code.getText().toString();

        reference_code = edit_m_01_02_05_reference.getText().toString();
        btn_m_01_02_05_reference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: 데이터베이스에서 추천인코드를 검색해서 입력된 추천인코드의 유효성을 검사함
                /*
                    reference_code.equals(reference_data)? Dialog(입력됨): Dialog(유효하지 않음);
                * */
            }
        });

        btn_m_01_02_05_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("my code",my_code);
                clipboard.setPrimaryClip(clip);
            }
        });

        btn_m_01_02_05_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CompletedJoinDialog dialog = new CompletedJoinDialog(M_01_02_05.this);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

    }
}