package com.daw.programming;

public class Coche implements Posesion {

    private double valorBase;
    private int kilometer;

    public Coche(double valorBase, int kilometer) {
        this.valorBase = valorBase;
        this.kilometer = kilometer;
    }

    @Override
    public double valorTotal() {
        return getValorBase() - getValorBase() * 0.1 * (getKilometer() / 10000);
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public double impuesto() {
        return valorTotal() * 0.1;
    }
}
