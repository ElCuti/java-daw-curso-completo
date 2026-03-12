package com.daw.programming;

public class Coche extends Posesion {

    private int kilometer;

    public Coche(double purchasePrice, int kilometer) {
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
