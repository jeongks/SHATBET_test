package com.example.mainscreen;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class Stock_search_result_adapter extends ArrayAdapter<Stock_Search_Result>  {
    ArrayList<Stock_Search_Result> data;
    ArrayList<Integer> btn_ids;
    Context context;
    RadioGroup radioGroup;
    public Stock_search_result_adapter(@NonNull Context context, ArrayList<Stock_Search_Result> data) {
        super(context, 0, data);
        this.context = context;
        this.data = data;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if( convertView ==null ){
            view = LayoutInflater.from(context).inflate(R.layout.stock_search_result,null);
        }
        radioGroup = (RadioGroup)view.findViewById(R.id.stock_list_radio_group);
        RadioGroup.LayoutParams group_param = new RadioGroup.LayoutParams(RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.WRAP_CONTENT);
        btn_ids = new ArrayList<>();
        for (int i =0; i<data.size();i++){
            LinearLayout linearLayout = new LinearLayout(getContext());
            LinearLayout.LayoutParams linear_param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setText(data.get(i).getStockNumber());
            int btn_id = view.generateViewId();
            btn_ids.add(btn_id);
            radioButton.setId(btn_id);
            radioButton.callOnClick();
            TextView textView = new TextView(getContext());
            textView.setText(data.get(i).getStockName());
            textView.setTextColor(ContextCompat.getColor(getContext(),R.color.stock_name));
            LinearLayout.LayoutParams linear_param_text = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            linear_param_text.setMargins(10,0,0,0);
            linearLayout.addView(radioButton,linear_param);
            linearLayout.addView(textView,linear_param_text);
            radioGroup.addView(linearLayout,group_param);
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                View radiobutton = radioGroup.findViewById(checkedId);
                int index = radioGroup.indexOfChild(radiobutton);
            }
        });
        return view;
    }


}
