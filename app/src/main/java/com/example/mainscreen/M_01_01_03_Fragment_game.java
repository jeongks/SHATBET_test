package com.example.mainscreen;

import android.app.ActionBar;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class M_01_01_03_Fragment_game extends Fragment {
    ActionBar toolbar;
    // TODO: Rename parameter arguments, choose names that match

    public M_01_01_03_Fragment_game() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View game_view = inflater.inflate(R.layout.fragment_m_01_01_03__game, container, false);
        BottomNavigationView bottomNavigation = (BottomNavigationView)game_view.findViewById(R.id.bottom_navigation_game);
        return game_view;
    }
}