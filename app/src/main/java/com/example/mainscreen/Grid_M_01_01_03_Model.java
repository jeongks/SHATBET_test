package com.example.mainscreen;

public class Grid_M_01_01_03_Model {
    private String category;
    private String type;
    private int brand_id;
    private String brand_name;
    private String date;
    private String price;

    public Grid_M_01_01_03_Model(String category, String type, int brand_id, String brand_name, String date, String price){
        this.category = category;
        this.type = type;
        this.brand_id = brand_id;
        this.brand_name = brand_name;
        this.date = date;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
