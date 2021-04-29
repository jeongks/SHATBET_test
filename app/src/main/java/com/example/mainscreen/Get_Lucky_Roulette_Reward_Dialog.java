package com.example.mainscreen;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

public class Get_Lucky_Roulette_Reward_Dialog extends Dialog {
    Activity activity;
    TextView text_total_shahbet_reward;
    AppCompatButton btn_confirm_reward_dialog;
    public Get_Lucky_Roulette_Reward_Dialog(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_lucky_roulette_reward_dialog);
        text_total_shahbet_reward = (TextView)findViewById(R.id.text_total_shahbet_reward);
        btn_confirm_reward_dialog = (AppCompatButton)findViewById(R.id.btn_confirm_reward_dialog);
        btn_confirm_reward_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity,M_01_01_03.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                activity.startActivity(intent);
            }
        });
    }
}
