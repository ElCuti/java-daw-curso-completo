package com.daw.programming;

import static com.daw.programming.Challenge5_3.elementos;

/**
 * Create an array with some elements. Create an empty array with the same
 * number of elements and duplicate the first array in the second one. Use the
 * function created in 5.3 to show the elements of the second array. b) Instead
 * of duplicating the array, reverse the elements in the array. For example, if
 * our first array has the following elements: 1, 5, 3, 4, 9 The second array
 * should have the same elements but in the reverse order: 9, 4, 3, 5, 1
 */
public class Challenge5_6 {

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 9};
        int number2[] = new int[number.length];
        int count2 = 0;
        for (int count = number.length - 1; count != -1; count--) {
            number2[count2] = number[count];
            count2++;
        }
        elementos(number2);
    }
}
