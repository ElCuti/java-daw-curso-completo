package com.daw.programming;

import static com.daw.programming.Challenge4_4.rectangleArea;
import static com.daw.programming.Challenge4_4.userValue;
import java.util.Scanner;

/**
 * We are going to calculate how much paint is needed to paint a wall. First we
 * have to do is to create a function to calculate the area of the wall with a
 * supplied width and height. Once we know the area, we have to pass this area
 * to a second function which calculates the litres of paint needed for this
 * area supposing we need 4 litres of paint for each square metre.
 */
public class Challenge4_6 {

    public static void main(String[] args) {
        System.out.println("El lado cuanto mide?: ");
        int value1 = userValue();
        System.out.println("El ancho cuanto mide?: ");
        int value2 = userValue();
        int area = rectangleArea(value1, value2);
        int litros = litrosPorArea(area);
        System.out.println("Para pintar una pared de "+value1+" de largo y "+value2+" de ancho necesitarias: "+litros+" litros");
    }

    public static int litrosPorArea(int area) {
        int valorPorArea = 4;
        int litros = area * valorPorArea;
        return litros;
    }
}
