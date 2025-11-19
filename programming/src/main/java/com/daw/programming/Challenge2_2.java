package com.daw.programming;

/**
 * a) Create a new Java class called "Challenge2_2.java" and create the
 * following variables by choosing the most appropriated data type (assign a
 * value to each one):
 *
 * A variable to store the radius of the Earth. A variable to store the height
 * of a person. A variable to store if the lights are on or off. A variable to
 * store the size of a T-shirt (S, M, L or XL). A variable to store the maximum
 * PI decimals possible. A variable to store one million. A variable to store
 * one trillion. A variable to store a password. b) Show this variables on your
 * computer screen.
 */
public class Challenge2_2 {

    /*
    Parte A
     */
    public static void main(String[] args) {
        short radiusEarth = 6378;
        float height = 1.8f;
        boolean lightIsOn = false;
        char size = 'M';
        double piNumber = 3.1415191812391238;
        int oneMillion = 1000000;
        long oneTrillion = 1000000000000l;
        String password = "password123";

        /*
    Parte B
         */
        System.out.println(radiusEarth);
        System.out.println(height);
        System.out.println(lightIsOn);
        System.out.println(size);
        System.out.println(piNumber);
        System.out.println(oneMillion);
        System.out.println(oneTrillion);
        System.out.println(password);
    }
}
