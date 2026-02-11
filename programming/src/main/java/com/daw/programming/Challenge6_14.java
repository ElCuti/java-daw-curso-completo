/*
 In this challenge you would have to design different classes.
We are going to have products in a e-commerce. Each product has a name and a price.
We also have "products on sale" (productos en oferta). Each "product on sale" has a discount (in addition to the fields of the normal products).
We are going to have a "Shopping cart" in which we will introduce the products we want to buy (we buy exactly one element of each product).
The "shopping cart" have to calculate the total price of the articles.
b)
Modify the shopping cart to insert the quantity desired of each product.*/
package com.daw.programming;

public class Challenge6_14 {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product001 = new Product("Destornillador", 6);
        Product product002 = new Product("Tornillos(x100)", 2);
        Product product003 = new Product("Pistola silicona", 10);
        Product product004 = new Product("Taladro", 60);
        ProductOnSale productOS1 = new ProductOnSale("Pala", 10, 20);
        cart.addProduct(product001);
        cart.addProduct(product002);
        cart.addProduct(productOS1);
        System.out.println(cart.cartPrice());

    }

}
