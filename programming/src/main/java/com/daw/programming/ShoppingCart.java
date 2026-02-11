/*
 */
package com.daw.programming;

import java.util.HashMap;



public class ShoppingCart {

    HashMap<Product, Integer> productos = new HashMap();

    public ShoppingCart() {
    }

    public void addProduct(Product producto) {
        int timesInCart = productos.get(producto);
        productos.put(producto, timesInCart+1);
    }

    public void removeProduct(Product producto) {
        productos.remove(producto);
    }

    public float cartPrice() {
        float totalPrice = 0;
        for (Product producto : productos.keySet()) {
            float price = producto.getPrice();
            totalPrice += price;
        }
        return totalPrice;
    }
}
