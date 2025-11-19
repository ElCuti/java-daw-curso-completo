package com.daw.programming;

import java.util.Scanner;

/*
a.      [BEGINNER] Calculating the daily salary of a worker.
Ask to the user for the number of working hours during the day and the cost per hour.
Show the corresponding payment for this day.
 */
public class Challenge3_16a {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe lo que ganas por hora:");
        int salary = keyboard1.nextInt();
        System.out.println("Ahora escribe las horas que trabajas al dia:");
        int hourPerDay = keyboard1.nextInt();
        int salaryPerDay = salary * hourPerDay;
        System.out.println("Al dia trabajas " + hourPerDay + " y cobras por hora " + salary + "eur, ganas cada dia " + salaryPerDay + " euros");
    }
}
