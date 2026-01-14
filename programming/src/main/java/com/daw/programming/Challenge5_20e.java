/*
e.      Get the average removing far values.
Create an array with some numbers.

Calculate the average of this numbers.

Calculate the average again removing duplicated values.

Calculate the average again without the numbers with a distance of more than 3 points to the average.*/
package com.daw.programming;

import java.util.ArrayList;
import java.util.HashSet;

public class Challenge5_20e {

    public static void main(String[] args) {
        float average = 0;
        float count = 0;
        float[] numbers = {1, 5, 8, 10, 12, 15, 20, 15, 1, 20};
        HashSet<Float> repeatNumbers = new HashSet();
        ArrayList<Float> nearNumbers = new ArrayList<Float>();

        for (float number : numbers) {
            repeatNumbers.add(number);
        }
        for (float number : repeatNumbers) {
            average += number;
        }
        average /= repeatNumbers.size();
        System.out.println("La media de la lista sin repetidos es: " + average);
        for (float number : repeatNumbers) {
            if (number < average + 3 && number > average - 3) {
                nearNumbers.add(number);
            }
        }
        System.out.println("Los numeros que estan a un rango de 3 por arriba y por abajo son estos: " + nearNumbers);

    }

}
