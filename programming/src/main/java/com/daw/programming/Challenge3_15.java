package com.daw.programming;

import java.util.Scanner;

public class Challenge3_15 {

    public static void main(String[] args) {
        int palindrome = 0;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe una frase para comprobar si es un palindromo: ");
        String word = keyboard1.nextLine();
        String wordSpecial = word.toLowerCase();
        wordSpecial = wordSpecial.replace(" ", "");
        int longitud = wordSpecial.length();
        for (int a = 0; a != longitud; a++) {
            char b = wordSpecial.charAt(a);
            char c = wordSpecial.charAt(longitud - a - 1);
            if (b == c) {
                palindrome++;
            } else {
                break;
            }
        }
        if (palindrome == longitud) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}
