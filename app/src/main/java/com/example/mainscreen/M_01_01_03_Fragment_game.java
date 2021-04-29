package com.example.mainscreen;

import android.app.ActionBar;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class M_01_01_03_Fragment_game extends Fragment {
    ActionBar toolbar;
    LinearLayout lucky_roulette_event;
    // TODO: Rename parameter arguments, choose names that match

    public M_01_01_03_Fragment_game() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View game_view = inflater.inflate(R.layout.fragment_m_01_01_03__game, container, false);
        lucky_roulette_event = (LinearLayout)game_view.findViewById(R.id.lucky_roulette_event);
        lucky_roulette_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .add(R.id.lucky_roulette_event_frame_layout, new Fragment_lucky_roulette_event())
                        .commit();
            }
        });
        BottomNavigationView bottomNavigation = (BottomNavigationView)game_view.findViewById(R.id.bottom_navigation_game);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.market_price:
                        showFragment(R.id.m_01_01_03_fragment_game_frame_layout,new M_02_01_Game_Fragment_market_price());
                        return true;
                    case R.id.closing_price:
                        showFragment(R.id.m_01_01_03_fragment_game_frame_layout,new M_02_01_Game_Fragment_closing_price());
                        return true;
                    case R.id.high_price:
                        showFragment(R.id.m_01_01_03_fragment_game_frame_layout,new M_02_01_Game_Fragment_high_price());
                        return true;
                    case R.id.low_price:
                        showFragment(R.id.m_01_01_03_fragment_game_frame_layout,new M_02_01_Game_Fragment_low_price());
                        return true;
                    default:
                        return false;
                }
            }
        });
        return game_view;
    }

    private void showFragment(int view_id, Fragment fragment){
        getFragmentManager().beginTransaction()
                .replace(view_id, fragment)
                .commit();
    }
}