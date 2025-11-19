package com.daw.programming;

import java.util.Scanner;

/**
 * Take the class named "Challenge2_3.java" of the calculator, duplicate it and
 * rename the duplicate as "Challenge3_1.java". Modify the code to read the two
 * variables from keyboard. a) Read them as integers. b) Read them as doubles.
 */
public class Challenge3_1 {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Pon el primer numero: ");
        int num1 = keyboard1.nextInt();
        System.out.println("Pon el segundo numero: ");
        int num2 = keyboard1.nextInt();
        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2;
        System.out.println("The result of " + num1 + " + " + num2 + " is: " + result1);
        System.out.println("The result of " + num1 + " - " + num2 + " is: " + result2);
        System.out.println("The result of " + num1 + " * " + num2 + " is: " + result3);
        System.out.println("The result of " + num1 + " / " + num2 + " is: " + result4);

        System.out.println("");

        System.out.println("Pon el tercer numero (Decimales con ,): ");
        double num3 = keyboard1.nextDouble();
        System.out.println("Pon el cuarto numero (Decimales con ,): ");
        double num4 = keyboard1.nextDouble();
        double result5 = num3 + num4;
        double result6 = num3 - num4;
        double result7 = num3 * num4;
        double result8 = num3 / num4;
        System.out.println("The result of " + num3 + " + " + num4 + " is: " + result5);
        System.out.println("The result of " + num3 + " - " + num4 + " is: " + result6);
        System.out.println("The result of " + num3 + " * " + num4 + " is: " + result7);
        System.out.println("The result of " + num3 + " / " + num4 + " is: " + result8);
    }

}
