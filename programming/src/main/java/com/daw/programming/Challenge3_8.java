package com.daw.programming;

public class Challenge3_8 {

    public static void main(String[] args) {
        int row = 0;
        int column = 0;
        int count = 0;

        System.out.println("Ejercicio A");
        /*
        A
         */
        for (row = 1; row <= 7; row++) {
            count++;
            System.out.println();
            for (column = 1; column <= count; column++) {
                System.out.print("#");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Ejercicio B");
        /*
        B
         */
        count = 0;
        for (row = 1; row <= 7; row++) {
            count++;
            System.out.println();
            for (column = 8; column > count; column--) {
                System.out.print("#");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Ejercicio C");
        /*
        C
         */
        int rowLimit = 7;
        for (row = 1; row <= rowLimit; row++) {

            for (column = 1; column <= rowLimit - row; column++) {
                System.out.print(" ");
            }
            for (column = 1; column <= 2 * row - 1; column++) {
                System.out.print("#");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();
        System.out.println("Ejercicio D");
        /*
        D
         */
        count = 0;
        for (row = 1; row <= 7; row++) {
            count++;
            System.out.println();
            for (column = 1; column <= count; column++) {
                System.out.print("#");
            }
        }
        count = 1;
        for (row = 1; row <= 7; row++) {
            count++;
            System.out.println();
            for (column = 8; column > count; column--) {
                System.out.print("#");
            }
        }
    }
}

/*
int rows = 7;
for (int i=1;i<=rows;i++) {
    for (int x=1; x>=rows-1; x++){
        System.out.print(" ");
    }
    for (int j=1;j<=i;j++){
        System.out.print("#");
    }
    System.out.println("");
 */
