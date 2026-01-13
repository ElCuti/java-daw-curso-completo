/*
 i.      Get the 3 greatest numbers.

Create two ArrayList with some elements.
Get the 3 greatest numbers of the 2 ArrayLists together.*/
package com.daw.programming;

import java.util.ArrayList;

public class Challenge5_20i {

    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList();
        ArrayList<Integer> numbers2 = new ArrayList();
        ArrayList<Integer> highestNumbers = new ArrayList();
        int lowerNumber = 0;
        numbers1.add(1);
        numbers1.add(5);
        numbers1.add(10);
        numbers1.add(15);
        numbers1.add(20);
        numbers1.add(25);
        numbers1.add(30);
        numbers2.add(2);
        numbers2.add(4);
        numbers2.add(6);
        numbers2.add(8);
        numbers2.add(10);
        numbers2.add(12);
        numbers2.add(14);
        numbers2.add(16);
        numbers2.add(18);
        numbers2.add(20);
        numbers2.add(22);
        numbers2.add(24);
        numbers2.add(26);
        highestNumbers.add(0);
        highestNumbers.add(0);
        highestNumbers.add(0);
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
                highestNumbers.remove(lowerNumber);
                highestNumbers.add(numberToAdd);

            }
        }
        System.out.println(highestNumbers);

    }

}
