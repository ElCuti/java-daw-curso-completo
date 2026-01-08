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
        float[] numbers = {1, 5, 10, 15, 20, 15, 1, 20};
        ArrayList<Float> repeatNumbers = new ArrayList<Float>();

        /* Primera parte */
        for (float number : numbers) {
            if (!repeatNumbers.contains(number)) {
                average += number;
                count++;
                repeatNumbers.add(number);
            }
        }
        average /= count;
        System.out.println("La media de la lista es: " + average);
        /* Segunda parte */
    }

}
