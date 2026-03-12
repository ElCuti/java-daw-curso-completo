
package com.daw.programming;

public class Casa extends Posesion {
    private int age;
    
    
    public Casa(double purchasePrice, int age){
        super(purchasePrice);
        this.age=age;
    }

    @Override
    double valorTotal() {
        return getPurchasePrice() * Math.pow(1.1, getAge());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
