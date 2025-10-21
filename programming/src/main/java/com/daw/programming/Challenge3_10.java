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
public class Challenge3_10 {

    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        int numSecret = rand.nextInt(1, 11);
        Scanner keyboard1 = new Scanner(System.in);
        int num1 = 0;

        do {
            System.out.println("Pon el numero con el que quieres intentar suerte (0-10): ");
            num1 = keyboard1.nextInt();
            if (num1 > numSecret) {
                System.out.println("Te has pasao colega");
            } else if (num1 < numSecret) {
                System.out.println("Te has quedao corto");
            } else {
                System.out.println("Lo has clavao");
            }
        } while (num1 != numSecret);
    }
}
