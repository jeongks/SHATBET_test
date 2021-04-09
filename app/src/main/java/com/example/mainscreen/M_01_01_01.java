package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class M_01_01_01 extends AppCompatActivity {
    TextView text_m_01_01_01_hi;
    Button btn_m_01_01_01_login;
    ImageButton imgBtn_m_01_01_01_game, imgBtn_m_01_01_01_predict;
    String name, text_hi;
    private VelocityTracker velocityTracker = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_01_01_01);

        text_m_01_01_01_hi = (TextView)findViewById(R.id.text_m_01_01_01_hi);
        btn_m_01_01_01_login = (Button)findViewById(R.id.btn_m_01_01_01_login);
        imgBtn_m_01_01_01_game = (ImageButton)findViewById(R.id.imgBtn_m_01_01_01_game);
        imgBtn_m_01_01_01_predict = (ImageButton)findViewById(R.id.imgBtn_m_01_01_01_predict);

        btn_m_01_01_01_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), M_01_03_01.class);
                startActivity(intent);
            }
        });
        text_hi = String.format("반가워요, %s 님!", name);
        text_m_01_01_01_hi.setText(text_hi);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int index = event.getActionIndex();
        int action = MotionEventCompat.getActionMasked(event);
        int pointerID = event.getPointerId(index);
        switch(action){
            case MotionEvent.ACTION_DOWN:
                if (velocityTracker == null){
                    velocityTracker = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                velocityTracker.addMovement(event);
                break;
            case MotionEvent.ACTION_MOVE:
                velocityTracker.addMovement(event);
                velocityTracker.computeCurrentVelocity(500);
                Log.i("test","X velocity: "+velocityTracker.getXVelocity(pointerID));
                Log.i("test","Y velocity: "+velocityTracker.getYVelocity(pointerID));
                if (velocityTracker.getYVelocity(pointerID)<-1000){
                    Intent intent = new Intent(getApplicationContext(),M_01_01_03.class);
                    startActivity(intent);
                }
                break;
        }
        return true;
    }
}