package com.daw.programming;

public class Sheep extends Animal {

    private String color;
    private static int numberOfSheeps = 0;
    private String typeHeterotrophs = "herbivoro";

    public Sheep(int weight, String species, String color) {
        super(weight, species);
        this.color = color;
        numberOfSheeps++;
    }

    public static int getNumberOfSheeps() {
        return numberOfSheeps;
    }

    @Override
    void print() {
        System.out.print("Soy una oveja, peso " + getWeight() + " kg, soy de la especie " + getSpecies() + " y soy de color " + getColor());
        if (getNumberOfSheeps() < 3) {
            System.out.print(" | Peligro de extincion (" + getNumberOfSheeps() + ")");
        }
        System.out.println("");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    boolean eateable(Animal animal) {
        return false; //La oveja no se va a comer a nadie
    }

    public String getTypeHeterotrophs() {
        return typeHeterotrophs;
    }

}
