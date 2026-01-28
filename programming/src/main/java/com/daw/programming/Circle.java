/*
CHALLENGE 6_5
 */
package com.daw.programming;

public class Circle {

    float radius;
    static int numberOfCicles = 0;

    public Circle(float circleRadius) {
        radius = circleRadius;
        numberOfCicles++;
    }

    public static void printNumberOfCircles() {
        System.out.println("Number of circles is: " + numberOfCicles);
    }

    public double Perimeter() {
        return radius * Math.PI * 2;
    }

    public double Area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        printNumberOfCircles();
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);
        printNumberOfCircles();
        System.out.println("-- CIRCLE 1 --");
        System.out.println(circle1.Perimeter());
        System.out.println(circle1.Area());
        System.out.println("-- CIRCLE 2 --");
        System.out.println(circle2.Perimeter());
        System.out.println(circle2.Area());

    }

}
