package ru.au2019.java;

import java.util.ArrayList;

public class Folder extends Elements {
    private ArrayList<Elements> elementsList = new ArrayList<>();

    public Folder(String name, Folder parent) {
        this.name = name;
        this.parent = parent;
        this.isFolder = true;
        String s = "New folder " + name + " was made in ";

        if (!(parent == null)) {
            parent.addElements(this);
            s += parent.getName();
        } else {
            s += "roots";
        }
        System.out.println(s);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public ArrayList<Elements> getElementsList() {
        return this.elementsList;
    }

    public void addElements(Elements e) {
        this.elementsList.add(e);
    }
}
