package com.daw.programming;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo extends Figure {

    private int width;
    private int height;

    public Rectangulo(Color color, int corX, int corY, int width, int height) {
        super(color, corX, corY);
        this.width = width;
        this.height = height;
    }

    public void print() {
        System.out.println("Soy un rectangulo, empiezo en la cordenada " + getCorX() + "," + getCorY() + " y mi altura es " + getHeight() + " y mi anchura es " + getWidth());
    }
    
    public void draw(Graphics g) {
        g.drawRect(getCorX(), getCorY(), width, height);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
