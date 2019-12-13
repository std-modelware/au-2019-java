package dsu;

import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Vector;

public class Graph {
    public static class Edge {
        int w;
        int v1, v2;
    }

    int v, e, w;
    Vector<Edge> edges;

    public Graph() {
        edges = new Vector<>();
        w = 0;
    }

    public static Graph randomGraph(int numVertices, int numEdges, int maxWeight) {
        Graph g = new Graph();
        g.v = numVertices;
        g.e = numEdges;

        for (int i = 0; i < numEdges; ++i) {
            Graph.Edge e = new Graph.Edge();
            Random r0 = new Random();
            do
                e.w = r0.nextInt(maxWeight);
            while(e.w == 0);
            g.w += e.w;
            Random r1 = new Random();
            e.v1 = r1.nextInt(numVertices);
            do {
                Random r2 = new Random();
                e.v2 = r2.nextInt(numVertices);
            } while(e.v1 == e.v2);
            g.edges.add(e);
        }

        return g;
    }

    public void print() {
        for (Edge e : edges)
            System.out.println("(" + e.v1 + ", " + e.v2 + "), w = " + e.w);
    }

    public Graph kruskal() {
        Graph g = new Graph();

        Vector<Dsu> dsus = new Vector<>();
        for(int i = 0; i < v; ++i)
            dsus.add(new Dsu());

        Comparator<Edge> comp = (Edge e1, Edge e2)->e1.w-e2.w;
        edges.sort(comp);

        for(Edge e : edges) {
            if(!dsus.get(e.v1).findSet().equals(dsus.get(e.v2).findSet())) {
                g.w += e.w;
                g.edges.add(e);
                dsus.get(e.v1).unionSets(dsus.get(e.v2));
            }
        }

        return g;
    }
}
