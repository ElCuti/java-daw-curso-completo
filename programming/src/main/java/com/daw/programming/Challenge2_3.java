package com.daw.programming;

/**
 * Create a new Java class called "Challenge2_3.java".
 *
 * Create two variables with a number each one.
 *
 * Print the result of making an addition, a substraction, a multiplication and
 * a division of this two variables in the screen.
 */
public class Challenge2_3 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2;
        System.out.println("The result of " + num1 + " + " + num2 + " is: " + result1);
        System.out.println("The result of " + num1 + " - " + num2 + " is: " + result2);
        System.out.println("The result of " + num1 + " * " + num2 + " is: " + result3);
        System.out.println("The result of " + num1 + " / " + num2 + " is: " + result4);
    }
}
