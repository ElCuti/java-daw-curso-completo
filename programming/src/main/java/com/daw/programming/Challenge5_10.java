/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.Arrays;

/**
 * Create an array with some elements. Investigate the Java Arrays predefined
 * functions to solve these exercises. To do that, write in Net Beans “Arrays.”
 * and the list of functions will appear with a little documentation about how
 * to use them.
 *
 * a) Write on screen all the elements of an array.
 *
 * b) See if two arrays has the same elements.
 *
 * c) Order the elements of an array. For example, if the array is: 1, 4, 3, 7,
 * 2, 9 The result should be: 1, 2, 3, 4, 7, 9
 *
 * d) Create two arrays with the same number of elements. Look for the element
 * which is not equal in the same position of the other array. For example if
 * the arrays are: Array1: 1, 3, 5, 7, 9 Array2: 1, 3, 4, 7, 9 The program
 * should say: The element in position 2 is not equal
 *
 * e) Create an empty array of integers. Fill the array with the number 32.
 */
public class Challenge5_10 {

    public static void main(String[] args) {
        int number[] = {1, 10, 8, 5, 9, 4, 7, 2};
        int number2[] = {1, 10, 8, 5, 9, 4, 6, 2};
        /*A*/

        System.out.println(Arrays.toString(number));

        /*B*/
        int resultado = Arrays.compare(number, number2);
        /*Si son iguales te returna 0, y si son distintos te devuelve 1*/
        if (resultado != 0) {
            System.out.println("No son iguales!");
        } else {
            System.out.println("Si son iguales!");
        }

        /*C*/
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        /*D*/
        int number3[] = {1, 10, 8, 5, 9, 4, 2, 6};
        int coincidence = Arrays.mismatch(number2, number3);
        if (coincidence != -1) {
            System.out.println("Son distintos en la posicion: " + coincidence);
        } else {
            System.out.println("Son iguales");
        }

        /*E*/
        int number4[] = new int[5];
        Arrays.fill(number4, 34);
        System.out.println(Arrays.toString(number4));
    }
}
