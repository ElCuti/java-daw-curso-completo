package com.daw.programming;

import java.util.Scanner;

/**
 * Create a class named "Challenge4_7.java". WITHOUT using the “for” statement,
 * create a program to calculate the “factorial” of an integer number. You have
 * to use "recursion", that is when a function call to itself. Notes: The
 * “factorial” of an integer number consists in multiplying all the decreasing
 * integer numbers starting by the number up to the number 1. For example, the
 * factorial of 5 (which is written as 5!) is: 5! = 5 x 4 x 3 x 2 x 1 = 120 For
 * example, the factorial of 7 is: 7! = 7 x 6 x 5 x 4 x 3 x 2 x 1 = 5040
 */
public class Challenge4_7 {

    public static void main(String[] args) {
        double factorialNumber = 1;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Pon el numero que quieres sacar su factorial: ");
        double num1 = keyboard1.nextDouble();
        double safeNum1 = num1;
        factorialNumber = factorial(num1, factorialNumber);
        System.out.print(" = " + factorialNumber);
        System.out.println("");
        System.out.println("El factorial de " + safeNum1 + " es: " + factorialNumber);
    }

    public static double factorial(double num1, double factorialNumber) {
        factorialNumber *= num1;
        if (factorialNumber != num1) {
            System.out.print(" X ");
        }
        System.out.print(num1);
        if (num1 > 1) {
            num1--;
            factorialNumber = factorial(num1, factorialNumber);
        }
        return factorialNumber;
    }
}
