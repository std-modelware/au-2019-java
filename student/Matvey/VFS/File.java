package VFS;

public class File extends Elements {
    private long size;

    public File (String name, Folder parent, long size) {
        this.name = name;
        this.size = size;
        this.parent = parent;
        System.out.println("New file "+name+" was made in "+ parent);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String toString(){
        return this.name;
    }
}

