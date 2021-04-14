package com.example.mainscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

public class List_Game_Market_Price_Adapter extends ArrayAdapter<List_Game_Market_Price> {

    public List_Game_Market_Price_Adapter(@NonNull Context context, ArrayList<List_Game_Market_Price> lists) {
        super(context,0, lists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        List_Game_Market_Price list_market_price = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_game_market_price,parent,false);
        }
        ImageView img_game_market_price_brand = (ImageView)convertView.findViewById(R.id.img_game_market_price_brand);
        TextView text_game_market_price_brand = (TextView)convertView.findViewById(R.id.text_game_market_price_brand);
        TextView text_game_market_price_type = (TextView)convertView.findViewById(R.id.text_game_market_price_type);
        TextView text_game_market_price_price = (TextView)convertView.findViewById(R.id.text_game_market_price_price);
        TextView text_game_market_price_shahbet_amount = (TextView)convertView.findViewById(R.id.text_game_market_price_shahbet_amount);
        TextView text_game_market_price_total_participant = (TextView)convertView.findViewById(R.id.text_game_market_price_total_participant);

        img_game_market_price_brand.setImageResource(list_market_price.getBrand_image());
        text_game_market_price_brand.setText(list_market_price.getBrand_name());
        text_game_market_price_type.setText(list_market_price.getGame_type());
        text_game_market_price_price.setText(list_market_price.getPrice());
        text_game_market_price_shahbet_amount.setText(list_market_price.getShahbet_amount());
        text_game_market_price_total_participant.setText(list_market_price.getTotal_participant());
        return convertView;
    }
}
