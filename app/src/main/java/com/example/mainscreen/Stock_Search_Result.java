package com.example.mainscreen;

public class Stock_Search_Result {
    private int stockNumber;
    private String stockName;

    public Stock_Search_Result(int stockNumber, String stockName){
        this.stockNumber = stockNumber;
        this.stockName = stockName;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
