package com.daw.programming;

import java.util.Scanner;

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
            for (int column = 1; column <= count; column++) {
                System.out.print(number);
                System.out.print(" ");
                number -= 2;
            }
        }
    }
}
