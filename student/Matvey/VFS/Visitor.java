package VFS;


public interface Visitor {
    public void visit(Folder folder);
    public void visit(File file);
}

