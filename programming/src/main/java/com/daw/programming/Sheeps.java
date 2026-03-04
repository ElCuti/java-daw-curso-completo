/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

/**
 *
 * @author Alumnado
 */
public class Sheeps extends Animals {
private String color;
    
    
    public Sheeps(String weight, String species, String color) {
        super(weight, species);
        this.color=color;
    }
    @Override
    void print() {
        System.out.println("Soy una oveja, peso " + getWeight() + " kg, soy de la especie " + getSpecies()+" y soy de color"+getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
