package com.daw.programming;

import java.util.Scanner;

/**
 * Create a class named "Challenge3_3.java". 
 * Create two variables to store two
 * numbers. The user should supply this numbers by using the keyboard. By using
 * the if..else statements, show a message on screen telling if the first number
 * is smaller than, equal to or greater than the second one.
 */
public class Challenge3_3 {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Pon el primer numero: ");
        int num1 = keyboard1.nextInt();
        System.out.println("Pon el segundo numero: ");
        int num2 = keyboard1.nextInt();

        if (num1 < num2) {
            System.out.println("El numero 1 es mas pequeno que el numero 2: " + num1 + " < " + num2);
        } else if (num1 == num2) {
            System.out.println("El numero 1 es igual al numero 2: " + num1 + " = " + num2);
        } else {
            System.out.println("El numero 1 es mayor que el numero 2: " + num1 + " > " + num2);
        }
    }
}
