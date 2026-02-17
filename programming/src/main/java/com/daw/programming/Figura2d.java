/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.ArrayList;

/**
 *
 * @author Alumnado
 */
public class Figura2d {

    private String color;
    private int corX;
    private int corY;

    public Figura2d(String color, int corX, int corY) {
        this.color = color;
        this.corX = corX;
        this.corY = corY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCorX() {
        return corX;
    }

    public void setCorX(int corX) {
        this.corX = corX;
    }

    public int getCorY() {
        return corY;
    }

    public void setCorY(int corY) {
        this.corY = corY;
    }

    public void print() {
        System.out.println("Soy una figura, empiezo en la cordenada " + getCorX() + "," + getCorY());
    }
}
