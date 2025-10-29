package com.daw.programming;

import java.util.Scanner;

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
        completeNumber = completeNumber.substring(saveScript+1);
        saveScript = completeNumber.indexOf("-");
        completeNumber = completeNumber.substring(0, saveScript);
        System.out.println();
        System.out.print("Este es tu numero limpio: ");
        System.out.print(completeNumber);
    }
}
