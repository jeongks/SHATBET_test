package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class M_03_01_02 extends AppCompatActivity {
    EditText edit_search_stock,edit_post_context;
    ImageView img_search_stock, img_market_price_text, img_closing_price_text, img_high_price_text, img_low_price_text;
    AppCompatButton btn_add_game_predict, btn_cancel_post, btn_upload_post;
    TextView text_stock_name;
    ListView list_stock_list_from_search;
    ArrayList<Stock_Search_Result> dataList;
    Stock_search_result_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_03_01_02);
        edit_search_stock = (EditText)findViewById(R.id.edit_search_stock);
        edit_post_context = (EditText)findViewById(R.id.edit_search_stock);
        img_search_stock = (ImageView)findViewById(R.id.img_search_stock);
        img_market_price_text = (ImageView)findViewById(R.id.img_market_price_text);
        img_closing_price_text = (ImageView)findViewById(R.id.img_closing_price_text);
        img_high_price_text = (ImageView)findViewById(R.id.img_high_price_text);
        img_low_price_text = (ImageView)findViewById(R.id.img_low_price_text);
        btn_add_game_predict = (AppCompatButton)findViewById(R.id.btn_add_game_predict);
        btn_cancel_post = (AppCompatButton)findViewById(R.id.btn_cancel_post);
        btn_upload_post = (AppCompatButton)findViewById(R.id.btn_upload_post);
        text_stock_name = (TextView)findViewById(R.id.text_stock_name);
        list_stock_list_from_search = (ListView)findViewById(R.id.list_stock_list_from_search);
        //????????????????????? ????????? ????????? ???????????? ArrayList<StockSearchResult>??? ??????
        dataList = new ArrayList<Stock_Search_Result>();
        edit_search_stock.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //???????????????????????? ???????????? ???????????? ????????? ??????????????? ????????????
                dataList = getSearchResult(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        adapter = new Stock_search_result_adapter(this,dataList);
        list_stock_list_from_search.setAdapter(adapter);
        list_stock_list_from_search.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Stock_Search_Result model = dataList.get(position);
                text_stock_name.setText(model.getStockName());
            }
        });

    }

    private ArrayList<Stock_Search_Result> getSearchResult(String search){
        //??????????????? ???????????? dataList?????? search ???????????? contains??? ???????????? ???????????? ???????????? ?????? ????????? ????????? ArrayList??? ??????
        ArrayList<Stock_Search_Result> results = new ArrayList<>();
        //results.add()

        return results;
    }
}