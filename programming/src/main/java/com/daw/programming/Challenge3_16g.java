package com.daw.programming;

import java.util.Scanner;

/*
g.      Extracting a phone number.
The phone number of a company has the next format: prefix-number-extension, where prefix is the country code (i.e. +34), 
and the extension can have between 2 and 4 digits. For example, this would be a number +34-968256541-33.
Write a program asking for a phone number with this format and show on screen the phone without the prefix nor the extension.
 */
public class Challenge3_16g {

    public static void main(String[] args) {
        int saveScript = 0;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe tu numero de telefono completo: ");
        /*String completeName = keyboard1.nextLine();*/
        String completeNumber = "+34-968123456-789";
        /*
        for (int count = 0; count < completeNumber.length(); count++) {
            char number = completeNumber.charAt(count);
            String stringNumber = String.valueOf(number);
            if (stringNumber.equals("-")) {
                if (saveScript1 == 0) {
                    saveScript1 = count;
                } else {
                    saveScript2 = count;
                }
            }
        }
         */
        saveScript = completeNumber.indexOf("-");
        completeNumber = completeNumber.substring(saveScript + 1);
        saveScript = completeNumber.indexOf("-");
        completeNumber = completeNumber.substring(0, saveScript);
        System.out.println();
        System.out.print("Este es tu numero limpio: ");
        System.out.print(completeNumber);
    }
}
