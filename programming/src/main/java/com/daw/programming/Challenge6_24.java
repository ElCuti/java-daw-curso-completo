package com.daw.programming;

import java.util.ArrayList;

public class Challenge6_24 {

    public static void main(String[] args) {
        double valorTotal = 0;
        ArrayList<Posesion> persona1 = new ArrayList();
        Banco banco1 = new Banco(12000);
        Banco banco2 = new Banco(2000);
        Coche coche1 = new Coche(15000, 300000);
        Casa casa = new Casa(100000, 10);
        persona1.add(banco1);
        persona1.add(banco2);
        persona1.add(coche1);
        persona1.add(casa);

        for (Posesion propiedad : persona1) {
            valorTotal += propiedad.valorTotal();
        }
        System.out.println("El patrimonio total es de: " + Math.round(valorTotal));
    }

}
