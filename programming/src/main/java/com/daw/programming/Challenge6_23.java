package com.daw.programming;

import java.util.ArrayList;

public class Challenge6_23 {

    public static void main(String[] args) {
        ArrayList<Animal> granja1 = new ArrayList();
        Rat rata1 = new Rat(2, "omnivoro", true);
        Rat rata2 = new Rat(1, "omnivoro", false);
        Sheep oveja1 = new Sheep(20, "herbivoro", "blanca");
        Sheep oveja2 = new Sheep(25, "herbivoro", "negra");
        Sheep oveja3 = new Sheep(23, "herbivoro", "rosa");
        Cat gato1 = new Cat(4, "carnivoro");
        Cat gato2 = new Cat(3, "carnivoro");
        Cat gato3 = new Cat(2, "carnivoro");
        Cat gato4 = new Cat(5, "carnivoro");
        granja1.add(rata1);
        granja1.add(rata2);
        granja1.add(oveja1);
        granja1.add(oveja2);
        granja1.add(gato1);
        granja1.add(gato2);
        granja1.add(gato3);
        granja1.add(gato4);
        granja1.add(oveja3);

        for (Animal animal : granja1) {
            animal.print();
        }

    }

}
