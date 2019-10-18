package com.academicuni.PetStore.items;

import com.academicuni.PetStore.items.ItemType;

public class Item {
    protected int price;
    public Item(int p){
        price = p;
    }
    public int getPrice(){
        return  price;
    }
    public void setPrice(int p){
        price = p;
    }
    public void print() {
        System.out.println("Item of price " + price);
    }
    public ItemType getType() {return com.academicuni.PetStore.items.ItemType.Item; }
}
