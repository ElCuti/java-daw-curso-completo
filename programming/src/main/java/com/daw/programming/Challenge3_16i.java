package com.daw.programming;

import java.util.Scanner;

/*
i.       [BEGINNER] Number of euros and number of decimals.
Write a program which store in a String the price in euros with 2 decimals entered by the user.
Print in screen the number of euros and the number of decimals.
 */
public class Challenge3_16i {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Pon el dinero que tienes en tu cartera (XX,XX)");
        double Price = keyboard1.nextDouble();
        String stringPrice = Double.toString(Price);
        int count = stringPrice.indexOf(".");
        System.out.println("Tiene " + stringPrice.substring(0, count) + " euros y tienes " + stringPrice.substring(count + 1, count + 3) + " centimos");
    }
}
