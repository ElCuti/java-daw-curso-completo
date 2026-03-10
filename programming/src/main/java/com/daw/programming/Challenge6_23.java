package com.daw.programming;

import java.util.ArrayList;

public class Challenge6_23 {

    public static void main(String[] args) {
        ArrayList<Animal> granja1 = new ArrayList();
        Rat rata1 = new Rat(2, "negra", true);
        Rat rata2 = new Rat(1, "casera", false);
        Sheep oveja1 = new Sheep(20, "Merina", "blanca");
        Sheep oveja2 = new Sheep(25, "Dorper", "negra");
        Sheep oveja3 = new Sheep(23, "Romney", "rosa");
        Cat gato1 = new Cat(4, "Persa");
        Cat gato2 = new Cat(3, "Abisinio");
        Cat gato3 = new Cat(2, "Maine Coon");
        Cat gato4 = new Cat(5, "Ragdoll");
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
