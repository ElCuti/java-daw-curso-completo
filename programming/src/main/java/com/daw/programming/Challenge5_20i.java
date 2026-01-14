/*
 i.      Get the 3 greatest numbers.

Create two ArrayList with some elements.
Get the 3 greatest numbers of the 2 ArrayLists together.*/
package com.daw.programming;

import java.util.ArrayList;
import java.util.Random;

public class Challenge5_20i {

    public static ArrayList<Integer> top3(ArrayList<Integer> numbers1, ArrayList<Integer> highestNumbers) {
        int lowerNumber = 0;
        for (int number1 : numbers1) {
            int numberToAdd = 0;
            boolean changeMin = false;
            int count = 0;
            for (int highest : highestNumbers) {
                count++;
                if (count == 1) {
                    lowerNumber = highest;
                }
                if (number1 > highest) {
                    numberToAdd = number1;
                    if (highest <= lowerNumber) {
                        lowerNumber = highest;
                        changeMin = true;
                    }
                }
            }
            if (changeMin) {
                int position = highestNumbers.indexOf(lowerNumber);
                highestNumbers.remove(position);
                highestNumbers.add(numberToAdd);

            }
        }
        return highestNumbers;
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers1 = new ArrayList();
        ArrayList<Integer> numbers2 = new ArrayList();
        ArrayList<Integer> highestNumbers = new ArrayList();
        for (int i = 0; i != 1000; i++) {
            numbers1.add(random.nextInt(15000));
        }
        for (int i = 0; i != 1000; i++) {
            numbers2.add(random.nextInt(15000));
        }
        highestNumbers.add(0);
        highestNumbers.add(0);
        highestNumbers.add(0);
        top3(numbers1, highestNumbers);
        top3(numbers2, highestNumbers);
        System.out.println(highestNumbers);
    }

}
