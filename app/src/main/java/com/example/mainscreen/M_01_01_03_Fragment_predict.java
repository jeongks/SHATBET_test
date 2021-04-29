package com.example.mainscreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class M_01_01_03_Fragment_predict extends Fragment {
    TextView text_best_predict_post;
    ImageButton search, write, ranking;
    Spinner spinner;
    ListView listView;
    ArrayList<Predict_post_model> dataSet;
    ArrayList<String> best_post_list;
    int index;
    private Handler handler;
    public M_01_01_03_Fragment_predict() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handler = new Handler();
        index = 0;
        /*Todo: 데이터 베이스에서 베스트 글을 가져와서 best_post_list에 추가해야함. 추가시 post_title과 stock_name을 합쳐서 하나의 String으로 만들어서 추가함.
            예) [삼성전자] , 테슬러-삼성전자 파트너 급등 신호탄!! -> [삼성전자]테슬러-삼성전자 파트너 급등 신호탄!!
         */
        //테스트용
        best_post_list = new ArrayList<>();
        best_post_list.add("[삼성전자]테슬러-삼성전자 파트너 급등 신호탄!!");
        best_post_list.add("[slkn]eskfnslenfkalk");
        best_post_list.add("[eroreknl]slanefaknsflksenfalksnef");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_m_01_01_03__predict, container, false);

        text_best_predict_post = (TextView)view.findViewById(R.id.text_best_predict_post);
        startChanging();
        search = (ImageButton)view.findViewById(R.id.search_post);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: 클릭시 M-03-03-01 게시글 검색 화면으로 이동
            }
        });
        write = (ImageButton)view.findViewById(R.id.write_post);
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: move to M-03-01-02
            }
        });
        ranking = (ImageButton)view.findViewById(R.id.ranking);
        ranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: move to M-03-01-04
            }
        });
        spinner = (Spinner)view.findViewById(R.id.sorting_predict_spinner);
        listView = (ListView)view.findViewById(R.id.list_predict_posts);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //선택한 항목에 따라 ListView에 보여지는 정보 수정
                switch(parent.getItemAtPosition(position).toString()){
                    case "최신순":
                        //TODO: listview를 서버에 등록된 시간순으로 정렬. DECS
                        break;
                    case "인기순":
                        //TODO: listview를 서버에 등록된 인기도에 따라 정렬. DECS * 인기도 관련 공식 필요.
                        break;
                    case "조회순":
                        //TODO: listview를 서버에 등록된 조회수에 따라 내림차수 정렬
                        break;
                    case "댓글순":
                        //TODO: listview를 서버에 동록된 댓글수에 따라 내림차수 정렬
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource(getContext(),R.array.spinner_predict, android.R.layout.simple_spinner_dropdown_item);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinner_adapter);
        dataSet = new ArrayList<>();
        //TODO: 데이터베이스에서 정보를 가져와서 dataSet에 추가
        Predict_post_list_Adapter adapter = new Predict_post_list_Adapter(getContext(), dataSet);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(),M_03_01_02.class);
                startActivity(intent);
            }
        });
        return view;
    }

    private void startChanging(){
        handler.post(run);
    }

    private Runnable run = new Runnable() {
        @Override
        public void run() {
            //ToDo: 베스트 게시물을 배열에 담아서 1초당 배열의 인덱스를 index 변수 증가를 통해 증가. n개의 게시물을 표기할경우 index%n으로 n 번째까지의 게시물을 반복적으로 display
            index++;
            index = index % best_post_list.size();
            text_best_predict_post.setText(best_post_list.get(index));
            handler.postDelayed(this,1000);
        }
    };

    @Override
    public void onStop() {
        super.onStop();
        handler.removeCallbacks(run);
    }
}