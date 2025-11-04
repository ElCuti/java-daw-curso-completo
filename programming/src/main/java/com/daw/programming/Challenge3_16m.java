package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16m {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        int numUser = 0;
        boolean primeNum = true;
        do {
            System.out.println("Pon un numero positivo y te dire si es primo: ");
            numUser = keyboard1.nextInt();
        } while (numUser <= 0);
        for (int count = 1; count < numUser;) {
            count++;
            if ((numUser % count) != 0) {
            } else if (numUser == count) {
            } else {
                System.out.println("El numero " + numUser + " no es primo");
                primeNum = false;
                break;
            }
        }
        if (primeNum) {
            System.out.println("El numero " + numUser + " es primo");
        }
    }
}
