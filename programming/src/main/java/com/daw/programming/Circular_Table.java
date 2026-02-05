/*
Create a class "circular table" (mesa circular) by inheriting from the class Circle.
This class will store the color of the table, in addition to the things of the circle.
Create the appropriate constructor.
Create a method to calculate how much paint is needed to paint the circular table. To paint the table we need 1.5 litres of paint for each 1 square metre.
In Circle, change the method to calculate the area, in a way that it returns the calculated area. In "circular table" use the method to calculate the area to calculate the painting needed.
 */
package com.daw.programming;

public class Circular_Table extends Circle {

    private String color;

    public Circular_Table(float radius, String color) {
        super(radius);
        this.color = color;
    }

    public float Paint() {
        // Por cada 1 metro cuadrado necesitamos 1,5L
        float area = table1.Area();
    }

    public static void main(String[] args) {
        Circular_Table table1 = new Circular_Table(3, "Verde");
    }

}
