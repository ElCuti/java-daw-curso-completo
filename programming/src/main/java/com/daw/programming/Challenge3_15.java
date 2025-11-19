package com.daw.programming;

import java.util.Scanner;

/*
Create a class named "Challenge3_15.java".
Store in a variable the text introduced by the user by using the keyboard.
The program should say whether this text is a palindrome or not.
A palindrome is a text which can be read in the same way from left to right than from right to left.
An example of a simple palindrome is:
level
More complex palindrome are:
La ruta nos aporto otro paso natural
Was it a car or a cat I saw
 */
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
