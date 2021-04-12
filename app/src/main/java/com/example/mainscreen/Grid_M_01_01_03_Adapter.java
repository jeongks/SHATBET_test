package com.example.mainscreen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Grid_M_01_01_03_Adapter extends RecyclerView.Adapter {
    ArrayList<Grid_M_01_01_03_Model> values;
    Context context;
    protected ItemListener itemListener;
    public Grid_M_01_01_03_Adapter(Context context, ArrayList values, ItemListener itemListener){
        this.values = values;
        this.context = context;
        this.itemListener = itemListener;
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView text_m_01_01_03_game_category, text_m_01_01_03_game_type, text_m_01_01_03_brand_name, text_m_01_01_03_date, text_m_01_01_03_price;
        public ImageView image_m_01_01_03_brand;
        public LinearLayout card_linearLayout_outer;
        Grid_M_01_01_03_Model item;

        public ViewHolder(View v){
            super(v);
            v.setOnClickListener(this);
            text_m_01_01_03_game_category = (TextView)v.findViewById(R.id.text_m_01_01_03_game_category);
            text_m_01_01_03_game_type = (TextView)v.findViewById(R.id.text_m_01_01_03_game_type);
            text_m_01_01_03_brand_name = (TextView)v.findViewById(R.id.text_m_01_01_03_brand_name);
            text_m_01_01_03_date = (TextView)v.findViewById(R.id.text_m_01_01_03_date);
            text_m_01_01_03_price = (TextView)v.findViewById(R.id.text_m_01_01_03_price);
            image_m_01_01_03_brand = (ImageView)v.findViewById(R.id.image_m_01_01_03_brand);
            card_linearLayout_outer = (LinearLayout)v.findViewById(R.id.card_linearLayout_outer);
        }
        public void setData(Grid_M_01_01_03_Model item){
            this.item = item;
            text_m_01_01_03_game_category.setText(item.getCategory());
            text_m_01_01_03_game_type.setText(item.getType());
            text_m_01_01_03_brand_name.setText(item.getBrandname());
            text_m_01_01_03_price.setText(item.getPrice());
            text_m_01_01_03_date.setText(item.getDate());
            image_m_01_01_03_brand.setImageBitmap(getBitmap(item.getBrandImg()));
        }

        private Bitmap getBitmap(byte[] data){
            Bitmap bitmap = BitmapFactory.decodeByteArray(data,0,data.length);
            return bitmap;
        }

        @Override
        public void onClick(View v) {
            if(itemListener != null){
                itemListener.onItemClick(item);
            }
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.grid_card_m_01_01_03, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        onBindViewHolder((ViewHolder)holder,position);
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setData(values.get(position));
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public interface ItemListener{
        void onItemClick(Grid_M_01_01_03_Model item);
    }
}
