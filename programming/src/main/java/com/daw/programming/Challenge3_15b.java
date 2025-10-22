package com.daw.programming;

import java.util.Scanner;

public class Challenge3_15b {

    public static void main(String[] args) {
        int palindrome = 0;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe una frase para comprobar si es un palindromo: ");
        String word = keyboard1.nextLine();
        String wordSpecial = word.toLowerCase();

        int a = 0;
        int longitud = wordSpecial.length();
        int count = longitud - a - 1;
        for (a = 0; palindrome != longitud;) {
            char b = wordSpecial.charAt(a);
            char c = wordSpecial.charAt(count);
            if (b == c) {
                count--;
                a++;
            } else if (b == ' ') {
                a++;

            } else if (c == ' ') {
                count--;

            } else {
                break;
            }
            palindrome++;
        }
        if (palindrome == longitud) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}
