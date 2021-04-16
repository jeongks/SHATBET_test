package com.example.mainscreen;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment_M_02_02_game_concrete extends Fragment {
    int shahbet_possess;
    int bet_amount_int;
    String bet_amount_str;
    TextView text_fragment_game_concrete_exit,text_concrete_selected_price,text_concrete_total_participant,text_concrete_total_shahbet;
    int[] increment_text_ids = {R.id.text_concrete_increment_1,R.id.text_concrete_increment_2,R.id.text_concrete_increment_3,R.id.text_concrete_increment_4,R.id.text_concrete_increment_5};
    int[] decrement_text_ids = {R.id.text_concrete_decrement_1,R.id.text_concrete_decrement_2,R.id.text_concrete_decrement_3,R.id.text_concrete_decrement_4,R.id.text_concrete_decrement_5};
    EditText edit_concrete_bet_amount;
    AppCompatButton btn_concrete_cancel_game, btn_concrete_bet_on_game;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_m_02_02_game_concrete, container, false);
        text_fragment_game_concrete_exit = (TextView)view.findViewById(R.id.text_fragment_game_concrete_exit);
        text_concrete_selected_price = (TextView)view.findViewById(R.id.text_concrete_selected_price);
        edit_concrete_bet_amount = (EditText)view.findViewById(R.id.edit_concrete_bet_amount);
        btn_concrete_cancel_game = (AppCompatButton)view.findViewById(R.id.btn_concrete_cancel_game);
        btn_concrete_bet_on_game = (AppCompatButton)view.findViewById(R.id.btn_concrete_bet_on_game);
        shahbet_possess = 1000;
        edit_concrete_bet_amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                bet_amount_str = edit_concrete_bet_amount.getText().toString();
                try{
                    bet_amount_int = Integer.parseInt(bet_amount_str);
                }catch (Exception e){

                }
            }
        });


        btn_concrete_cancel_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), M_01_01_03.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        btn_concrete_bet_on_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bet_amount_int > shahbet_possess){
                    Insufficient_Shahbet_Dialog dialog = new Insufficient_Shahbet_Dialog(getContext());
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog.show();
                } else {
                    Sufficient_Shahbet_Dialog dialog = new Sufficient_Shahbet_Dialog(getActivity());
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog.show();
                }
            }
        });
        return view;
    }
}