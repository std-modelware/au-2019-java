package ru.au2019.java;

import java.util.ArrayList;

public class findVisitor implements Visitor {
    protected ArrayList<Elements> res = new ArrayList<Elements>();
    private String filename;

    public findVisitor(String filename) {
        this.filename = filename;
    }

    public void visit(Folder folder) {
        if (folder.getName() == filename) res.add(folder);
    }

    public void visit(File file) {
        if (file.getName() == filename) res.add(file);
    }
}
