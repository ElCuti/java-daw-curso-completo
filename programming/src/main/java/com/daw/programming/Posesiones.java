package com.daw.programming;

abstract class Posesiones {
    private float purchasePrice;
    abstract float valorTotal();
    
    public Posesiones(float purchasePrice){
        this.purchasePrice=purchasePrice;
    }
    
    
}
