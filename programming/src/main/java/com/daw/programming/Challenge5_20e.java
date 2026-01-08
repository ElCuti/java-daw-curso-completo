/*
e.      Get the average removing far values.
Create an array with some numbers.

Calculate the average of this numbers.

Calculate the average again removing duplicated values.

Calculate the average again without the numbers with a distance of more than 3 points to the average.*/
package com.daw.programming;

import java.util.ArrayList;

public class Challenge5_20e {

    public static void main(String[] args) {
        float average = 0;
        float count = 0;
        float[] numbers = {1, 5, 8, 10, 12, 15, 20, 15, 1, 20};
        ArrayList<Float> repeatNumbers = new ArrayList<Float>();
        ArrayList<Float> nearNumbers = new ArrayList<Float>();

        for (float number : numbers) {
            if (!repeatNumbers.contains(number)) {
                average += number;
                count++;
                repeatNumbers.add(number);
            }
        }
        average /= count;
        System.out.println("La media de la lista es sin repetidos es: " + average);
        for (float number : numbers) {
            if (number < average + 3 && number > average - 3) {
                nearNumbers.add(number);
            }
        }
        System.out.println(nearNumbers);

    }

}
