package com.academicuni.PetStore.items;

import com.academicuni.PetStore.items.Item;
import com.academicuni.PetStore.items.ItemType;

public class FoodItem extends Item {
    protected int weight;
    protected String canFeed;
    public FoodItem(int p, int w, String cF) {
        super(p);
        weight = w;
        canFeed = cF;
    }
    public void print(){
        System.out.println("Food item of weight " + weight + " and price: " + price + " for feeding " + canFeed);
    }
    public ItemType getType() {return com.academicuni.PetStore.items.ItemType.FoodItem; }
}
