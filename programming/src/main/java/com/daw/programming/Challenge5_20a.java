/*
a.      Calculate the average temperature.

Create a function that calculates the average temperature of a day by using the lower and upper temperature of this day.

Create a main program asking to the user for a lower and upper temperature of each day and by using the function shows the average temperature.

Repeat the program 7 times.
 */
package com.daw.programming;

import java.util.Scanner;

public class Challenge5_20a {

    public static int average(int max, int min) {
        int averageT = (max + min) / 2;
        return averageT;
    }

    public static void main(String[] args) {
        String[] daysOfWeek = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (int count = 0; count != daysOfWeek.length; count++) {
            Scanner keyboard1 = new Scanner(System.in);
            System.out.println("Pon la temperatura maxima del " + daysOfWeek[count]);
            int max = keyboard1.nextInt();
            System.out.println("Pon la temperatura minima del " + daysOfWeek[count]);
            int min = keyboard1.nextInt();
            int averageT = average(max, min);
            System.out.println("El " + daysOfWeek[count] + " va a hacer de media " + averageT + " grados");
        }
    }

}
