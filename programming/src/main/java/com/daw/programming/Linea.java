/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

/**
 *
 * @author Alumnado
 */
public class Linea extends Figuras2d {

    private int corX2;
    private int corY2;

    public Linea(String color, int corX, int corY, int corX2, int corY2) {
        super(color, corX, corY);
        this.corX2 = corX2;
        this.corY2 = corY2;
    }
}
