/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.Scanner;

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
public class Challenge4_3 {

    public static void main(String[] args) {
        String IVA = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el precio de los productos a comprar: ");
        int precio = keyboard.nextInt();
        System.out.println("Ahora di que tipo de IVA paga: [S]uperreducido (4%), [R]educido (10%) o [G]eneral (21%)");
        do {
            IVA = keyboard.nextLine();
            IVA = IVA.toLowerCase();
        } while (!IVA.equals("s") && !IVA.equals("r") && !IVA.equals("g"));
        System.out.print("El precio final de tu compra es ");
        precioReal(precio, IVA);

    }

    public static void precioReal(int precio, String IVA) {
        double tax = 0;
        if (IVA.equals("s")) {
            tax = 0.04;
        } else if (IVA.equals("r")) {
            tax = 0.1;
        } else {
            tax = 0.21;
        }
        double precioFinal = precio * (1 + tax);
        System.out.print(precioFinal + "eur con un " + tax * 100 + "% aplicados de impuestos");
        if (precioFinal < 50) {
            precioFinal += 8;
            System.out.print(" y ademas le cobramos 8 eur de envio por ser un pedido inferior a 50 eur");
        }
        System.out.print(" lo que daria un precio final de " + precioFinal + " eur");
    }
}
