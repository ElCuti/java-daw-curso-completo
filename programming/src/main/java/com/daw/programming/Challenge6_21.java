package com.daw.programming;

import static java.awt.Color.blue;
import static java.awt.Color.red;
import static java.awt.Color.yellow;
import java.util.ArrayList;
import java.util.Collections;

public class Challenge6_21 {

    public static void main(String[] args) {
        ArrayList<Rectangulo> rectangulos = new ArrayList();
        Rectangulo rectangulo1 = new Rectangulo(blue, 100, 100, 100, 100);
        Rectangulo rectangulo2 = new Rectangulo(yellow, 150, 150, 150, 150);
        Rectangulo rectangulo3 = new Rectangulo(red, 200, 200, 200, 200);
        rectangulos.add(rectangulo1);
        rectangulos.add(rectangulo2);
        rectangulos.add(rectangulo3);

        Collections.sort(rectangulos);
        System.out.println(rectangulos);

    }

}
