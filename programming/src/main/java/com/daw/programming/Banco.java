package com.daw.programming;

public class Banco extends Posesion {

    public Banco(double purchasePrice) {
        super(purchasePrice);

    }

    @Override
    double valorTotal() {
        return getPurchasePrice();
    }

}
