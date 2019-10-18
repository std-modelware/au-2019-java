package com.academicuni.PetStore;

import com.academicuni.PetStore.items.AnimalItem;
import com.academicuni.PetStore.items.CageItem;
import com.academicuni.PetStore.items.FoodItem;
import com.academicuni.PetStore.items.Item;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<Worker> staff = new Vector<Worker>();
        staff.add(new Worker("Cordelia", "Beaumont", false));
        staff.add(new Worker("Iolo", "Nieves", true));
        staff.add(new Worker("Devonte", "Matthams", true));
        staff.add(new Worker("Jana", "Reilly", false));
        staff.add(new Worker("Ava", "Mccormick", false));
        staff.get(0).addSpeciality(Speciality.Cashier);
        staff.get(2).addSpeciality(Speciality.Cashier);
        staff.get(3).addSpeciality(Speciality.Cashier);
        staff.get(4).addSpeciality(Speciality.Cashier);
        staff.get(0).addSpeciality(Speciality.Consultant);
        staff.get(1).addSpeciality(Speciality.Consultant);
        staff.get(4).addSpeciality(Speciality.Consultant);
        StoreManager mng = new StoreManager(staff);
        Item it1 = new FoodItem(100, 10, "Cat");
        Item it2 = new FoodItem(15, 1, "Hamster");
        Item it3 = new CageItem(1000, 1, "Cat");
        Item it4 = new CageItem(500, 3, "Rat");
        Item it5 = new CageItem(200, 1, "Hamster");
        Item it6 = new CageItem(300, 2, "Hamster");

        Animal an1 = new Animal("Phodopus sungorus", "Hamster", "Hamster_1", true);
        Animal an2 = new Animal("Phodopus sungorus", "Hamster", "Hamster_2", false);
        Animal an3 = new Animal("Felis Catus", "Cat", "Tibbles", true);
        Animal an4 = new Animal("Felis Catus", "Cat", "Meower", true);
        Animal an5 = new Animal("Rattus rattus", "Rat", "Rat_1", true);
        Item it7 = new AnimalItem(300, an1);
        Item it8 = new AnimalItem(400, an2);
        Item it9 = new AnimalItem(3000, an3);
        Item it10 = new AnimalItem(2000, an4);
        Item it11 = new AnimalItem(500, an5);

        mng.addItem(it1);
        mng.addItem(it2);
        mng.addItem(it3);
        mng.addItem(it4);
        mng.addItem(it5);
        mng.addItem(it6);
        mng.addItem(it7);
        mng.addItem(it8);
        mng.addItem(it9);
        mng.addItem(it10);
        mng.addItem(it11);

        Client cl1 = new Client(false, it1);
        Client cl2 = new Client(true);
        Client cl3 = new Client(true,  it5);
        Client cl4 = new Client(false, it2);

        mng.addClient(cl1);
        while (mng.hasClients()) {
            mng.serviceNextClient();
        }
        mng.addClient(cl2);
        mng.addClient(cl3);
        mng.addClient(cl4);
        while (mng.hasClients()) {
            mng.serviceNextClient();
        }
        return;
    }

}
