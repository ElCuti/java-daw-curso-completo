package com.daw.programming;

import java.util.Scanner;

/*
*t[ADVANCED] Caesar encryption.
*Encrypt a message by using “Caesar encryption”. It consist in move each letter 1 position. 
For example, the A would be B, the B would be C, and so on. The Z would be A.
*Modify it to ask the user by the number of letters to move (with 2, the A would be C now).
 */
public class Challenge3_16t {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Dime que frase quieres que te encripte?");
        String userInput = keyboard1.nextLine();
        System.out.println("Dime que numero de encriptacion quieres");
        int userNumber = keyboard1.nextInt();
        String abecedarioL = "abcdefghijklmnopqrstuvwxyz";
        String abecedarioU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print("- Tu palabra secreta es: ");
        for (int count = 0; count < userInput.length(); count++) {
            int indexAbc = 0;
            char vowelE = ' ';
            char vowel = userInput.charAt(count);
            String stringVowel = String.valueOf(vowel);
            if (stringVowel.equals(" ")) {
                System.out.print(" ");
            } else {
                if (stringVowel.toUpperCase().equals(stringVowel)) {
                    indexAbc = abecedarioU.indexOf(stringVowel);
                } else if (stringVowel.toLowerCase().equals(stringVowel)) {
                    indexAbc = abecedarioL.indexOf(stringVowel);
                }
                indexAbc = indexAbc + userNumber;
                indexAbc = indexAbc % 26;

                if (stringVowel.toUpperCase().equals(stringVowel)) {
                    vowelE = abecedarioU.charAt(indexAbc);
                } else if (stringVowel.toLowerCase().equals(stringVowel)) {
                    vowelE = abecedarioL.charAt(indexAbc);
                }
                String stringVowelE = String.valueOf(vowelE);
                System.out.print(stringVowelE);
            }

        }
    }
}
