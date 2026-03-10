package com.daw.programming;

import java.util.ArrayList;

public class Challenge6_23 {

    public static void main(String[] args) {
        ArrayList<Animal> granja1 = new ArrayList();
        Rat rata1 = new Rat(2, true);
        Rat rata2 = new Rat(1, false);
        Sheep oveja1 = new Sheep(20, "blanca");
        Sheep oveja2 = new Sheep(25, "negra");
        Sheep oveja3 = new Sheep(23, "rosa");
        Cat gato1 = new Cat(4);
        Cat gato2 = new Cat(3);
        Cat gato3 = new Cat(2);
        Cat gato4 = new Cat(5);
        Cat gato5 = new Cat(3);
        granja1.add(rata1);
        granja1.add(rata2);
        granja1.add(oveja1);
        granja1.add(oveja2);
        granja1.add(gato1);
        granja1.add(gato2);
        granja1.add(gato3);
        granja1.add(gato4);
        granja1.add(oveja3);
        System.out.println(gato4.eateable(gato5));

        for (Animal animal : granja1) {
            animal.print();
        }

    }

}
