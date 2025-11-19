package com.daw.programming;

/**
 * Create a class named "Challenge3_7.java".
 *
 * a) Show the numbers from 1 to 100 that which are multiple of 4 (4, 8, 12,
 * 16…).
 *
 * b) Modify the previous exercise to show the multiples of 4 that are not
 * multiple of 5.
 */
public class Challenge3_7 {

    public static void main(String[] args) {
        int limitNumber = 100;
        int multiple = 4;
        int x = limitNumber / multiple;
        System.out.println("Numeros multiplos de 4");
        for (int i = 1; i <= x; i++) {
            int number = i * multiple;
            System.out.println(number);
        }

        System.out.println();
        System.out.println("Numeros multiplos de 4 excluyendo a los multiplos de 5");
        for (int i = 1; i <= x; i++) {
            int number = i * multiple;
            if (number % 5 != 0) {
                System.out.println(number);

            }

        }

    }
}
