/*
 h.      Get the articles sold out. 

Create a HashMap with article keys and article names. For example, "TS"->"T-shirt", "PO"->"Pull over"...
Create another HashMap with the quantity of each article. For example, "TS"->2, "PO"->0.
Show the articles which are sold out (quantity equals 0). Show the name of these articles.
Note: insert more than one article sold out.*/
package com.daw.programming;

import java.util.HashMap;

public class Challenge5_20h {

    public static void main(String[] args) {
        HashMap<String, String> producto = new HashMap();
        HashMap<String, Integer> stock = new HashMap();

        producto.put("TS", "T-Shirt");
        stock.put("TS", 2);

        producto.put("PO", "Pull Over");
        stock.put("PO", 0);

        producto.put("BA", "Ball");
        stock.put("BA", 0);

        for (String product : producto.keySet()) {
            String nombreProducto = producto.get(product);
            int cantidadStock = stock.get(product);
            if (cantidadStock == 0) {
                System.out.println("El producto "+nombreProducto+" esta actualmente sin Stock");
            }
        }

    }

}
