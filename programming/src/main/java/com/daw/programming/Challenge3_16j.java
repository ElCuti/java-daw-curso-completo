package com.daw.programming;

import java.util.Scanner;

/*
j.       [ADVANCED] Shopping list.
The user have to introduce by keyboard the list of products in a shopping list separated by commas.
Show each product in a different line.
 */
public class Challenge3_16j {

    public static void main(String[] args) {
        String product = "";
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe tu lista de la compra de la siguiente manera: Macarrones,Tomate,Mayonesa...");
        String shopList = keyboard1.nextLine();
        System.out.println("Tu lista de la compra es: ");
        while (shopList.indexOf(",") != -1) {
            int index = shopList.indexOf(",");
            product = shopList.substring(0, index);
            shopList = shopList.substring(index + 1, shopList.length());
            System.out.println("");
            System.out.print("- " + product);
        }
        System.out.println("");
        System.out.println("- " + shopList);
    }
}
