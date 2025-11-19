package com.daw.programming;

import java.util.Scanner;

/**
 * Create a new function to ask to the user for an integer number (introduced by
 * keyboard). The function should return the value introduced by the user. Call
 * the function twice (2 times) to get 2 integer values.
 *
 * Create a second function to calculate the area of a rectangle. Pass to this
 * function, the values that the user have entered by keyboard.
 *
 * b) Modify the function to enter an integer value to prevent the user from
 * entering negative values.
 */
public class Challenge4_4 {

    public static void main(String[] args) {
        System.out.println("El lado cuanto mide?: ");
        int value1 = userValue();
        System.out.println("El ancho cuanto mide?: ");
        int value2 = userValue();
        int area = rectangleArea(value1, value2);
        System.out.println("El area del rectangulo es: " + area);
    }

    public static int userValue() {
        int valor = 0;
        Scanner keyboard = new Scanner(System.in);
        do {
            valor = keyboard.nextInt();
        } while (valor < 0);
        return valor;
    }

    public static int rectangleArea(int value1, int value2) {
        int area = value1 * value2;
        return area;
    }
}
