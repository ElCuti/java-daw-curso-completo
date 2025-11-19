package com.daw.programming;

import java.util.Scanner;

/*
Create a class named "Challenge3_14.java".
Store in a variable the text introduced by the user by using the keyboard.
Imagine we are going to use this text as a password. We have to say if this password has at least one character in lowercase and one character in uppercase.
b) [OPTIONAL] We have to say if this password has at least one character in lowercase, one character in uppercase and one character which is not a letter (special char, numbers…)
 */
public class Challenge3_14 {

    public static void main(String[] args) {
        boolean hayMayus = false;
        boolean hayMinus = false;
        boolean hayEspe = false;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe tu contrasena para comprobar su seguridad:");
        String word = keyboard1.nextLine();
        String wordMayus = word.toUpperCase();
        String wordMin = word.toLowerCase();
        int longitud = word.length();
        for (int a = 0; a != longitud; a++) {
            char b = word.charAt(a);
            char c = wordMayus.charAt(a);
            char d = wordMin.charAt(a);

            if (b == c && c == d) {
                hayEspe = true;
            } else if (b == c) {
                hayMayus = true;
            } else if (b == d) {
                hayMinus = true;
            }
        }
        System.out.println("Tu contrasena tiene: ");
        if (hayMayus == true) {
            System.out.println("- Mayusculas ");
        }
        if (hayMinus == true) {
            System.out.println("- Minusculas");
        }
        if (hayEspe == true) {
            System.out.println("- Caracteres especiales");
        }
    }
}
