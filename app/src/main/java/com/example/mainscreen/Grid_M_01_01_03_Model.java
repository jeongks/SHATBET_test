package com.example.mainscreen;

public class Grid_M_01_01_03_Model {
    private String category;
    private String type;
    private byte[] brandImg;
    private String brandname;
    private String date;
    private String price;

    public Grid_M_01_01_03_Model(String category, String type,byte[] brandImg, String brandname, String date, String price){
        this.category = category;
        this.type = type;
        this.brandImg = brandImg;
        this.brandname = brandname;
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

    public byte[] getBrandImg() {
        return brandImg;
    }

    public void setBrandImg(byte[] brandImg) {
        this.brandImg = brandImg;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
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
