/*
 In this challenge you would have to design different classes.
a)
We are going to create "2D geometrical figures".
We are going to start having "rectangles" and "lines".
A rectangle is defined by the starting point (x and y coordinates) for the upper-left corner and the width and height.
A line is defined by 2 points each one with x and y coordinates (Let's say x1, y1 and x2, y2).
All "2D geometrical figures" have a color.
Add a method "print" to say something similar to:
"I am a RECTANGLE starting in 10,10 and a width of 100 and a height of 70"
"I am a LINE starting in 25,13 and ending in 45,76".
Create an ArrayList and add to it different figures.
Loop through the figures in the ArrayList and for each one, call to the method "print".
b)
Call to the parent class for "2D Geometrical Figures" Figure by using the menu "Refactor > Rename...".
Declare the method print "abstract" in the parent class (for 2D geometrical figures). This means that the method is not defined in this class (it is pending to be defined in the child classes), but, if you want to inherit from this class you are forced to add and implement the method print.
Try to create an Object from the class "Figure". What happens?
Create a new class for triangles. Is it forcing you to create the print method?*/
package com.daw.programming;

import java.util.ArrayList;

public class Challenge6_15 {

    public static void main(String[] args) {
        //Linea: String color, int corX, int corY, int corX2, int corY2
        //Rectangulo: String color, int corX, int corY, float width, float height
        //Triangulo: String color, int corX, int corY, int corX2, int corY2, int corY3, int corX3
        ArrayList<Figure> figuras = new ArrayList();
        Linea linea1 = new Linea("azul", 2, 3, 5, 8);
        Linea linea2 = new Linea("verde", 12, 15, 2, -2);
        Rectangulo rectangulo1 = new Rectangulo("rosa", 6, 8, 30, 60);
        Triangulo triangulo1 = new Triangulo("amarillo", 1, 2, 3, 4, 5, 6);
        figuras.add(linea1);
        figuras.add(linea2);
        figuras.add(rectangulo1);
        figuras.add(triangulo1);
        for (Figure figura : figuras) {
            figura.print();
        }
    }

}
