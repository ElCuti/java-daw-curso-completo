package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16e {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe la letra que quieras comprobar si es vocal");
        String letter = keyboard1.nextLine();
        letter = letter.toLowerCase();

        while (letter.length() != 1) {
            System.out.println("Has puesto mas de una letra, repitelo anda");
            letter = keyboard1.nextLine();
            letter = letter.toLowerCase();

        }

        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println(letter + ": Es una vocal");
        } else {
            System.out.println(letter + ": No es una vocal");
        }
    }
}
