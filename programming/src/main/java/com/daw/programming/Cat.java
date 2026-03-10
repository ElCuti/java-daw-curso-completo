package com.daw.programming;

public class Cat extends Animal {

    private static int numberOfCats = 0;
    private String typeHeterotrophs = "carnivoro";

    public Cat(int weight, String species) {
        super(weight, species);
        numberOfCats++;
    }

    public static int getNumberOfCats() {
        return numberOfCats;
    }

    @Override
    void print() {
        System.out.print("Soy un gato, peso " + getWeight() + " kg y soy de la especie " + getSpecies());
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
