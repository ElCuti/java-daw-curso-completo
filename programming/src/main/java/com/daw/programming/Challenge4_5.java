package com.daw.programming;

import static com.daw.programming.Challenge4_4.userValue;

/**
 * Create a function to calculate the minimum of two numbers.
 *
 * Use the function created in the previous challenge to ask for 2 numbers to
 * the user and pass these 2 numbers to the function to calculate the minimum.
 */
public class Challenge4_5 {

    public static void main(String[] args) {
        System.out.println("Ponme un numero");
        int value1 = userValue();
        System.out.println("Ponme otro numero");
        int value2 = userValue();
        int smaller = min(value1, value2);
        System.out.println("El numero mas pequenyo es: " + smaller);
    }

    public static int min(int value1, int value2) {
        if (value1 < value2) {
            return value1;
        } else {
            return value2;
        }
    }

}
