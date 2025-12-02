package com.daw.programming;

/**
 * Create an array with some elements.
 *
 * Look for the elements that are duplicated in the array.
 *
 * For example, if the array has the following values:
 *
 * 1,4,3,5,7,3,9,4
 *
 * The program should say:
 *
 * The number 4 is duplicated.
 *
 * The number 3 is duplicated.
 */
public class Challenge5_8 {

    public static void main(String[] args) {
        
        int number[] = {1, 4, 3, 5, 7, 3, 9, 4, 1, 1, 1 ,2, 1, 1};
        for (int count = 0; count != number.length; count++) {
            int coincidence = 0;
            for (int num = count+1; num != number.length; num++) {
                if (number[count] == number[num]) {
                    coincidence++;
                }
            }
            if (coincidence == 1) {
                System.out.println("The number " + number[count] + " is duplicated");
            }
        }
    }
}
