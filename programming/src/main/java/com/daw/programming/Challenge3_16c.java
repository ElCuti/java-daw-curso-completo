package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16c {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String name1 = keyboard1.nextLine();
        System.out.println("Escribe el nombre de tu alma gemela");
        String name2 = keyboard1.nextLine();

        if (name1.charAt(0) == name2.charAt(0) || name1.charAt(name1.length() - 1) == name2.charAt(name2.length() - 1)) {
            System.out.println("Definitivamente sois almas gemelas");

        } else {
            System.out.println("Pues me parece a mi que deberias buscarte otra alma gemela...");
        }

    }
}
