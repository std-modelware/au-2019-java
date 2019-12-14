package ru.au2019.java;

public interface Visitor {
    public void visit(Folder folder);
    public void visit(File file);
}
