package com.example.mainscreen;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Not_Found_ID_Dialog extends Dialog {
    public Activity activity;
    public Button confirm;

    public Not_Found_ID_Dialog(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.completed_find_id);
        confirm = (Button)findViewById(R.id.btn_confirm_found_id);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity,M_01_03_02.class);
                activity.startActivity(intent);
            }
        });
    }
}
