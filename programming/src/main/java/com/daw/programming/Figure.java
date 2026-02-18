package com.daw.programming;

import java.awt.Graphics;

abstract class Figure {

    private String color;
    private int corX;
    private int corY;
    abstract void print();
    abstract void draw(Graphics g);

    public Figure(String color, int corX, int corY) {
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

}
