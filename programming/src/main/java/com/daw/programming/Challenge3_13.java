package com.daw.programming;

import java.util.Scanner;

/*
Create a class named "Challenge3_13.java".
Store in a variable the text introduced by the user by using the keyboard.
The program should say if the variable contains the word “hello” or not.
 */
public class Challenge3_13 {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe la frase que quieres comprobar si tiene hello");
        String palabraUser = keyboard1.nextLine().toLowerCase();
        String palabraBot = "hello";
        int posicion = palabraUser.indexOf(palabraBot);
        if (posicion != -1) {
            System.out.println("Si contiene la palabra hello");
        } else {
            System.out.println("No contiene la palabra hello");
        }

    }
}
