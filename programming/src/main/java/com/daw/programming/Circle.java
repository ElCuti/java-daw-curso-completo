/*
CHALLENGE 6_5
 */
package com.daw.programming;

public class Circle {

    private float radius;
    private static int numberOfCicles = 0;

    public Circle(float radius) {
        this.radius = radius;
        numberOfCicles++;
    }

    public static void printNumberOfCircles() {
        System.out.println("Number of circles is: " + getNumberOfCicles());
    }

    public double perimeter() {
        return getRadius() * Math.PI * 2;
    }

    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public static int getNumberOfCicles() {
        return numberOfCicles;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        printNumberOfCircles();
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);
        printNumberOfCircles();
        System.out.println("-- CIRCLE 1 --");
        System.out.println(circle1.perimeter());
        System.out.println(circle1.area());
        System.out.println("-- CIRCLE 2 --");
        System.out.println(circle2.perimeter());
        System.out.println(circle2.area());

    }

}
