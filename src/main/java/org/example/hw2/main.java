package org.example.hw2;

import org.example.hw2.model.GeneratorBaseNotebook;
import org.example.hw2.model.Market;
import org.example.hw2.model.Notebook;

public class main {
    public static void main(String[] args) {
        Notebook n1 = new Notebook("модель1", 1000, 500, "винда", "синий");
        Notebook n2 = new Notebook("модель2", 1000, 500, "линукс", "красный");
        n1.getRamSize();
        System.out.println(n1.toString());
        System.out.println(n2.toString());

        GeneratorBaseNotebook base = new GeneratorBaseNotebook(10);
        System.out.println(base.toString());

        Market m1 = new Market(5);

        m1.addToMarket(11, n1);
        m1.addToMarket(12, n2);
        System.out.println(m1.toStringMarket());

        m1.removeFromMarket(6);
        System.out.println(m1.toStringMarket());

        System.out.println(m1.toStringMarket());

    }
}
