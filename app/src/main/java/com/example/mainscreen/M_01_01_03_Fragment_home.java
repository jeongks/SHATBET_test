package com.example.mainscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class M_01_01_03_Fragment_home extends Fragment {
    ArrayList<Grid_M_01_01_03_Model> arrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view_home = inflater.inflate(R.layout.fragment_m_01_01_03__home, container,false);
        RecyclerView horizontal_grid_view = (RecyclerView)view_home.findViewById(R.id.horizontal_grid_view);
        arrayList =new ArrayList<Grid_M_01_01_03_Model>();

       

        //database에 생성된 게임을 가져온다.
        //database에서 가져온 값들로 새로운 ArrayList를 생성해준다.

        addDataToList(arrayList);
        GridLayoutManager manager =new GridLayoutManager(getActivity(),2,GridLayoutManager.HORIZONTAL,false);
        horizontal_grid_view.setLayoutManager(manager);


        return view_home;
    }

    private void addDataToList(ArrayList<Grid_M_01_01_03_Model> list){
        //TODO: update querying from database
        //database에서 정보를 조회
        //조회된 정보를 각 String, String, byte[], String, String String 으로 저장
        //list.add(string, string, byte[], string, string, string);
    }
}