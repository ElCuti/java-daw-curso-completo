package com.daw.programming;

import java.util.Scanner;

/**
 * Create a class named "Challenge3_10.java".
 *
 * By using the “do-while” statement, make a program which stores in a variable
 * a secret number between 1 and 10. The program will ask to the user a number
 * to guess the secret number. Each time the user enters a number, the program
 * have to indicate if the number entered by the user is smaller than, equal to
 * , greater than the secret number or if the user has guessed the right number
 * (in this case, the program should finish).
 */
public class Challenge3_10 {

    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        int numSecret = rand.nextInt(1, 11);
        Scanner keyboard1 = new Scanner(System.in);
        int num1 = 0;

        do {
            System.out.println("Pon el numero con el que quieres intentar suerte (0-10): ");
            num1 = keyboard1.nextInt();
            if (num1 > numSecret) {
                System.out.println("Te has pasao colega");
            } else if (num1 < numSecret) {
                System.out.println("Te has quedao corto");
            } else {
                System.out.println("Lo has clavao");
            }
        } while (num1 != numSecret);
    }
}
