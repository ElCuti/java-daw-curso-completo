/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.awt.Color;
import java.awt.Graphics;

public class Ovalo extends Figure {

    private int width;
    private int height;

    public Ovalo(Color color, int corX, int corY, int width, int height) {
        super(color, corX, corY);
        this.width = width;
        this.height = height;
    }

    void print() {
        System.out.println("Soy un ovalo, empiezo en la cordenada " + getCorX() + "," + getCorY() + " y mi altura es " + getHeight() + " y mi anchura es " + getWidth());
    }

    void draw(Graphics g) {
        g.drawOval(getCorX(), getCorY(), width, height);
    }

    public void moveFigure(int movX, int movY) {
        setCorX(getCorX() + movX);
        setCorY(getCorY() + movY);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
