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
        int cars[] = {1, 2, 3, 4 ,5 ,6};
        elementos(cars);
    }

    public static void elementos(int elements[]) {
        for (int count = 0; count != elements.length; count++) {
            System.out.println(elements[count]);
        }
    }
}
