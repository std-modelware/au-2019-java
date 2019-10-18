package com.academicuni.PetStore.items;

import com.academicuni.PetStore.items.Item;
import com.academicuni.PetStore.items.ItemType;

import java.util.Vector;

public class CageItem extends Item {
    protected int capacity;
    protected int size;
    Vector<com.academicuni.PetStore.items.AnimalItem> animals;
    String animalType;
    public CageItem(int p, int c, String aT){
        super(p);
        size = 0;
        capacity = c;
        animals = new Vector<AnimalItem>();
        animalType = aT;
    }
    public int animalCount() {
        return animals.size();
    }

    public int fullPrice(){
        int p = getPrice();
        for (com.academicuni.PetStore.items.AnimalItem i : animals) {
            p += i.getPrice();
        }
        return p;
    }
    public void print() {
        System.out.println("A cage of price: " + price + " for " + animalType +
                " that contains " + animalCount() + " animals of total price " + fullPrice());
    }
    public ItemType getType() {return com.academicuni.PetStore.items.ItemType.CageItem; }
    public boolean addAnimal(com.academicuni.PetStore.items.AnimalItem a) {
        if (a.getShortName().equals(animalType) && size < capacity) {
            animals.add(a);
            size++;
            return true;
        }
        else {
            System.out.println("Cannot place that animal in this cage");
            return false;
        }
    }
}
