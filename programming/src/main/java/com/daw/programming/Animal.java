package com.daw.programming;

abstract class Animal {

    private int weight;
    private String species;
    private String typeHeterotrophs;

    abstract void print();

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

    public boolean eateable(Animal animal) {
        if (this.species.equals("herbivoro")) {
            return false;
        } else if (this.species.equals("omnivoro")) {
            if (animal.getSpecies().equals("herbivoro")) {
                return true;
            } else if (animal.getSpecies().equals("carnivoro")) {
                return false;
            }
        }
        return false;
    }

}
