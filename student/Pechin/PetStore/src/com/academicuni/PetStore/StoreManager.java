package com.academicuni.PetStore;

import com.academicuni.PetStore.items.AnimalItem;
import com.academicuni.PetStore.items.CageItem;
import com.academicuni.PetStore.items.Item;
import com.academicuni.PetStore.items.ItemType;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class StoreManager {
    private Vector<Worker> staff;
    private Vector<Item> items;
    private LinkedList<Client> clients;
    private int profit = 0;
    public StoreManager(Vector<Worker> st) {
        staff = st;
        items = new Vector<Item>();
        clients = new LinkedList<Client>();
    }
    public void addItem(Item it){
        if (it.getType() == ItemType.AnimalItem) {
            AnimalItem ait = (AnimalItem) it;
            for (Item iit : items) {
                if (iit.getType() == ItemType.CageItem) {
                    CageItem cit = (CageItem) iit;
                    if (cit.addAnimal(ait)){
                        System.out.print("Found a cage for animal ");
                        ait.print();
                        return;
                    }
                }
            }
            System.out.println("Cannot find suitable cage for that animal");
        }
        else {
            items.add(it);
            System.out.print("Added item: ");
            it.print();
        }
    }
    public void sellItem(Item it){
        for (Item iit : items) {
            if (iit == it) {
                items.remove(it);
                profit += it.getPrice();
                System.out.print("Sold item: ");
                it.print();
                return;
            }
        }
    }
    public boolean checkItem(Item it) {
        for (Item iit : items) {
            if (iit == it) {
                return true;
            }
        }
        return false;
    }
    public Worker assignWorker(Speciality s) {
        for (Worker w : staff) {
            if (w.isFree() && w.checkSpeciality(s)){
                w.assign();
                return w;
            }
        }
        System.out.println("Cannot find necessary worker");
        return null;
    }

    public void addClient(Client c){
        c.print();
        clients.add(c);
    }
    public void serviceNextClient(){
        Client c = clients.remove();
        Worker w;
        if (c.getAssignedWorker() != null) {
            c.popWorker().unassign();
        }
        if (c.isNeedCons()) {
            w = assignWorker(Speciality.Consultant);
            if (w != null) {
                c.addWorker(w);
                c.consult();
                clients.add(c);
            }
            else {
                System.out.println("Client left because he wasn't consulted in time");
            }
        }
        else if (c.isWtb()) {
            if (checkItem(c.getWtbItem())) {
                w = assignWorker(Speciality.Cashier);
                if (w != null) {
                    c.addWorker(w);
                    sellItem(c.getWtbItem());
                    c.sellItem();
                    clients.add(c);
                }
                else{
                    System.out.println( "Client left because his item wasn't sold in time" );
                }
            }
        }
    }
    public boolean hasClients() {
        return clients.size() > 0;
    }
}
