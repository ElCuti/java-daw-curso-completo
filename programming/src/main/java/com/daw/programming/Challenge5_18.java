package com.daw.programming;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Take the exercise 5_15 and modify it to count how many times is duplicated
 * each element.
 */
public class Challenge5_18 {

    public static void main(String[] args) {
        int numbers[] = {1, 4, 3, 5, 7, 3, 9, 4, 1, 1, 1, 2, 1, 1};
        HashMap<Integer, Integer> numberCoincidence = new HashMap();
        for (int count = 0; count != numbers.length; count++) {
            int coincidences = 0;
            if (numberCoincidence.containsKey(numbers[count])) {
                coincidences = numberCoincidence.get(numbers[count]);
                coincidences++;
            }
            numberCoincidence.put(numbers[count], coincidences);
        }
        for (int number : numberCoincidence.keySet()) {
            int times = numberCoincidence.get(number);
            if (times != 0) {
                String repeticion = "repeticiones";
                if (times == 1) {
                    repeticion = "repeticion";
                }
                System.out.println("El numero " + number + " tiene " + times + " " + repeticion);
            }
        }

    }

}
