package ru.au2019.java;

public class File extends Elements {
    private int size;

    public File (String name, Folder parent, int size) {
        this.name = name;
        this.size = size;
        this.parent = parent;
        this.isFolder = false;
        parent.addElements(this);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

}
