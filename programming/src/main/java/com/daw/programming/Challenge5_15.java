/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.HashSet;

/**
 * Take the challenge “5_8 Look for duplicates of an array” and fix it so that
 * it doesn’t show twice (or more time) each number that is duplicated.
 */
public class Challenge5_15 {

    public static void main(String[] args) {
        int numbers[] = {1, 4, 3, 5, 7, 3, 9, 4, 1, 1, 1, 2, 1, 1};
        HashSet<Integer> numbersHash = new HashSet();
        HashSet<Integer> numerosMencionados = new HashSet();

        for (int count = 0; count != numbers.length; count++) {
            if (numbersHash.contains(numbers[count]) && !numerosMencionados.contains(numbers[count])) {
                System.out.println("El numero " + numbers[count] + " esta duplicado");
                numerosMencionados.add(numbers[count]);
            }

            numbersHash.add(numbers[count]);

        }
    }
}
