package com.daw.programming;

import java.util.Scanner;

/*
r.       [ADVANCED] “Odd” number triangle.

Ask to the user for a number of rows.

Write a program to show a triangle like the following (this is if the user enters the number 5):
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
 */
public class Challenge3_16r {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        int number = 0;
        System.out.println("Escribe un numero positivo");
        int rowLimit = keyboard1.nextInt();
        int count = 0;
        for (int rows = 1; rows <= rowLimit; rows++) {
            number = rows * 2 - 1;
            count++;
            System.out.println();
            for (int column = 1; column <= rows; column++) {
                System.out.print(number);
                System.out.print(" ");
                number -= 2;
            }
        }
    }
}
