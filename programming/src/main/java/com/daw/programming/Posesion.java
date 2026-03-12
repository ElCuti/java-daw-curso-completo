package com.daw.programming;

abstract class Posesion {

    private double purchasePrice;

    abstract double valorTotal();

    public Posesion(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

}
