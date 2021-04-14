package com.example.mainscreen;

public class List_Game_Market_Price {
    private int brand_image;
    private String brand_name, game_type, price, shahbet_amount, total_participant;

    public List_Game_Market_Price(int brand_image,String brand_name, String game_type, String price, String shahbet_amount, String total_participant){
        this.brand_image = brand_image;
        this.brand_name = brand_name;
        this.game_type = game_type;
        this.price = price;
        this.shahbet_amount = shahbet_amount;
        this.total_participant = total_participant;
    }

    public int getBrand_image() {
        return brand_image;
    }

    public void setBrand_image(int brand_image) {
        this.brand_image = brand_image;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getGame_type() {
        return game_type;
    }

    public void setGame_type(String game_type) {
        this.game_type = game_type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getShahbet_amount() {
        return shahbet_amount;
    }

    public void setShahbet_amount(String shahbet_amount) {
        this.shahbet_amount = shahbet_amount;
    }

    public String getTotal_participant() {
        return total_participant;
    }

    public void setTotal_participant(String total_participant) {
        this.total_participant = total_participant;
    }
}
