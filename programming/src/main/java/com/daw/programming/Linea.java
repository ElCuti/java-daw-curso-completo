package com.daw.programming;

import java.awt.Color;
import java.awt.Graphics;

public class Linea extends Figure {

    private int corX2;
    private int corY2;

    public Linea(Color color, int corX, int corY, int corX2, int corY2) {
        super(color, corX, corY);
        this.corX2 = corX2;
        this.corY2 = corY2;
    }

    public void print() {
        System.out.println("Soy una linea, empiezo en la cordenada " + getCorX() + "," + getCorY() + " y termino en la coordenada " + getCorX2() + "," + getCorY2());
    }

    public void draw(Graphics g) {
        g.drawLine((int) (getCorX()*getZoom()), (int) (getCorY()*getZoom()), (int) (corX2*getZoom()), (int) (corY2*getZoom()));
    }

    public void moveFigure(int movX, int movY) {
        setCorX(getCorX() + movX);
        setCorY(getCorY() + movY);
        setCorX2(getCorX2() + movX);
        setCorY2(getCorY2() + movY);
    }

    public int getCorX2() {
        return corX2;
    }

    public void setCorX2(int corX2) {
        this.corX2 = corX2;
    }

    public int getCorY2() {
        return corY2;
    }

    public void setCorY2(int corY2) {
        this.corY2 = corY2;
    }
}
