package com.daw.programming;

import java.util.Scanner;

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
