package com.daw.programming;

abstract class Animals {

    private String weight;
    private String species;
    
    abstract void print();

    public Animals(String weight, String species) {
        this.weight = weight;
        this.species = species;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
