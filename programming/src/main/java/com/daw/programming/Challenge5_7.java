package com.daw.programming;

/**
 * Create an array with some elements.
 *
 * Look for the maximum and minimum elements in the array:
 *
 * For example, if the array is:
 *
 * 1, -7, 3, 9, 15
 *
 * The program should say:
 *
 * The maximum value is 15
 *
 * The minimum value is -7
 */
public class Challenge5_7 {

    public static void main(String[] args) {
        int higher = Integer.MIN_VALUE;
        int lower = Integer.MAX_VALUE;
        int number[] = {-17 ,-1 ,0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : number) {
            if (num > higher) {
                higher = num;
            }
            if (num < lower) {
                lower = num;
            }
        }
        System.out.println("El numero mas grande es: " + higher);
        System.out.println("El numero mas pequenyo es: " + lower);

    }

}
