package au2019;

import dsu.Graph;
import lhm.LinkedHashMapDemo;

public class Main {
    public static void main(String[] args) {
        LinkedHashMapDemo.demo();

        Graph g = Graph.randomGraph(15, 3, 10);

        g.print();
        System.out.println("-----");
        g.kruskal().print();
    }
}

