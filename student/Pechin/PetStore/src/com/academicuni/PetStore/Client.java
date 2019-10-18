package com.academicuni.PetStore;

import com.academicuni.PetStore.items.Item;

public class Client {
    private boolean needCons;
    private boolean wtb;
    private Item wtbItem;
    private Worker assignedWorker;
    public Client(boolean nc, Item wI ) {
        needCons = nc;
        wtb = true;
        wtbItem = wI;
    }
    public Client(boolean nc) {
        needCons = nc;
        wtb = false;
    }
    public void print(){
        System.out.print("Client that ");
        if (needCons) {
            System.out.print("needs consultation");
        }
        else {
            System.out.print("doesn't need consultation");
        }
        if (wtb) {
            System.out.print(" and want to buy ");
            wtbItem.print();
        }
        else {
            System.out.print("\n");
        }
    }
    public boolean isNeedCons() {
        return needCons;
    }
    public void addWorker(Worker w) {
        assignedWorker = w;
    }
    public Worker popWorker(){
        Worker w = assignedWorker;
        assignedWorker = null;
        return w;
    }
    Worker getAssignedWorker() {
        return assignedWorker;
    }
    void consult() {
        needCons = false;
    }
    void sellItem(){
        wtb = false;
    }
    boolean isWtb() {
        return wtb;
    }
    Item getWtbItem() {
        return wtbItem;
    }
}
