/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

/**
 *
 * @author Alumnado
 */
public class Rectangulo extends Figura2d {

    private float width;
    private float height;

    public Rectangulo(String color, int corX, int corY, float width, float height) {
        super(color, corX, corY);
        this.width = width;
        this.height = height;
    }

    public void print() {
        System.out.println("Soy un rectangulo, empiezo en la cordenada " + getCorX() + "," + getCorY() + " y mi altura es "+ getHeight()+" y mi anchura es "+getWidth());
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
