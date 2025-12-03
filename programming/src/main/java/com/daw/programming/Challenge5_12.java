package com.daw.programming;

import java.util.ArrayList;

/**
 * Create an ArrayList of Strings to store whatever you want and add some
 * elements.
 *
 * Show the elements contained in the ArrayList.
 *
 * Insert an element in the third position.
 *
 * Show the elements contained in the ArrayList.
 *
 * b)
 *
 * Show the element in the first position.
 *
 * c)
 *
 * Remove the first element in the ArrayList.
 *
 * Show the elements contained in the ArrayList.
 *
 * d)
 *
 * Change the element in the last position by another one.
 *
 * Show the elements contained in the ArrayList.
 */
public class Challenge5_12 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        int limit = 10;
        for (int count = 0; count != limit; count++) {
            numbers.add(count);
        }

        /*A*/
        numbers.add(2, 88);
        System.out.println("Ejercicio A: " + numbers);
        /*B*/
        System.out.println("Ejercicio B: " + numbers.get(0));
        /*C*/
        numbers.remove(0);
        System.out.println("Ejercicio C: " + numbers);
        /*D*/
        numbers.set(numbers.size() - 1, 99);
        System.out.println("Ejercicio D: " + numbers);
    }

}
