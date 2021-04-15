package com.example.mainscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class M_01_01_03_Fragment_home extends Fragment implements M_01_01_03_Fragment_home_recycler_adapter.ItemClickListener {
    ArrayList<Grid_M_01_01_03_Model> data;
    M_01_01_03_Fragment_home_recycler_adapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view_home = inflater.inflate(R.layout.fragment_m_01_01_03__home, container,false);
        RecyclerView horizontal_grid_view = (RecyclerView)view_home.findViewById(R.id.horizontal_grid_view);
        data =new ArrayList<Grid_M_01_01_03_Model>();

       

        //database에 생성된 게임을 가져온다.
        //database에서 가져온 값들로 배열들을 생성해준다. 게임 카테고리 배열, 게임 종류 배열, 브랜드상표 배열, 브랜드이름 배열, 날짜 배열, 가격 배열
        addDataToList(data);
        int column_number = data.size();
        horizontal_grid_view.setLayoutManager(new GridLayoutManager(getContext(),column_number / 2));
        adapter = new M_01_01_03_Fragment_home_recycler_adapter(getContext(), data);
        adapter.setClickListener(this);
        horizontal_grid_view.setAdapter(adapter);




        return view_home;
    }

    private void addDataToList(ArrayList<Grid_M_01_01_03_Model> list){
        //TODO: update querying from database
        //database에서 정보를 조회
        //조회된 정보를 각 String, String, byte[], String, String String 으로 저장
        //list.add(string, string, byte[], string, string, string);
        list.add(new Grid_M_01_01_03_Model("시가","정가","카카오게임즈","2020.10.13","50,000"));
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}