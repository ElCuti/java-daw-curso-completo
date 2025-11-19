/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

/**
 * Create a new function to calculate the “net price” of an item (price with
 * taxes). The function should receive the “gross price” (price before taxes)
 * calculate the final price with a 21% of taxes. Write what the final price
 * would be.
 *
 * Call to the functions 3 times with different prices.
 *
 * b) Add to the price the shipment cost. If the final price is lower than 50,
 * you should add 8€ of shipment cost, otherwise the shipment cost it is free.
 *
 * c) Modify the function to receive a new parameter to indicate if the product
 * is in the category of “super-reduced” VAT (4%), “reduced” (10%) or general
 * (21%).
 */
public class Challenge4_2 {

    public static void main(String[] args) {
        for (int count = 0; count != 3; count++) {
            prueba1();
        }
    }

    public static void prueba1() {
        System.out.println("Test1");
    }
}
