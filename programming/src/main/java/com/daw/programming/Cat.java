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

}
