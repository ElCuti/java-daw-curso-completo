package com.daw.programming;

public class Rat extends Animal {

    private boolean hasRabies;

    public Rat(int weight, String species, boolean hasRabies) {
        super(weight, species);
        this.hasRabies = hasRabies;
    }

    @Override
    void print() {
        if (hasRabies) {
            System.out.println("Soy una rata, peso " + getWeight() + " kg, soy de la especie " + getSpecies() + " y tengo la rabia");
        } else {
            System.out.println("Soy una rata, peso " + getWeight() + " kg, soy de la especie " + getSpecies() + " y NO tengo la rabia");
        }

    }
}
