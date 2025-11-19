package com.daw.programming;

import java.util.Scanner;

/*
s.      [ADVANCED] Counting numbers in book sections.
Create a program that allows to the user to enter titles of books.
The program should finish when the user enters the string “*” (asterisk).
Each time that the user enters a slash “/” we consider that a section has finished and the program 
have to tell how many number digits (from 0 to 9) appeared in the titles of the books on this section.
Finally the program has to tell how many sections it has processed.
 */
public class Challenge3_16s {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        String userInput = "";
        int countNumber = 0;
        int countSection = 0;
        String stringVowel = "";
        do {
            System.out.println("Para crear una seccion pulse enter o * para salir: ");
            stringVowel = "";
            userInput = keyboard1.nextLine();

            while (!userInput.equals("/") && !userInput.equals("*")) {
                System.out.println("Escribeme el libro que quieres, cuando no quieras mas en esta seccion, escribe /: ");
                userInput = keyboard1.nextLine();
                if (!userInput.equals("/") && !userInput.equals("*")) {
                    for (int countBook = 0; countBook <= userInput.length() - 1; countBook++) {
                        char vowel = userInput.charAt(countBook);
                        stringVowel = String.valueOf(vowel);
                        if (stringVowel.equals(stringVowel.toUpperCase()) && stringVowel.equals(stringVowel.toLowerCase()) && !stringVowel.equals(" ")) {
                            countNumber++;
                        }
                    }
                    System.out.println("Agregado!");
                }
            }
            if (countNumber != 0 && !stringVowel.equals("")) {
                System.out.println("- - - - SECCION TERMINADA - - - -");
                System.out.println("- Han aparecido " + countNumber + " numeros");
                System.out.println();

            }
            if (!stringVowel.equals("")) {
                countNumber = 0;
                countSection++;
            }
        } while (!userInput.equals("*"));
        System.out.println("Programa terminada, han aparecido " + countSection + " secciones");
    }
}
