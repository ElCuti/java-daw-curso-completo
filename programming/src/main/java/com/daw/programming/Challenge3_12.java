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
public class Challenge3_12 {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Pon la palabra que quieras analizar");
        String word = keyboard1.nextLine();
        String toUpper = word.toUpperCase();
        String toLower = word.toLowerCase();
        if (word.equals(toUpper) && word.equals(toLower)) {
            System.out.println("No hay ni mayusculas ni minusculas");
        } else if (word.equals(toUpper)) {
            System.out.println("El texto esta escrito en mayusculas unicamente");
        } else if (word.equals(toLower)) {
            System.out.println("El texto esta escrito en minusculas unicamente");
        } else {
            System.out.println("El texto esta escrito con mayusculas y minusculas");
        }
    }
}
