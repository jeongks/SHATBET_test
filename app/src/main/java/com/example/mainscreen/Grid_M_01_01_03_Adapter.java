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

public class Grid_M_01_01_03_Adapter extends ArrayAdapter<Grid_M_01_01_03_Model> {
    public Grid_M_01_01_03_Adapter(@NonNull Context context, ArrayList<Grid_M_01_01_03_Model> list) {
        super(context, 0,list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View list_item_view = convertView;
        if (list_item_view == null){
            list_item_view = LayoutInflater.from(getContext()).inflate(R.layout.grid_card_m_01_01_03, parent ,false);
        }
        Grid_M_01_01_03_Model model = getItem(position);
        TextView text_category = (TextView)list_item_view.findViewById(R.id.text_m_01_01_03_game_category);
        TextView text_type = (TextView)list_item_view.findViewById(R.id.text_m_01_01_03_game_type);
        ImageView brand = (ImageView)list_item_view.findViewById(R.id.iamge_m_01_01_03_brand);
        TextView text_brand_name = (TextView)list_item_view.findViewById(R.id.text_m_01_01_03_brand_name);
        TextView text_date = (TextView)list_item_view.findViewById(R.id.text_m_01_01_03_date);
        TextView text_price = (TextView)list_item_view.findViewById(R.id.text_m_01_01_03_price);
        text_category.setText(model.getCategory());
        text_type.setText(model.getType());
        brand.setImageResource(model.getBrand_id());
        text_brand_name.setText(model.getBrand_name());
        text_date.setText(model.getDate());
        text_price.setText(model.getPrice());
        return list_item_view;
    }
}
