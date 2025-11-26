package com.daw.programming;

import java.util.Scanner;

/**
 * Create a function that check if a number exists in an array and tells the
 * position of the element or -1 if the element doesn’t exists in the array.
 *
 * For example, if we have an array composed by the elements 1, 8, 5, 3, 6, 9
 *
 * If we look for the number 5 it should say:
 *
 * The number 5 is in the position 2.
 *
 * If we look for the number 7 it should say:
 *
 * The number 7 is in the position -1.
 */
public class Challenge5_5 {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        int userNum = -1;

        do {
            System.out.println("Pon el numero con el que quieres probar (0<X<=15): ");
            userNum = keyboard1.nextInt();
        } while (userNum < 0 || userNum >= 15);
        int position = inArray(userNum);
        System.out.println("The number " + userNum + " is in the position " + position);
    }

    public static int inArray(int userNum) {
        int position = -1;
        int count = 0;
        int listNum[] = {1, 3, 5, 7, 9, 11};
        for (int num : listNum) {
            if (num == userNum) {
                position = count;
                return position;
            }
            count++;
        }
     return position;   
    }
}
