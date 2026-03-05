package com.daw.programming;

import java.util.ArrayList;

public class Challenge6_23 {

    public static void main(String[] args) {
        ArrayList<Animal> granja1 = new ArrayList();
        Rat rata1 = new Rat(2, "omnivoro", true);
        Rat rata2 = new Rat(1, "omnivoro", false);
        Sheep oveja1 = new Sheep(20, "herbivora", "blanca");
        Sheep oveja2 = new Sheep(25, "herbivora", "negra");
        Cat gato1 = new Cat(4, "carnivoros");
        Cat gato2 = new Cat(3, "carnivoros");
        granja1.add(rata1);
        granja1.add(rata2);
        granja1.add(oveja1);
        granja1.add(oveja2);
        granja1.add(gato1);
        granja1.add(gato2);
        
        for (Animal animal : granja1){
            animal.print();
        }
        
    }

}
