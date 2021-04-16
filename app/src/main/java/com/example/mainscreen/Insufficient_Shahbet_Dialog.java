package com.example.mainscreen;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;

public class Insufficient_Shahbet_Dialog extends Dialog {
    AppCompatButton insufficient_button;

    public Insufficient_Shahbet_Dialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insufficient_shahbet_dialog);
        insufficient_button = (AppCompatButton)findViewById(R.id.insufficient_button);
        insufficient_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
