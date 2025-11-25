/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

/**
 * Create an array that stores 4 integer numbers.
 *
 * Show on screen the value of each element.
 *
 * Show on screen the number of elements that the Array has.
 */
public class Challenge5_1 {

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4};
        for (int count = 0; count != numbers.length; count++) {
            System.out.println(numbers[count]);
        }
        System.out.println("La longitud es: " + numbers.length);
    }
}
