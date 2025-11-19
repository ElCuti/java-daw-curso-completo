package com.daw.programming;

import java.util.Scanner;

/*
c.      Starting or ending by the same letter?.
Ask to the user for the name of 2 persons and store them into variables.
Then you have to print “coincidence” if the names of both persons start by the same letter or if they finish by the same letter. 
In any other case, print “there is NO coincidence”.
 */
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
