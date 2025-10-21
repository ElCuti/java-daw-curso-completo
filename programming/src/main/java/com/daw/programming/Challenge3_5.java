/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

/**
 *
 * @author Alumnado
 */
public class Challenge3_5 {

    public static void main(String[] args) {
        System.out.println("Tabla de multiplicar del 7");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7" + " X " + i + " = " + i * 7);
        }
        System.out.println("");
        for (int x = 1; x <= 10; x++) {
            System.out.println("Tabla de multiplicar del " + x);
            for (int y = 1; y <= 10; y++) {
                System.out.println(x + " X " + y + " = " + y * x);
            }
            System.out.println("");
        }
    }
}
