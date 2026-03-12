package com.daw.programming;

public class Coches extends Posesiones {
        private int kilometer;

    
    public Coches(float purchasePrice, int kilometer){
        super(purchasePrice);
        this.kilometer=kilometer;
    }

    @Override
    float valorTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
