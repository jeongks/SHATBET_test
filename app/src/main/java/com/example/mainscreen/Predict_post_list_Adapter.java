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

public class Predict_post_list_Adapter extends ArrayAdapter<Predict_post_model> {
    ArrayList<Predict_post_model> data;
    Context context;

    public Predict_post_list_Adapter(@NonNull Context context, ArrayList<Predict_post_model> data) {
        super(context, 0, data);
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Predict_post_model model = getItem(position);
        View view = convertView;
        if (convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.predict_post_model,null);
        }
        ImageView profile = (ImageView)view.findViewById(R.id.profile);
        ImageView level = (ImageView)view.findViewById(R.id.level);
        TextView title = (TextView)view.findViewById(R.id.title);
        TextView name = (TextView)view.findViewById(R.id.name);
        TextView dateTime = (TextView)view.findViewById(R.id.dateTime);
        TextView stock_name = (TextView)view.findViewById(R.id.stock_name);
        TextView post_title = (TextView)view.findViewById(R.id.post_title);
        TextView new_mark = (TextView)view.findViewById(R.id.new_mark);
        TextView text_number_of_chat = (TextView)view.findViewById(R.id.text_number_of_chat);
        TextView text_view_count = (TextView)view.findViewById(R.id.text_view_count);
        TextView text_recommend_count = (TextView)view.findViewById(R.id.text_recommend_count);

        //이미지는 데이터베이스에서 가져온 byte[]로 bitmap이용
        title.setText(model.getTitle());
        name.setText(model.getName());
        dateTime.setText(model.getDateTime());
        stock_name.setText(model.getStock_name());
        post_title.setText(model.getPost_title());
        text_number_of_chat.setText(model.getNumber_of_chat());
        text_view_count.setText(model.getView_count());
        text_recommend_count.setText(model.getRecommend_count());
        return view;
    }
}
