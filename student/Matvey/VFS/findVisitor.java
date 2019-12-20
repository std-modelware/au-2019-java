package VFS;

import java.util.ArrayList;

public class findVisitor implements Visitor {
    public ArrayList<Elements> res;
    private String filename;

    public findVisitor(String filename) {
        this.filename = filename;
        this.res = new ArrayList<>();
    }

    public void visit(Folder folder) {
        if (folder.getName().equals(filename)) res.add(folder);
    }

    public void visit(File file) {
        if (file.getName().equals(filename)) res.add(file);
    }
}

