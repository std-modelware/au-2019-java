package com.academicuni.PetStore.items;

import com.academicuni.PetStore.Animal;
import com.academicuni.PetStore.items.Item;
import com.academicuni.PetStore.items.ItemType;

public class AnimalItem extends Item {
    protected Animal animal;
    public AnimalItem(int p, Animal an){
        super(p);
        animal = an;
    }
    public void print(){
        System.out.println(animal.getShortName() + " of price: "  + price);
    }
    public String getSpecies(){
        return animal.getSpecies();
    }
    public String  getShortName(){
        return animal.getShortName();
    }
    public String getName(){
        return animal.getName();
    }
    public boolean getGender(){
        return animal.getGender();
    }
    public ItemType getType() {return com.academicuni.PetStore.items.ItemType.AnimalItem; }
}
