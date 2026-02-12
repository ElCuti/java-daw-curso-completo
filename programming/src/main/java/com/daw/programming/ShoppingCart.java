/*
 */
package com.daw.programming;

import java.util.HashMap;

public class ShoppingCart {

    HashMap<Product, Integer> productos = new HashMap();

    public ShoppingCart() {
    }

    public void addProduct(Product producto) {
        if (productos.containsKey(producto)) {
            int timesInCart = productos.get(producto);
            productos.put(producto, timesInCart + 1);
        } else {
            productos.put(producto, 1);
        }
    }

    public void addProduct(Product producto, int repeticiones) {
        if (repeticiones < 0) {
            System.out.println("ERROR: Pon una cantidad correcta!");
        } else {
            productos.put(producto, repeticiones);
        }
    }

    public void removeProduct(Product producto) {
        productos.remove(producto);
    }

    public float cartPrice() {
        float totalPrice = 0;
        for (Product producto : productos.keySet()) {
            int timesInCart = productos.get(producto);
            float price = producto.getPrice();
            totalPrice += price * timesInCart;
        }
        return totalPrice;
    }
}
