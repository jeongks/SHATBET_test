package com.example.mainscreen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class M_01_03_02_Fragment_Id extends Fragment {
    EditText edit_m_01_03_02_name, edit_m_01_03_02_phone;
    Button btn_m_01_03_02_find_id;
    HashMap<String, String> usernamePhone;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View find_id = inflater.inflate(R.layout.fragment_id_m_01_03_02,container,false);
        edit_m_01_03_02_name = (EditText)find_id.findViewById(R.id.edit_m_01_03_02_name);
        edit_m_01_03_02_phone = (EditText)find_id.findViewById(R.id.edit_m_01_03_02_phone);
        btn_m_01_03_02_find_id = (Button)find_id.findViewById(R.id.btn_m_01_03_02_find_id);
        usernamePhone = new HashMap<>();
        addUsernamePhoneToHash();
        edit_m_01_03_02_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                /*if(edit_m_01_03_02_name.getText().toString().length()>0){
                    edit_m_01_03_02_phone.requestFocus();
                } else {
                    Toast.makeText(getContext(), "이름을 입력해주세요", Toast.LENGTH_SHORT).show();
                    edit_m_01_03_02_name.requestFocus();
                }*/
            }
        });
        edit_m_01_03_02_phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(edit_m_01_03_02_phone.getText().toString().length()>10){
                    btn_m_01_03_02_find_id.setEnabled(true);
                } /*else {
                    Toast.makeText(getContext(), "휴대폰번호를 입력해주세요", Toast.LENGTH_SHORT).show();
                    edit_m_01_03_02_phone.requestFocus();
                }*/
            }
        });

        btn_m_01_03_02_find_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usernamePhone.get(edit_m_01_03_02_name.getText().toString()).equals(edit_m_01_03_02_phone.getText().toString())){
                    //Dialog
                } else {
                    //Dialog
                }
            }
        });
        return find_id;
    }
    public void addUsernamePhoneToHash(){
        //TODO: update this method to bring the name and phone from table.
        /*
        * while(cursor.moveNext()){
        *   string name = cursor.getString(1);
        *   string phone = cursor.getString(2)l
        *   usernamePhone.put(name,phone);
        * }
        * */
        //name 과 phone 변수는 데이터베이스에서 가져온 값이여야함. 테스트를 위하여 임의로 입력
        String name = "asdf";
        String phone = "11122223333";
        usernamePhone.put(name,phone);
    }
}