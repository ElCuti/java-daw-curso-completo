package com.daw.programming;

public class Rat extends Animal {

    private boolean hasRabies;
    private static int numberOfRats = 0;

    public Rat(int weight, String species, boolean hasRabies) {
        super(weight, species);
        this.hasRabies = hasRabies;
        numberOfRats++;
    }

    public static int getNumberOfRats() {
        return numberOfRats;
    }

    @Override
    void print() {
        if (hasRabies) {
            System.out.print("Soy una rata, peso " + getWeight() + " kg, soy de la especie " + getSpecies() + " y tengo la rabia");
        } else {
            System.out.print("Soy una rata, peso " + getWeight() + " kg, soy de la especie " + getSpecies() + " y NO tengo la rabia");
        }

        if (getNumberOfRats() < 3) {
            System.out.print(" | Peligro de extincion (Ejemplares restantes: " + getNumberOfRats() + ")!");

        }
        System.out.println("");
    }
}
