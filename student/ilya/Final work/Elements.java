package ru.au2019.java;

import java.util.ArrayList;

abstract class Elements {
    protected String name;
    protected Folder parent;
    protected boolean isFolder;

    public abstract void accept(Visitor v);

    public String getName() {
        return this.name;
    }

    public Folder getParent() {
        return this.parent;
    }

    public String toString() { return this.name; }
}
