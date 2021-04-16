package com.example.mainscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class M_01_01_03_Fragment_game_type_fragment extends Fragment {
    LinearLayout concrete_type, section_type, low_high_type;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_m_01_01_03__game_type_fragment, container, false);
        concrete_type = (LinearLayout)view.findViewById(R.id.concrete_type);
        section_type  = (LinearLayout)view.findViewById(R.id.section_type);
        low_high_type = (LinearLayout)view.findViewById(R.id.low_high_type);
        Fragment_M_02_02_game_concrete fragment_m_02_02_game_concrete = new Fragment_M_02_02_game_concrete();
        concrete_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameSetup(fragment_m_02_02_game_concrete);
            }
        });

        return view;
    }

    private void openGameSetup(Fragment fragment){
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.slide_up,R.anim.slide_down);
        transaction.add(R.id.fragment_game_frame_layout, fragment);
        transaction.commit();
    }

}