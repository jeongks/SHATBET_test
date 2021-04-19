package com.example.mainscreen;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment_lucky_roulette_event extends Fragment {
    TextView text_lucky_roulette_total_shahbet, text_lucky_roulette_total_participant, text_count_down;
    AppCompatButton btn_join_lucky_roulette;
    CountDownTimer timer;
    int updated_participant_int, updated_shahbet_int;
    private static final long HOUR = 60*60*1000;
    private static final long MIN = 60*1000;
    private static final long SEC = 1000;
    public Fragment_lucky_roulette_event() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lucky_roulette_event, container, false);
        text_lucky_roulette_total_shahbet = (TextView)view.findViewById(R.id.text_lucky_roulette_total_shahbet);
        text_lucky_roulette_total_participant = (TextView)view.findViewById(R.id.text_lucky_roulette_total_participant);
        text_count_down= (TextView)view.findViewById(R.id.text_count_down);
        btn_join_lucky_roulette = (AppCompatButton)view.findViewById(R.id.btn_join_lucky_roulette);
        countDownStart(24*HOUR);
        btn_join_lucky_roulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    updated_participant_int = Integer.parseInt(text_lucky_roulette_total_participant.getText().toString()) + 1;
                    updated_shahbet_int = Integer.parseInt(text_lucky_roulette_total_shahbet.getText().toString())+100;
                    text_lucky_roulette_total_participant.setText(updated_participant_int+"");
                    text_lucky_roulette_total_shahbet.setText(updated_shahbet_int+"");
                } catch (Exception e){
                    Log.i("debug",e.getMessage());
                }
            }
        });
        
        return view;
    }
    private void countDownStart(long duration){
        new CountDownTimer(duration, 1000){

            @Override
            public void onTick(long millisUntilFinished) {
                String count_down = millisUntilFinished / (HOUR) + ":";
                count_down += millisUntilFinished%HOUR/MIN+":";
                count_down += millisUntilFinished%HOUR%MIN/SEC+"";
                text_count_down.setText(count_down);
            }

            @Override
            public void onFinish() {
                int id_
            }
        };
    }

    @Override
    public void onStop() {
        super.onStop();
        timer.cancel();
    }
}