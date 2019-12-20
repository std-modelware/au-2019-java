package VFS;

import java.util.ArrayList;

public class Folder extends Elements {
    private ArrayList<Elements> elementsList = new ArrayList<>();

    public Folder(String name, Folder parent) {
        this.name = name;
        this.parent = parent;
        String s = "New folder " + name + " was made in ";

        if (!(parent == null)) {
            parent.addFile(this);
            s += parent.getName();
        } else {
            s += "root";
        }
        System.out.println(s);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String toString() {
        return this.name;
    }

    public ArrayList<Elements> getElementsList() {
        return this.elementsList;
    }

    public void addFile(Elements e){
        this.elementsList.add(e);
    }

}
