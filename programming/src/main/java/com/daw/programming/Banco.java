package com.daw.programming;

public class Banco implements Posesion {

    private double valorCuenta;

    public Banco(double valorCuenta) {
        this.valorCuenta = valorCuenta;

    }

    @Override
    public double valorTotal() {
        return getValorCuenta();
    }

    public double getValorCuenta() {
        return valorCuenta;
    }

    public void setValorCuenta(double valorCuenta) {
        this.valorCuenta = valorCuenta;
    }

    @Override
    public double impuesto() {
        return 0;
    }

}
