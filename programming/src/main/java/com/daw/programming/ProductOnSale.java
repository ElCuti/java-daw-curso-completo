/*
 */
package com.daw.programming;

public class ProductOnSale extends Product {

    private int discount;

    public ProductOnSale(String name, float price, int discount) {
        super(name, price);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
    
}
