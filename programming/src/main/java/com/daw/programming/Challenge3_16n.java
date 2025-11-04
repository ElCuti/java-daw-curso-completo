package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16n {

    public static void main(String[] args) {
        int vowelvalue = 0;
        char letterSentence = ' ';
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String completeSentence = keyboard1.nextLine();
        System.out.println("Escribe que vocal quieres cambiar");
        String vowel = keyboard1.nextLine();
        vowel = vowel.toLowerCase();
        for (int count = 0; count < completeSentence.length(); count++) {
            letterSentence = completeSentence.charAt(count);
            String stringSentence = String.valueOf(letterSentence);
            if (stringSentence.equals(vowel)) {
                vowelvalue++;
            } 
        }
        System.out.println("La frase conteniene una cantidad de repeticiones de ("+vowel+") de: "+vowelvalue);
    }
}
