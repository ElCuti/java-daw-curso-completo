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
        return getWeight() > animal.getWeight() && !getSpecies().equals(animal.getSpecies());
    }

    public String getTypeHeterotrophs() {
        return typeHeterotrophs;
    }
}
