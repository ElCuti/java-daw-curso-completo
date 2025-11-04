package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16l {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        int numUser = 0;
        int numImpar = 1;
        do {
            System.out.println("Pon un numero positivo y te dire todos los numeros impares que lleva atras: ");
            numUser = keyboard1.nextInt();
        } while (numUser <= 0);

        if ((numUser % 2) == 0) {
            numUser--;
            while (numImpar != numUser) {
                if ((numUser - 2) == numImpar) {
                    System.out.print(numImpar + " y ");
                } else {
                    System.out.print(numImpar + ",");

                }
                numImpar += 2;
            }
            System.out.print(numUser);
        } else {
            while (numImpar != numUser) {
                if ((numUser - 2) == numImpar) {
                    System.out.print(numImpar);
                } else if ((numUser - 4) == numImpar) {
                    System.out.print(numImpar + " y ");
                } else {
                    System.out.print(numImpar + ",");
                }
                numImpar += 2;
            }
        }
    }
}
