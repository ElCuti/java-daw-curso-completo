package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16l2 {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        boolean odd = true;
        int numUser = 20000;
        int numImpar = 1;
        do {
            System.out.println("Pon un numero positivo y te dire todos los numeros impares que lleva atras: ");
            numUser = keyboard1.nextInt();
        } while (numUser <= 0);

        if ((numUser % 2) == 0) {
            odd = false;
            numUser--;
        }
        while (numImpar < numUser) {
            if ((numUser - 2) == numImpar && !odd) {
                System.out.print(numImpar + " y ");
            } else if ((numUser - 4) == numImpar && odd) {
                System.out.print(numImpar + " y ");
                numImpar += 2;
                System.out.print(numUser);
            } else {
                System.out.print(numImpar + ",");

            }
            numImpar += 2;
        }
        if (!odd) {
            System.out.print(numUser);
        }

    }
}
