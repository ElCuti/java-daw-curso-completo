package com.daw.programming;

abstract class Posesiones {
    private double purchasePrice;
    abstract double valorTotal();
    
    public Posesiones(double purchasePrice){
        this.purchasePrice=purchasePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    
    
}
