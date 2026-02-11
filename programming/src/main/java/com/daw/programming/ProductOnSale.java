/*
 */
package com.daw.programming;

public class ProductOnSale extends Product {

    private float discount;

    public ProductOnSale(String name, float price, float discount) {
        super(name, price);
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public float getPrice() {
        return super.getPrice() * (1 - (discount / 100));
    }
}
