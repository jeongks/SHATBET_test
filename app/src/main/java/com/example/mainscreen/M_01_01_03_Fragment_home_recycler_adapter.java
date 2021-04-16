package com.example.mainscreen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class M_01_01_03_Fragment_home_recycler_adapter extends RecyclerView.Adapter<M_01_01_03_Fragment_home_recycler_adapter.ViewHolder> {
    private String[] categories, types, brand_names, dates, prices;
    private byte[] brand_img_ids;
    private LayoutInflater inflater;
    private ItemClickListener listener;
    private ArrayList<Grid_M_01_01_03_Model> data;
/*
    public M_01_01_03_Fragment_home_recycler_adapter(Context context, String[] categories, String[] types, String[] brand_names, String[] dates, String[] prices, byte[] brand_img_ids){
        this.inflater = LayoutInflater.from(context);
        this.categories = categories;
        this.types = types;
        this.brand_names = brand_names;
        this.dates = dates;
        this.prices = prices;
        this.brand_img_ids = brand_img_ids;
    }
*/
    public M_01_01_03_Fragment_home_recycler_adapter(Context context, ArrayList<Grid_M_01_01_03_Model> data){
        this.inflater = LayoutInflater.from(context);
        this.data = data;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recyclerview_m_01_01_03_home,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.text_m_01_01_03_game_category.setText(categories[position]);
//        holder.text_m_01_01_03_game_type.setText(types[position]);
//        holder.text_m_01_01_03_brand_name.setText(brand_names[position]);
//        holder.text_m_01_01_03_date.setText(dates[position]);
//        holder.text_m_01_01_03_price.setText(prices[position]);
//        holder.image_m_01_01_03_brand.setImageResource(brand_img_ids[position]);
        holder.text_m_01_01_03_game_category.setText(data.get(position).getCategory());
        holder.text_m_01_01_03_game_type.setText(data.get(position).getType());
        holder.text_m_01_01_03_brand_name.setText(data.get(position).getBrandname());
        holder.text_m_01_01_03_date.setText(data.get(position).getDate());
        holder.text_m_01_01_03_price.setText(data.get(position).getPrice());
        //holder.image_m_01_01_03_brand.setImageBitmap(getBitmap(data.get(position).getBrandImg()));
    }
    private Bitmap getBitmap(byte[] data){
        Bitmap bitmap = BitmapFactory.decodeByteArray(data,0,data.length);
        return bitmap;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView text_m_01_01_03_game_category, text_m_01_01_03_game_type, text_m_01_01_03_brand_name, text_m_01_01_03_date, text_m_01_01_03_price;
        ImageView image_m_01_01_03_brand;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text_m_01_01_03_game_category = (TextView)itemView.findViewById(R.id.text_m_01_01_03_game_category);
            text_m_01_01_03_game_type = (TextView)itemView.findViewById(R.id.text_m_01_01_03_game_type);
            text_m_01_01_03_brand_name = (TextView)itemView.findViewById(R.id.text_m_01_01_03_brand_name);
            text_m_01_01_03_date = (TextView)itemView.findViewById(R.id.text_m_01_01_03_date);
            text_m_01_01_03_price = (TextView)itemView.findViewById(R.id.text_m_01_01_03_price);
            image_m_01_01_03_brand = (ImageView)itemView.findViewById(R.id.image_m_01_01_03_brand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(listener != null) listener.onItemClick(v, getAdapterPosition());
        }
    }
    public String getCategory(int index){
        return categories[index];
    }
    public String getType(int index){
        return categories[index];
    }
    public String getBrandName(int index){
        return brand_names[index];
    }
    public String getDate(int index){
        return dates[index];
    }
    public String getPrice(int index){
        return prices[index];
    }
    public int getBrandImageId(int index){
        return brand_img_ids[index];
    }

    public void setClickListener(ItemClickListener itemClickListener){
        this.listener = itemClickListener;
    }

    public interface ItemClickListener{
        void onItemClick(View view, int position);
    }
}
