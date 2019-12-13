package dsu;

import java.util.TreeSet;

public class Dsu {
    private Dsu parent;
    private TreeSet<Dsu> set;

    public Dsu() {
        set = new TreeSet<>();
        parent = this;
    }

    public void unionSets(Dsu x) {
        Dsu p1 = findSet();
        Dsu p2 = x.findSet();

        if (!p1.equals(p2))
            p2.parent = p1;
    }

    public Dsu findSet() {
        if (this.equals(parent))
            return this;
        else
            return parent.findSet();
    }
}
