package com.example.mainscreen;

public class Predict_post_model {
    String title,name,dateTime,post_title,stock_name, view_count, recommend_count, number_of_chat;
    public Predict_post_model(String title, String name, String dateTime, String post_title,String stock_name, String view_count, String recommend_count, String number_of_chat){
        this.title = title;
        this.name = name;
        this.dateTime = dateTime;
        this.post_title = post_title;
        this.stock_name = stock_name;
        this.view_count = view_count;
        this.recommend_count = recommend_count;
        this.number_of_chat = number_of_chat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public String getView_count() {
        return view_count;
    }

    public void setView_count(String view_count) {
        this.view_count = view_count;
    }

    public String getRecommend_count() {
        return recommend_count;
    }

    public void setRecommend_count(String recommend_count) {
        this.recommend_count = recommend_count;
    }

    public String getNumber_of_chat() {
        return number_of_chat;
    }

    public void setNumber_of_chat(String number_of_chat) {
        this.number_of_chat = number_of_chat;
    }
}
