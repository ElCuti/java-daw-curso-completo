package com.daw.programming;

import java.awt.Color;
import java.awt.Graphics;

abstract class Figure {

    private Color color;
    private int corX;
    private int corY;
    private static double zoom = 1;

    abstract void print();

    abstract void draw(Graphics g);

    abstract void moveFigure(int movX, int movY);

    public Figure(Color color, int corX, int corY) {
        this.color = color;
        this.corX = corX;
        this.corY = corY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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

    public static double getZoom() {
        return zoom;
    }

    public static void setZoom(double aZoom) {
        zoom = aZoom;
    }
}
