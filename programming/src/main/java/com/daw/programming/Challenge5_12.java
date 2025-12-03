package com.daw.programming;

import java.util.ArrayList;

/**
 *
 * @author Alumnado
 */
public class Challenge5_12 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        int limit = 10;
        for (int count = 0; count != limit; count++) {
            numbers.add(count);
        }

        /*A*/
        numbers.add(3, 88);
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
