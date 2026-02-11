/*
 */
package com.daw.programming;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> productos = new ArrayList<Product>();

    public ShoppingCart() {
    }

    public void addProduct(Product producto) {
        productos.add(producto);
    }

    public void removeProduct(Product producto) {
        productos.remove(producto);
    }

    public float cartPrice() {
        float totalPrice = 0;
        for (Product producto : productos) {
            float price = producto.getPrice();
            totalPrice += price;
        }
        return totalPrice;
    }
}
