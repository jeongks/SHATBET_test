package com.example.mainscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class M_02_02_03_Fragment extends Fragment {
    ImageView brand_logo, high_low_arrow;
    TextView brand_name, game_type, current_price, total_participant, total_bet_shahbet;
    EditText bet_input;
    Button btn_cancel, btn_bet;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_m_02_02_03_, container, false);
        brand_logo = (ImageView)view.findViewById(R.id.img_brand_low_high);
        high_low_arrow = (ImageView)view.findViewById(R.id.img_low_high_arrow);
        brand_name = (TextView)view.findViewById(R.id.text_brand_name_low_high);
        game_type = (TextView)view.findViewById(R.id.text_high_type);
        current_price = (TextView)view.findViewById(R.id.text_high_price);
        total_participant = (TextView)view.findViewById(R.id.text_high_participant_total);
        total_bet_shahbet = (TextView)view.findViewById(R.id.text_high_total_shahbet);
        bet_input = (EditText)view.findViewById(R.id.edit_high_bet_amount);
        btn_cancel = (Button)view.findViewById(R.id.btn_high_cancel);
        btn_bet = (Button)view.findViewById(R.id.btn_high_bet);
        return view;
    }
}