package com.example.mainscreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class M_01_03_05_Fragment_pw extends Fragment {
    EditText edit_m_01_03_05_id, edit_m_01_03_05_name, edit_m_01_03_05_phone, edit_m_01_03_05_verification;
    Button btn_m_01_03_05_verify, btn_m_01_03_05_completed;
    boolean isVerificationSent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
           View find_pw =  inflater.inflate(R.layout.fragment_pw_m_01_03_05,container,false);
           edit_m_01_03_05_id = (EditText)find_pw.findViewById(R.id.edit_m_01_03_05_id);
           edit_m_01_03_05_name = (EditText)find_pw.findViewById(R.id.edit_m_01_03_05_name);
           edit_m_01_03_05_phone = (EditText)find_pw.findViewById(R.id.edit_m_01_03_05_phone);
           edit_m_01_03_05_verification = (EditText)find_pw.findViewById(R.id.edit_m_01_03_05_verification);
           btn_m_01_03_05_verify = (Button)find_pw.findViewById(R.id.btn_m_01_03_05_verify);
           btn_m_01_03_05_completed = (Button)find_pw.findViewById(R.id.btn_m_01_03_05_completed);
           isVerificationSent = false;
           edit_m_01_03_05_phone.addTextChangedListener(new TextWatcher() {
               @Override
               public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                   if(!(edit_m_01_03_05_id.getText().toString().length() > 0)){
                       Toast.makeText(getContext(), "아이디를 입력해주세요", Toast.LENGTH_SHORT).show();
                       edit_m_01_03_05_id.requestFocus();
                   }
                   if(!(edit_m_01_03_05_name.getText().toString().length()>0)){
                       Toast.makeText(getContext(), "성명을 입력해주세요", Toast.LENGTH_SHORT).show();
                       edit_m_01_03_05_name.requestFocus();
                   }
               }

               @Override
               public void onTextChanged(CharSequence s, int start, int before, int count) {

               }

               @Override
               public void afterTextChanged(Editable s) {
                    btn_m_01_03_05_verify.setEnabled(true);
               }
           });
           btn_m_01_03_05_verify.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   //인증번호 발송
                   isVerificationSent = true;
               }
           });
           edit_m_01_03_05_verification.addTextChangedListener(new TextWatcher() {
               @Override
               public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                   if (!isVerificationSent){
                       Toast.makeText(getContext(), "휴대폰번호를 입력한 후 인증번호 받기를 해주세요.", Toast.LENGTH_SHORT).show();
                       edit_m_01_03_05_phone.requestFocus();
                   }
               }

               @Override
               public void onTextChanged(CharSequence s, int start, int before, int count) {
                   //발송된 인증번호와 입력된 인증번호를 비교
                   String sentVerificationCode = "xxxxxx"; //Todo: 발송된 인증번호로 변경해줘야함. 테스트를 위해 임의의 값으로 지정.
                   if(sentVerificationCode.equals(edit_m_01_03_05_verification.getText().toString())){
                       btn_m_01_03_05_completed.setEnabled(true);
                       btn_m_01_03_05_verify.setVisibility(View.INVISIBLE);
                   } else {
                       if (count >= 6){
                           Toast.makeText(getContext(), "유효하지 않는 인증번호입니다. 다시 입력해주시거나 새로운 인증번호를 받아주세요.", Toast.LENGTH_SHORT).show();
                           //edit_m_01_03_05_verification.getText().clear();
                           edit_m_01_03_05_verification.requestFocus();
                           btn_m_01_03_05_verify.setVisibility(View.VISIBLE);
                       }

                   }
               }

               @Override
               public void afterTextChanged(Editable s) {


               }
           });

           btn_m_01_03_05_completed.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(getActivity(), M_01_03_06.class);
                   intent.putExtra("tabIndex",1);
                   startActivity(intent);
               }
           });
           return find_pw;
    }
}