package com.daw.programming;

public class Casa implements Posesion {

    private int age;
    private double valorBase;
    private static int numeroDeCasas = 0;

    public Casa(double valorBase, int age) {
        this.valorBase = valorBase;
        this.age = age;
        numeroDeCasas++;
    }

    @Override
    public double valorTotal() {
        return getValorBase() + getValorBase() * 0.1 * getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public double impuesto() {
        if (numeroDeCasas > 1) {
            return valorTotal() * 0.1;
        } else {
            return 0;
        }
    }

}
