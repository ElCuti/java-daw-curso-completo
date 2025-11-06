package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16q {

    public static void main(String[] args) {
        int numUsuario = 0;
        int numMayor = 0;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Inserta los numeros para ver cual es el mayor ");
        do {
            numUsuario = keyboard1.nextInt();
            if (numUsuario > 0 && numUsuario>numMayor) {
                numMayor = numUsuario;
            } 
        } while (numUsuario > 0);
        System.out.println("El numero mas grande es: " + numMayor);
    }
}
