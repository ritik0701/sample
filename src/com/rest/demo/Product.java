package com.rest.demo;

public class Product
{
    private String prodId;
    private String prodName;
    private String category;
    private int price;
    
    public Product()
    {
        super();
    }
    
    public Product(String prodId, String prodName, String category, int price) {
        super();
        this.prodId = prodId;
        this.prodName = prodName;
        this.category = category;
        this.price = price;
    }

 

 

    public String getProdId() {
        return prodId;
    }
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}