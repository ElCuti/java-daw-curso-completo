package com.daw.programming;

public class Cat extends Animal {

    private static int numberOfCats = 0;
    private String typeHeterotrophs = "carnivoro";

    public Cat(int weight) {
        super(weight, "gato");
        numberOfCats++;
    }

    public static int getNumberOfCats() {
        return numberOfCats;
    }

    public void print() {
        super.print();
        if (getNumberOfCats() < 3) {
            System.out.print(" | Peligro de extincion (" + getNumberOfCats() + ")");
        }
        System.out.println("");
    }

    @Override
    boolean eateable(Animal animal) {
        if (animal.getTypeHeterotrophs().equals("carnivoro") && getWeight() > animal.getWeight() && !getSpecies().equals(animal.getSpecies())) {
            return true;
            //Un carnivoro se puede comer a otro cuando es mas grande que el
            // y no son de la misma especie
        } else if (animal.getTypeHeterotrophs().equals("herbivoro") && getWeight() > animal.getWeight()) {
            return true;
            //Un carnivoro se puede comer a un herbivoro siempre que sea mas pequeño
        } else {
            return false;
        }
    }

    public String getTypeHeterotrophs() {
        return typeHeterotrophs;
    }
}
