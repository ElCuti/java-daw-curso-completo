/*
 i.      Get the 3 greatest numbers.

Create two ArrayList with some elements.
Get the 3 greatest numbers of the 2 ArrayLists together.*/
package com.daw.programming;

import java.util.ArrayList;

public class Challenge5_20i2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList();
        ArrayList<Integer> numbers2 = new ArrayList();
        ArrayList<Integer> highestNumbers = new ArrayList();
        numbers1.add(1);
        numbers1.add(5);
        numbers1.add(31);
        numbers1.add(26);
        numbers1.add(20);
        numbers1.add(25);
        numbers1.add(27);
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
            for (int i = highestNumbers.size()-1; i >= 0; i--) {
                if (number1 > highestNumbers.get(i)) {
                    for (int j = 0; j != i+1; j++) {
                        if (j == i) {
                            highestNumbers.set(j, number1);
                        } else {
                            highestNumbers.set(j, highestNumbers.get(j+1));
                        }
                    }
                    break;
                }
            }

        }
        System.out.println(highestNumbers);

    }
}
