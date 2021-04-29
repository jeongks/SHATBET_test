package com.example.mainscreen;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;


public class Fragment_lucky_roulette_event extends Fragment {
    TextView text_lucky_roulette_total_shahbet, text_lucky_roulette_total_participant, text_count_down;
    AppCompatButton btn_join_lucky_roulette;
    CountDownTimer timer;
    int updated_participant_int, updated_shahbet_int;
    private static final long HOUR = 60*60*1000;
    private static final long MIN = 60*1000;
    private static final long SEC = 1000;
    Calendar calendar;
    long timeLeft;
    boolean isTimerOn, isParticipated;
    AlertDialog.Builder builder;
    public Fragment_lucky_roulette_event() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lucky_roulette_event, container, false);
        text_lucky_roulette_total_shahbet = (TextView)view.findViewById(R.id.text_lucky_roulette_total_shahbet);
        text_lucky_roulette_total_participant = (TextView)view.findViewById(R.id.text_lucky_roulette_total_participant);
        text_count_down= (TextView)view.findViewById(R.id.lucky_roulette_countdown);
        btn_join_lucky_roulette = (AppCompatButton)view.findViewById(R.id.btn_join_lucky_roulette);
        calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        timeLeft = calendar.getTimeInMillis() - System.currentTimeMillis();
        if (isTimerOn){
            cancelTimer();
        }
        countDownStart(timeLeft);
        builder = new AlertDialog.Builder(getContext());
        btn_join_lucky_roulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isParticipated){ // isParticipated의 정보가 저장되지 않으므로 화면 시작시 재설정됨. 데이터베이스에 isPartitipated의 값을 저장하여 계정당 1회만 참여가능하도록 제한 필요.

                    builder.setMessage("이미 참여한 이벤트입니다.")
                            .setCancelable(false)
                            .setNeutralButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(getActivity(), M_01_01_03.class);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                    startActivity(intent);
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                } else {
                    try {
                        if(text_lucky_roulette_total_shahbet.getText().toString().equals("")){
                            text_lucky_roulette_total_shahbet.setText("0");
                        }
                        if(text_lucky_roulette_total_participant.getText().toString().equals("")){
                            text_lucky_roulette_total_participant.setText("0");
                        }
                        updated_participant_int = Integer.parseInt(text_lucky_roulette_total_participant.getText().toString()) + 1;
                        updated_shahbet_int = Integer.parseInt(text_lucky_roulette_total_shahbet.getText().toString()) + 100;
                        text_lucky_roulette_total_participant.setText(updated_participant_int + "");
                        text_lucky_roulette_total_shahbet.setText(updated_shahbet_int + "");
                        isParticipated = true;
                    } catch (Exception e) {
                        Log.i("debug", e.getMessage());
                    }
                    builder.setMessage("참여 완료! 당첨을 기원합니다.")
                            .setCancelable(false)
                            .setNeutralButton("확인", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(getActivity(), M_01_01_03.class);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                    startActivity(intent);
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            }
        });
        
        return view;
    }
    private void countDownStart(long duration){
        timer = new CountDownTimer(duration, 1000){

            @Override
            public void onTick(long millisUntilFinished) {
                String count_down = String.format("%02d:", millisUntilFinished / (HOUR));
                count_down += String.format("%02d:",millisUntilFinished%HOUR/MIN);
                count_down += String.format("%02d",millisUntilFinished%HOUR%MIN/SEC);
                text_count_down.setText(count_down);
                isTimerOn = true;
            }

            @Override
            public void onFinish() {
                countDownStart(24*HOUR);
                selectPerson();
                isParticipated = false;
            }
        }.start();
    }

    private void cancelTimer(){
        timer.cancel();
        isTimerOn = false;
    }

    private void selectPerson(){
        int selected_id = (int)(Math.random() * updated_participant_int) +1; //배열을 사용할 경우 +1 없이 사용하여 selected_id가 index 값을 대채하게 할 수 있다.
        // selected_id를 사용하여 이벤트 당첨자를 선정할 수 있다.
        int participant_id = 4;
        if( selected_id == participant_id){
            Get_Lucky_Roulette_Reward_Dialog dialog = new Get_Lucky_Roulette_Reward_Dialog(getActivity());
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.show();
        }
    }
    @Override
    public void onStop() {
        super.onStop();
        cancelTimer();
    }
}