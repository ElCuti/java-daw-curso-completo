package com.daw.programming;

public class Cat extends Animal {

    public Cat(int weight, String species) {
        super(weight, species);
    }

    @Override
    void print() {
        System.out.println("Soy un gato, peso " + getWeight() + " kg y soy de la especie " + getSpecies());
    }

}
