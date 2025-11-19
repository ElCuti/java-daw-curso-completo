package com.daw.programming;

import java.util.Scanner;

/*
q.     Which one is the greatest.
Read positive numbers by the keyboard until the user enters a non positive number.
Tell which one of them was the greatest.
 */
public class Challenge3_16q {

    public static void main(String[] args) {
        int numUsuario = 0;
        int numMayor = 0;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Inserta los numeros para ver cual es el mayor ");
        do {
            numUsuario = keyboard1.nextInt();
            if (numUsuario > 0 && numUsuario > numMayor) {
                numMayor = numUsuario;
            }
        } while (numUsuario > 0);
        System.out.println("El numero mas grande es: " + numMayor);
    }
}
