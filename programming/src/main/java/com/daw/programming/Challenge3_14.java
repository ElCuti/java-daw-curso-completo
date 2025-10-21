/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.Scanner;

public class Challenge3_14 {

    public static void main(String[] args) {
        boolean hayMayus = false;
        boolean hayMinus = false;
        boolean hayEspe = false;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe tu contrasena para comprobar su seguridad:");
        String word = keyboard1.nextLine();
        String wordMayus = word.toUpperCase();
        String wordMin = word.toLowerCase();
        int longitud = word.length();
        for (int a = 0; a != longitud; a++) {
            char b = word.charAt(a);
            char c = wordMayus.charAt(a);
            char d = wordMin.charAt(a);

            if (b == c && c == d) {
                hayEspe = true;
            } else if (b == c) {
                hayMayus = true;
            } else if (b == d) {
                hayMinus = true;
            }
        }
        System.out.println("Tu contrasena tiene: ");
        if (hayMayus == true) {
            System.out.println("- Mayusculas ");
        }
        if (hayMinus == true) {
            System.out.println("- Minusculas");
        }
        if (hayEspe == true) {
            System.out.println("- Caracteres especiales");
        }
    }
}
