package com.daw.programming;

public class Triangulo extends Figure {

    private int corX2;
    private int corY2;
    private int corX3;
    private int corY3;

    public Triangulo(String color, int corX, int corY, int corX2, int corY2, int corY3, int corX3) {
        super(color, corX, corY);
        this.corX2 = corX2;
        this.corY2 = corY2;
        this.corX3 = corX3;
        this.corY3 = corY3;

    }

    public void print() {
        System.out.println("Soy un triangulo, mis esquinas estan en: (" + getCorX() + "," + getCorY() + "), (" + getCorX2() + "," + getCorY2() + ") y (" + getCorX3() + "," + getCorY3() + ").");
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

    public int getCorX3() {
        return corX3;
    }

    public void setCorX3(int corX3) {
        this.corX3 = corX3;
    }

    public int getCorY3() {
        return corY3;
    }

    public void setCorY3(int corY3) {
        this.corY3 = corY3;
    }

}
