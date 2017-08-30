package com.company;

public class Item {

    String name;
    int quantity;
    float price;

    public Item(String name, int quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}