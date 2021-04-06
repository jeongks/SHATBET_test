package com.example.mainscreen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class M_01_03_02_Fragment_Id extends Fragment {
    EditText edit_m_01_03_02_name, edit_m_01_03_02_phone;
    Button btn_m_01_03_02_find_id;

    public M_01_03_02_Fragment_Id() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_id_m_01_03_02,container,false);
        edit_m_01_03_02_name = (EditText) root.findViewById(R.id.edit_m_01_03_02_name);
        edit_m_01_03_02_phone = (EditText)root.findViewById(R.id.edit_m_01_03_02_phone);
        btn_m_01_03_02_find_id = (Button) root.findViewById(R.id.btn_m_01_03_02_find_id);

        if (edit_m_01_03_02_phone.getText().toString().trim().length() >0 && edit_m_01_03_02_name.getText().toString().trim().length() >0){
            btn_m_01_03_02_find_id.setEnabled(true);
        }
        return root;
    }
}