package com.daw.programming;

public class Coches extends Posesiones {

    private int kilometer;

    public Coches(float purchasePrice, int kilometer) {
        super(purchasePrice);
        this.kilometer = kilometer;
    }

    @Override
    double valorTotal() {
        return getPurchasePrice() * Math.pow(0.9, Math.round(getKilometer() / 10000));
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }
}
