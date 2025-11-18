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
public class Challenge4_2 {

    public static void main(String[] args) {
        double precioFinal=0;
        String IVA = "";
        Scanner keyboard = new Scanner(System.in);
         System.out.println("Introduce el precio de los productos a comprar: ");
        int precio = keyboard.nextInt();
        System.out.println("Ahora di que tipo de IVA paga: [S]uperreducido (4%), [R]educido (10%) o [G]eneral (21%)");
        do{
        IVA = keyboard.nextLine();
        IVA = IVA.toLowerCase();
        }while(!IVA.equals("s") && !IVA.equals("r") && !IVA.equals("g"));
        System.out.print("El precio final de tu compra es: ");
        if (IVA.equals("s")){
            precioFinal= precioSuperreducido(precio);
            System.out.print(precioFinal+"eur con un 4% de impuestos");
        }
        else if (IVA.equals("r")){
            precioFinal =precioReducido(precio);
                        System.out.print(precioFinal+"eur con un 10% de impuestos");

        }
        else{
            precioFinal= precioGeneral(precio);
                        System.out.print(precioFinal+"eur con un 21% de impuestos");

        }
        if (precioFinal < 50){
            precioFinal +=8;
                        System.out.print(" y ademas le cobramos 8 eur de envio por ser un pedido inferior a 50eur");

        }
        System.out.print(" lo que daria un precio final de "+precioFinal);
        
    }

    public static double precioSuperreducido(int precio) {
        double precioFinal = 0;
        precioFinal = precio*1.04;
        return precioFinal;
    }
    public static double precioReducido(int precio) {
        double precioFinal = 0;
        precioFinal = precio*1.1;
        return precioFinal;
    }
    public static double precioGeneral(int precio) {
        double precioFinal = 0;
        precioFinal = precio*1.21;
        return precioFinal;
    }
}
