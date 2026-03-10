package com.daw.programming;

abstract class Animal {

    private int weight;
    private String species;
    private String typeHeterotrophs;

    abstract boolean eateable(Animal animal);

    public Animal(int weight, String species) {
        this.weight = weight;
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void print() {
        System.out.print("Soy un " + getSpecies() + ", peso " + getWeight() + " kg");
    }

    public String getTypeHeterotrophs() {
        return typeHeterotrophs;
    }

}
