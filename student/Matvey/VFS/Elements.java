package VFS;

import java.util.ArrayList;

abstract class Elements {
    protected String name;
    protected Folder parent;

    public abstract void accept(Visitor v);

    public String getName() {
        return this.name;
    }


    public Folder getParent() {
        return this.parent;
    }

    //innovations
    public String getFullName(){
        if (this.parent==null)
            return "Root://" + this.name;
        return this.parent.getFullName() + "/" + this.name;
    }
}
