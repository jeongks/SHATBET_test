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
       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
           return inflater.inflate(R.layout.fragment_pw_m_01_03_05,container,false);
    }
}