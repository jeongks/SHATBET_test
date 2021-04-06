package com.example.mainscreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class M_01_03_05_Fragment_pw extends Fragment {
    EditText edit_m_01_03_05_id, edit_m_01_03_05_name, edit_m_01_03_05_phone, edit_m_01_03_05_verification;
    Button btn_m_01_03_05_verify, btn_m_01_03_05_completed;

    public M_01_03_05_Fragment_pw() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_pw_m_01_03_05, container, false);
        edit_m_01_03_05_id = (EditText)root.findViewById(R.id.edit_m_01_03_05_id);
        edit_m_01_03_05_name = (EditText)root.findViewById(R.id.edit_m_01_03_05_name);
        edit_m_01_03_05_phone = (EditText)root.findViewById(R.id.edit_m_01_03_05_phone);
        edit_m_01_03_05_verification = (EditText)root.findViewById(R.id.edit_m_01_03_05_verification);
        btn_m_01_03_05_completed = (Button)root.findViewById(R.id.btn_m_01_03_05_completed);
        btn_m_01_03_05_verify = (Button)root.findViewById(R.id.btn_m_01_03_05_verify);

        if( edit_m_01_03_05_name.getText().toString().trim().length() > 0 && edit_m_01_03_05_phone.getText().toString().trim().length() > 0){
            btn_m_01_03_05_verify.setEnabled(true);
        }

        btn_m_01_03_05_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //function to verify

                /*
                send verification code
                boolean isVerified = false;
                if (isVerified){
                    //button disappear
                }
                 */
            }
        });
        btn_m_01_03_05_completed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(root.getContext(),M_01_03_06.class);
            }
        });

        return root;
    }
}