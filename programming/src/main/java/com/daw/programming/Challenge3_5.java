package com.daw.programming;

/**
 * Create a class named "Challenge3_5.java".
 *
 * a) By using the “for” statement, write the 7 times table (multiplication
 * table).
 *
 * b) Modify the previous exercise to write all times tables from 1 to 10.
 */

public class Challenge3_5 {

    public static void main(String[] args) {
        System.out.println("Tabla de multiplicar del 7");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7" + " X " + i + " = " + i * 7);
        }
        System.out.println("");
        for (int x = 1; x <= 10; x++) {
            System.out.println("Tabla de multiplicar del " + x);
            for (int y = 1; y <= 10; y++) {
                System.out.println(x + " X " + y + " = " + y * x);
            }
            System.out.println("");
        }
    }
}
