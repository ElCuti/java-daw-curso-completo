/**
 * Ejercicio de internet, no de clase
 * Descripción: Lee N enteros, guarda en int[], devuelve otro array con los valores pares en orden inverso.
 * Entradas: N seguido de N números.
 * Salida ejemplo: entrada 5 1 4 3 8 2 → salida 2 8 4.* */
package com.daw.programming;

import java.util.Random;

public class Challenge5_extra {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int[] orderNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            int numberToAdd = random.nextInt(30);
            if (numberToAdd % 2 == 0) {
                numbers[i] = numberToAdd;
                orderNumbers[9 - i] = numberToAdd;

            }
        }
        for (int number : orderNumbers) {
            if (number != 0) {
                System.out.println(number);
            }
        }

    }

}
