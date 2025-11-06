package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16p {

    public static void main(String[] args) {
        int sumaCompleta = 0;
        int numeroUsuario = 0;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Inserta los numeros que quieras ir sumando hasta llegar a 0 ");
        do {
            do {
                numeroUsuario = keyboard1.nextInt();
            } while (numeroUsuario < 0);
            sumaCompleta +=numeroUsuario;
        } while (numeroUsuario != 0);
        System.out.println("Tu suma completa es: "+sumaCompleta);
    }
}
