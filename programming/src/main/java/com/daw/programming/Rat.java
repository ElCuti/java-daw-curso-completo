package com.daw.programming;

public class Rat extends Animal {

    private boolean hasRabies;
    private static int numberOfRats = 0;
    private String typeHeterotrophs = "carnivoro";

    public Rat(int weight, boolean hasRabies) {
        super(weight, "rata");
        this.hasRabies = hasRabies;
        numberOfRats++;
    }

    public static int getNumberOfRats() {
        return numberOfRats;
    }

    public void print() {
        if (hasRabies) {
            super.print();
            System.out.print(" y tengo la rabia");
        } else {
            super.print();
            System.out.print(" y NO tengo la rabia");
        }

        if (getNumberOfRats() < 3) {
            System.out.print(" | Peligro de extincion (Ejemplares restantes: " + getNumberOfRats() + ")!");

        }
        System.out.println("");
    }

    @Override
    boolean eateable(Animal animal) {
        if (animal.getTypeHeterotrophs().equals("carnivoro") && !isHasRabies() && getWeight() > animal.getWeight() && !getSpecies().equals(animal.getSpecies())) {
            return true;
            //Un carnivoro se puede comer a otro cuando es mas grande que el
            // y no son de la misma especie
        } else if (isHasRabies()) {
            return true;
            //Un carnivoro se puede comer a otro siempre que tenga la rabia
        } else if (animal.getTypeHeterotrophs().equals("herbivoro") && getWeight() > animal.getWeight()) {
            return true;
            //Un carnivoro se puede comer a un herbivoro siempre que sea mas pequeño
        } else {
            return false;
        }
    }

    public boolean isHasRabies() {
        return hasRabies;
    }

    public String getTypeHeterotrophs() {
        return typeHeterotrophs;
    }

}
