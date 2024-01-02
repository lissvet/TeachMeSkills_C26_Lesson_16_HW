package com.teachmeskills.lesson16.task_5.util.order;

public class Order {

    private int price;
    private String productName;

    public Order(int price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setDescription(String description) {
        this.productName = description;
    }

}
