package com.daw.programming;

import java.util.Scanner;

/*
b.     Comparing 3 numbers.
Read 3 numbers by the keyboard. Tell which number is the greater.
 */
public class Challenge3_16b {

    public static void main(String[] args) {
        boolean result = false;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe tu primer numero");
        int num1 = keyboard1.nextInt();
        System.out.println("Escribe tu segundo numero");
        int num2 = keyboard1.nextInt();
        System.out.println("Escribe tu tercer numero");
        int num3 = keyboard1.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El numero mas grande es el " + num1 + " el primero que has puesto");
                result = true;
            }
        }
        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("El numero mas grande es el " + num2 + " el segundo que has puesto");
                result = true;
            }
        }
        if (num3 > num1) {
            if (num3 > num2) {
                System.out.println("El numero mas grande es el " + num3 + " el tercero que has puesto");
                result = true;
            }

        } else {
            if (result == false) {
                if (num1 == num2 && num1 == num3) {
                    System.out.println("- Has puesto el mismo numero en las tres: " + num1);
                } else if (num1 == num2) {
                    System.out.println("- Has puesto el mismo numero en el uno y en el dos, ambos son los mas altos: " + num1);
                } else if (num1 == num3) {
                    System.out.println("- Has puesto el mismo numero en el uno y en el tres, ambos son los mas altos: " + num1);
                } else {
                    System.out.println("- Has puesto el mismo numero en el dos y en el tres, ambos son los mas altos: " + num2);
                }
            }
        }

    }
}
