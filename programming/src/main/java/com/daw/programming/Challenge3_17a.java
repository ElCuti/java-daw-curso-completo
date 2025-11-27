package com.daw.programming;

import java.util.Scanner;

/*
a. “Odd” and "Even" number triangle.

Ask to the user for a number of rows.

Write a program to show a triangle like the following (this is if the user enters the number 5):

1
24
135
2468
13579
 */
public class Challenge3_17a {

    public static void main(String[] args) {
        int row = 0;
        int column = 0;
        int count = 0;
        int number = 1;

        Scanner keyboard1 = new Scanner(System.in);

        System.out.println("Escribe un numero positivo");
        int userNumber = keyboard1.nextInt();

        for (row = 0; row < userNumber; row++) {
            count++;
            System.out.println();
            for (column = 1; column <= count; column++) {
                System.out.print(number);
                number += 2;
            }
            if (row % 2 != 0) {
                number = 1;
            } else {

                number = 2;
            }
        }
    }
}
