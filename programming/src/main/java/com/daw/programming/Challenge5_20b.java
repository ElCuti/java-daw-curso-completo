/*
 b.     Simplifying fractions.

We are going to create a program working with fractions 3/8. A fraction has numerator (3) and denominator (8).

The program should ask for the numerator and denominator.

We are going to create a function to calculate the greatest common divisor (máximo común divisor) of numerator and denominator. This is the maximum number which divides both numerator and denominator with zero remainder (exact division).

We are going to create another function to simplify the fraction which divides numerator and denominator by greatest common divisor.
 */
package com.daw.programming;

import java.util.Scanner;

public class Challenge5_20b {

    public static int MCD(int num, int den) {
        int greatest = 0;
        int max = 0;
        if (num < den) {
            greatest = den;
        } else {
            greatest = num;
        }
        for (int count = 1; count != greatest; count++) {
            if (num % count == 0) {
                if (den % count == 0) {
                    max = count;
                }
            }
        }
        return max;
    }

    public static void simplify(int num, int den, int mcd) {
        System.out.print("La fraccion simplificada de " + num + "/" + den + " es");
        num /= mcd;
        den /= mcd;
        System.out.print(" " + num + "/" + den + " y el MCD es " + mcd);
    }

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Pon el numerador");
        int num = keyboard1.nextInt();
        System.out.println("Pon el denominador");
        int den = keyboard1.nextInt();
        int mcd = MCD(num, den);
        simplify(num, den, mcd);
    }

}
