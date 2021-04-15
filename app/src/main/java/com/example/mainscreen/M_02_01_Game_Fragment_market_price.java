package com.example.mainscreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


public class M_02_01_Game_Fragment_market_price extends Fragment {
    ImageView img_ranking;
    ListView list_game_market_price;
    M_02_01_List_Game_Market_Price game_market_price;
    ArrayList<M_02_01_List_Game_Market_Price> game_market_price_list;
    M_02_01_List_Game_Market_Price_Adapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_m_02_01__game__market_price, container, false);
        list_game_market_price = (ListView)view.findViewById(R.id.list_game_market_price);
        img_ranking = (ImageView)view.findViewById(R.id.img_ranking);
        //todo: 데이터베이스에서 데이터를 가져와서 List_Game_Market_price 객체생성. 생성된 객체를 ArrayList에 추가. 완성된 ArrayList를 Adapter에 장착. ListView에 Adapter 장착
        game_market_price_list = new ArrayList<>();
        game_market_price = new M_02_01_List_Game_Market_Price(R.drawable.kakaogames,"카카오게임즈", "정가","50,000","5,000","150");
        game_market_price_list.add(game_market_price);
        adapter = new M_02_01_List_Game_Market_Price_Adapter(getContext(), game_market_price_list);
        list_game_market_price.setAdapter(adapter);
        registerForContextMenu(list_game_market_price);
        return view;
    }

    @Override
    public void onCreateContextMenu(@NonNull ContextMenu menu, @NonNull View v, @Nullable ContextMenu.ContextMenuInfo menuInfo) {
        if (v.getId() == R.id.list_game_market_price){
            ListView list_game_market_price = (ListView) v;
            AdapterView.AdapterContextMenuInfo acmi = (AdapterView.AdapterContextMenuInfo) menuInfo;
            M_02_01_List_Game_Market_Price game_market_price = (M_02_01_List_Game_Market_Price) list_game_market_price.getItemAtPosition(acmi.position);

            menu.add("정가 맞히기");
            menu.add("구간 맞히기");
            menu.add("로하이 맞히기");
            menu.add(game_market_price.getBrand_name());
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getTitle().toString()){
            case "정가 맞히기":
                Intent intent = new Intent(getActivity(), Fragment_test.class);
                startActivity(intent);
                return true;
            default:
                return false;
        }

    }
}