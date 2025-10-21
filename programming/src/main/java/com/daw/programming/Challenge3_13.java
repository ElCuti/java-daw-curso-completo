/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.Scanner;

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
