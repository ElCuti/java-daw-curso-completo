/*
Create a class "circular table" (mesa circular) by inheriting from the class Circle.
This class will store the color of the table, in addition to the things of the circle.
Create the appropriate constructor.
Create a method to calculate how much paint is needed to paint the circular table. To paint the table we need 1.5 litres of paint for each 1 square metre.
In Circle, change the method to calculate the area, in a way that it returns the calculated area. In "circular table" use the method to calculate the area to calculate the painting needed.
 */
package com.daw.programming;

import static java.lang.Math.ceil;

public class CircularTable extends Circle {

    private String color;

    public CircularTable(float radius, String color) {
        super(radius);
        this.color = color;
    }

    public double paint() {
        // Por cada 1 metro cuadrado necesitamos 1,5L
        double squareMetre = area();
        return squareMetre * 1.5;
    }

    public static void main(String[] args) {
        CircularTable table1 = new CircularTable(3, "Verde");
        System.out.println("Para pintar esa mesa necesitariamos " + ceil(table1.paint()) + " L de pintura de color "+table1.color);

    }

}
