package com.company;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    List<Item> itemList = new ArrayList<Item>();
    float money;

    public VendingMachine() {

    }

    public void addNewItem(Item type) {
        this.itemList.add(type);
    }

    public int getIndex(String itemName){
        int i;
        for(i=0; i<this.itemList.size();i++){
            if(itemName.equals(this.itemList.get(i).getName())){
                break;
            }
        }
        return i;
    }

    public void addItem(String itemName, int amount){
        int i = getIndex(itemName);
        this.itemList.get(i).setQuantity(itemList.get(i).getQuantity() + amount);
    }

    public void buyItem(String itemName, int amount) {
        int i = getIndex(itemName);
        this.money = this.money + amount * itemList.get(i).getPrice();
        itemList.get(i).setQuantity(itemList.get(i).getQuantity() - amount);
    }

    public float getMoney(){
        return this.money;
    }

    public void emptyMoney(){ this.money = 0;}

    public void getStock(){
        int num = this.itemList.size();
        for(int i=0; i<num; i++){
            System.out.println(this.itemList.get(i).getName() + ": " + this.itemList.get(i).getQuantity());
        }
    }
}