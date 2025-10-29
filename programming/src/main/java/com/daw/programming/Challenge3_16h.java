package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16h {

    public static void main(String[] args) {
        char letterSentence = ' ';
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String completeSentence = keyboard1.nextLine();
        System.out.println("Escribe que vocal quieres cambiar");
        String vowel = keyboard1.nextLine();
        vowel = vowel.toLowerCase();
        while (vowel.length() > 1 && (!vowel.equals("a") || !vowel.equals("e") || !vowel.equals("i") || !vowel.equals("o") || !vowel.equals("u"))) {
            System.out.println("Porfavor, solo una vocal: ");
            vowel = keyboard1.nextLine();
            vowel = vowel.toLowerCase();
        }
        System.out.println("");
        System.out.print("Tu frase modificada es: ");
        for (int count = 0; count < completeSentence.length(); count++) {
            letterSentence = completeSentence.charAt(count);
            String stringSentence = String.valueOf(letterSentence);
            if (stringSentence.equals(vowel)) {
                System.out.print(stringSentence.toUpperCase());
            } else {
                System.out.print(stringSentence);
            }
        }
    }
}
