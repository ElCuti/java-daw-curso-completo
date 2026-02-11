/*
 In this challenge you would have to design different classes.
We are going to have products in a e-commerce. Each product has a name and a price.
We also have "products on sale" (productos en oferta). Each "product on sale" has a discount (in addition to the fields of the normal products).
We are going to have a "Shopping cart" in which we will introduce the products we want to buy (we buy exactly one element of each product).
The "shopping cart" have to calculate the total price of the articles.
b)
Modify the shopping cart to insert the quantity desired of each product.*/
package com.daw.programming;

import java.util.ArrayList;

public class Challenge6_14 {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // LISTA DE PRODUCTOS
        Product product001 = new Product("Destornillador", 6);
        Product product002 = new Product("Tornillos(x100)", 2);
        Product product003 = new Product("Pistola silicona", 10);
        Product product004 = new Product("Taladro", 60);
        Product product005 = new Product("Martillo", 8);
        Product product006 = new Product("Llave inglesa", 12);
        Product product007 = new Product("Alicates", 7);
        Product product008 = new Product("Cinta métrica", 4);
        Product product009 = new Product("Nivel", 9);
        Product product010 = new Product("Sierra manual", 15);
        Product product011 = new Product("Broca 5mm", 3);
        Product product012 = new Product("Juego llaves Allen", 11);
        Product product013 = new Product("Caja herramientas", 35);
        Product product014 = new Product("Guantes trabajo", 5);
        Product product015 = new Product("Mascarilla polvo", 2);
        
        
        // LISTA DE PRODUCTOS EN DESCUENTO
        ProductOnSale productOS1 = new ProductOnSale("Pala", 10, 20);
        ProductOnSale productOS2 = new ProductOnSale("Escoba", 7, 15);
        ProductOnSale productOS3 = new ProductOnSale("Lijadora", 45, 25);
        ProductOnSale productOS4 = new ProductOnSale("Compresor pequeño", 120, 30);
        ProductOnSale productOS5 = new ProductOnSale("Linterna LED", 18, 10);
        
        cart.addProduct(product001);
        cart.addProduct(product012);
        cart.addProduct(product010);
        cart.addProduct(product009);
        cart.addProduct(product005);
        cart.addProduct(productOS5);
        
        System.out.println(cart.cartPrice());

    }

}
