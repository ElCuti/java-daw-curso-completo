
package com.daw.programming;

public class Casa extends Posesiones {
    private int age;
    
    
    public Casa(float purchasePrice, int age){
        super(purchasePrice);
        this.age=age;
    }

    @Override
    float valorTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
