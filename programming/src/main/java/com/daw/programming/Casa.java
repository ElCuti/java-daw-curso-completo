
package com.daw.programming;

public class Casa implements Posesion {
    private int age;
    private double valorBase;
    
    public Casa(double valorBase, int age){
        this.valorBase=valorBase;
        this.age=age;
    }

    @Override
    public double valorTotal() {
        return getValorBase() * Math.pow(1.1, getAge());
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
    
}
