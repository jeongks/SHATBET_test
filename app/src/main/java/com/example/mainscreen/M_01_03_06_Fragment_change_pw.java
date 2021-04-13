package com.example.mainscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class M_01_03_06_Fragment_change_pw extends Fragment {
    EditText edit_m_01_03_06_reset_pw,edit_m_01_03_06_confirm_pw;
    TextView text_m_01_03_06_pw_msg, text_m_01_03_06_pw_confirm_msg;
    Button btn_m_01_03_06_delete_reset, btn_m_01_03_06_delete_confirm, btn_m_01_03_06_change_complete;
    boolean isResetPWEmpty, isConfirmPWEmpty;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View change_pw = inflater.inflate(R.layout.fragment_m_01_03_06__change_pw, container, false);
        edit_m_01_03_06_reset_pw = (EditText)change_pw.findViewById(R.id.edit_m_01_03_06_reset_pw);
        edit_m_01_03_06_confirm_pw = (EditText)change_pw.findViewById(R.id.edit_m_01_03_06_confirm_pw);
        text_m_01_03_06_pw_msg = (TextView)change_pw.findViewById(R.id.text_m_01_03_06_pw_msg);
        text_m_01_03_06_pw_confirm_msg = (TextView)change_pw.findViewById(R.id.text_m_01_03_06_pw_confirm_msg);
        btn_m_01_03_06_delete_reset = (Button)change_pw.findViewById(R.id.btn_m_01_03_06_delete_reset);
        btn_m_01_03_06_delete_confirm = (Button)change_pw.findViewById(R.id.btn_m_01_03_06_delete_confirm);
        btn_m_01_03_06_change_complete = (Button)change_pw.findViewById(R.id.btn_m_01_03_06_change_complete);
        btn_m_01_03_06_delete_reset.setVisibility(View.INVISIBLE);
        btn_m_01_03_06_delete_confirm.setVisibility(View.INVISIBLE);
        isResetPWEmpty =true;
        isConfirmPWEmpty = true;
        edit_m_01_03_06_reset_pw.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                btn_m_01_03_06_delete_reset.setVisibility(View.VISIBLE);
                text_m_01_03_06_pw_msg.setVisibility(View.INVISIBLE);
                isResetPWEmpty =false;
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        edit_m_01_03_06_confirm_pw.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                btn_m_01_03_06_delete_confirm.setVisibility(View.VISIBLE);
                isConfirmPWEmpty = false;
                if(edit_m_01_03_06_reset_pw.getText().toString().equals(s.toString())&&edit_m_01_03_06_reset_pw.getText().toString().length() >=10){
                    text_m_01_03_06_pw_confirm_msg.setVisibility(View.INVISIBLE);
                    btn_m_01_03_06_change_complete.setEnabled(true);
                } else {
                    text_m_01_03_06_pw_confirm_msg.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        btn_m_01_03_06_delete_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_m_01_03_06_reset_pw.getText().clear();
            }
        });
        if(!isConfirmPWEmpty && !isResetPWEmpty){
            btn_m_01_03_06_change_complete.setEnabled(true);
        }
        btn_m_01_03_06_delete_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_m_01_03_06_confirm_pw.getText().clear();
            }
        });
        btn_m_01_03_06_change_complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Dialog
            }
        });
        return change_pw;
    }
}