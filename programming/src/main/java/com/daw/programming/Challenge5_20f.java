/*
 f.      Check if a password is repeated.

Ask for a password to the user to change it.
If the password is one of the previous used passwords, the program should return an error.
Repeat the process until the user enters an empty password.*/
package com.daw.programming;

import java.util.HashSet;
import java.util.Scanner;

public class Challenge5_20f {

    public static void main(String[] args) {
        HashSet<String> registroContrasena = new HashSet();
        Scanner keyboard1 = new Scanner(System.in);
        String contrasena = "";
        do {
            System.out.println("Pon tu nueva contrasena: ");
            contrasena = keyboard1.nextLine();
            while (registroContrasena.contains(contrasena)) {
                System.out.println("Has puesto una contrasena ya existente, pruebe con otra: ");
                contrasena = keyboard1.nextLine();
            }
            registroContrasena.add(contrasena);
        } while (!contrasena.equals(""));

    }

}
