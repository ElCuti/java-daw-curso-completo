package com.daw.programming;

public class Sheep extends Animal {

    private String color;

    public Sheep(int weight, String species, String color) {
        super(weight, species);
        this.color = color;
    }

    @Override
    void print() {
        System.out.println("Soy una oveja, peso " + getWeight() + " kg, soy de la especie " + getSpecies() + " y soy de color" + getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
