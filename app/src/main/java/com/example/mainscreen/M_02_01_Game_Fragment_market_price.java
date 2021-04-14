package com.example.mainscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


public class M_02_01_Game_Fragment_market_price extends Fragment {
    ImageView img_ranking;
    ListView list_game_market_price;
    List_Game_Market_Price game_market_price;
    ArrayList<List_Game_Market_Price> game_market_price_list;
    List_Game_Market_Price_Adapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_m_02_01__game__market_price, container, false);
        list_game_market_price = (ListView)view.findViewById(R.id.list_game_market_price);
        img_ranking = (ImageView)view.findViewById(R.id.img_ranking);
        //todo: 데이터베이스에서 데이터를 가져와서 List_Game_Market_price 객체생성. 생성된 객체를 ArrayList에 추가. 완성된 ArrayList를 Adapter에 장착. ListView에 Adapter 장착
        /*
        adapter = new List_Game_Market_Price_Adapter(getContext(), game_market_price_list);
        list_game_market_price.setAdapter(adapter);
         */
        return view;
    }
}