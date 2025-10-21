package com.daw.programming;

import java.util.Scanner;

public class Challenge3_6 {

    public static void main(String[] args) {
        double factorialNumber = 1;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Pon el numero que quieres sacar su factorial: ");
        double num1 = keyboard1.nextInt();
        double safeNum1 = num1;
        for (factorialNumber = 1; num1 != 0; num1--) {
            factorialNumber *= num1;
            if (factorialNumber != num1) {
                System.out.print(" X ");
            }
            System.out.print(num1);
        }
        System.out.print(" = " + factorialNumber);
        System.out.println("");
        System.out.println("El factorial de " + safeNum1 + " es: " + factorialNumber);
    }
}
