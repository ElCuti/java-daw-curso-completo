package com.daw.programming;

/**
 * Create an array with some elements.
 *
 * Look for the BULKIEST elements in the array. An element should be considered
 * a BULKIEST if it is bigger than all the elements at his right.
 *
 * For example, if the array is:
 *
 * 1, 8, 5, 9, 4, 7, 2
 *
 * The program should say:
 *
 * 9 is a BULKIEST.
 *
 * 7 is a BULKIEST.
 *
 * 2 is a BULKIEST.
 */
public class Challenge5_9 {

    public static void main(String[] args) {
        boolean bulkiest = false;
        int number[] = {1, 8, 5, 9, 4, 7, 2};
        for (int count = 0; count != number.length; count++) {
            for (int num = count + 1; num != number.length; num++) {
                if (number[count] > number[num]) {
                    bulkiest = true;
                } else {
                    bulkiest = false;
                    break;
                }
            }
            if (bulkiest) {
                System.out.println(number[count] + " is a BULKIEST");
            }
        }
    }
}
