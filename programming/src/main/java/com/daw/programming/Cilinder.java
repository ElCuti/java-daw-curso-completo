/** Create the class Cilinder which inherits from Circle.
 *
 * A Cylinder needs the radius to define the Circle in both sides and the height.
 *
 * a)
 *
 * Now, add a method to Cylinder to calculate the volume of the cylinder.
 *
 * The volume of the cylinder is equals to the area of the Circle multiplied by the height.
 *
 * For example, for a Cylinder of radius 4 cm and height 8 cm, its volume would be: 402,12 cm3.
 *
 * b)  *
 * Modify the method to get the area of the cylinder to get its right area. The area of the cylinder is equals to the area of the lower circle + the area of the upper circle + the perimeter of the circle multiplied by the height.
 *
 * For example, for a Cylinder of radius 4 cm and height 8 cm, its area would be: 301.59 cm2.* */
package com.daw.programming;

public class Cilinder extends Circle {

    private double height;

    public Cilinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return super.area() * height;
    }

    public double area() {

        return 2 * super.area() + super.perimeter() * height;
    }

    public static void main(String[] args) {
        Cilinder cilinder1 = new Cilinder(4, 8);
        System.out.println("El volumen de un cilindro con radio = " + cilinder1.getRadius() + " cm y con altura = " + cilinder1.getHeight() + " cm es de ~" + Math.round(cilinder1.area()) + " centimetros cubicos");
    }

}
