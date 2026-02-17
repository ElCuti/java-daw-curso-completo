
package com.daw.programming;

public class Linea extends Figure {

    private int corX2;
    private int corY2;

    public Linea(String color, int corX, int corY, int corX2, int corY2) {
        super(color, corX, corY);
        this.corX2 = corX2;
        this.corY2 = corY2;
    }

    public void print() {
        System.out.println("Soy una linea, empiezo en la cordenada " + getCorX() + "," + getCorY() + " y termino en la coordenada " + getCorX2() + "," + getCorY2());
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
