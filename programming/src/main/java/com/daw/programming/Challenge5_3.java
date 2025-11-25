/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

/**
 * Create an array with 7 elements.
 *
 * Create a function to show all the elements on screen by using the loop for
 * (use both ways of looping with for seen on class).
 */
public class Challenge5_3 {

    public static void main(String[] args) {
        String cars[] = {"Ford", "Volvo", "Peugeot", "Seat", "Bmw", "Audi", "Mini"};
        elementos(cars);
    }

    public static void elementos(String cars[]) {
        for (int count = 0; count != cars.length; count++) {
            System.out.println(cars[count]);
        }
    }
}
