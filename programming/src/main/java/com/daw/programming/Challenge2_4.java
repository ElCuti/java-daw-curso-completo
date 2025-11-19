package com.daw.programming;

/**
 * Create a new Java class called "Challenge2_4.java".
 *
 * Create a variable with a price.
 *
 * Calculate the 21% of V.A.T.
 *
 * Print the original price, the V.A.T. calculated and the price with V.A.T.
 */
public class Challenge2_4 {

    public static void main(String[] args) {
        int price = 10;
        System.out.println("The price without V.A.T is: " + price + "$");
        float tax = 1.21f;
        float totalPrice = price * tax;
        float priceTax = totalPrice - price;
        System.out.println("The price with V.A.T is: " + totalPrice + "$. You pay: " + priceTax + "$ from taxes");
    }
}
