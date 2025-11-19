/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.Scanner;

/**
 *
 * @author jc324
 */
public class Challenge4_3 {

    public static void main(String[] args) {
        double precioFinal = 0;
        double tax = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el precio de los productos a comprar: ");
        int precio = keyboard.nextInt();
        precioReal(precio);

    }

    public static void precioReal(int precio) {
        String IVA = "";
        double tax = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ahora di que tipo de IVA paga: [S]uperreducido (4%), [R]educido (10%) o [G]eneral (21%)");
        do {
            IVA = keyboard.nextLine();
            IVA = IVA.toLowerCase();
        } while (!IVA.equals("s") && !IVA.equals("r") && !IVA.equals("g"));
        System.out.print("El precio final de tu compra es ");
        
        if (IVA.equals("s")) {
            tax = 0.04;
        } else if (IVA.equals("r")) {
            tax = 0.1;
        } else {
            tax = 0.21;
        }
        double precioFinal = 0;
        precioFinal = precio * (1 + tax);
        System.out.print(precioFinal + "eur con un " + tax * 100 + "% aplicados de impuestos");
        if (precioFinal < 50) {
            precioFinal += 8;
            System.out.print(" y ademas le cobramos 8 eur de envio por ser un pedido inferior a 50 eur");
        }
        System.out.print(" lo que daria un precio final de " + precioFinal + " eur");
    }
}
