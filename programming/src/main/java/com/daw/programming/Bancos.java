package com.daw.programming;

public class Bancos extends Posesion {

    public Bancos(double purchasePrice) {
        super(purchasePrice);

    }

    @Override
    double valorTotal() {
        return getPurchasePrice();
    }

}
