package com.daw.programming;

public class Rectangulo extends Figure {

    private float width;
    private float height;

    public Rectangulo(String color, int corX, int corY, float width, float height) {
        super(color, corX, corY);
        this.width = width;
        this.height = height;
    }

    public void print() {
        System.out.println("Soy un rectangulo, empiezo en la cordenada " + getCorX() + "," + getCorY() + " y mi altura es " + getHeight() + " y mi anchura es " + getWidth());
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
