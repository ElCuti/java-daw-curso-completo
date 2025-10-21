/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.Scanner;

/**
 *
 * @author Alumnado
 */
public class Challenge3_11 {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Pon la palabra que quieras convertir en mayusculas, "
                + "minusculas y ver cuantas letras tiene ");
        String word = keyboard1.nextLine();
        System.out.println("La palabra (" + word + ") en mayusculas es: " + word.toUpperCase());
        System.out.println("La palabra (" + word + ") en minusculas es: " + word.toLowerCase());
        System.out.println("La palabra (" + word + ") tiene " + word.length() + " letras (Los espacios cuentan)");
    }
}
