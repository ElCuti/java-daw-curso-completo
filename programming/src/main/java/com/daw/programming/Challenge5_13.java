/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alumnado
 */
public class Challenge5_13 {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList();
        languages.add("Java");
        languages.add("PHP");
        languages.add("Python");
        languages.add("C++");
        languages.add("C#");
        languages.add("Kotlin");
        System.out.println(languages);
        Collections.sort(languages);
        System.out.println(languages);
        languages.remove("Java");
        languages.add(0, "Java");
        System.out.println("Ejercicio B: " + languages);
        int position = languages.indexOf("Kotlin");
        System.out.println("Ejercicio C: Esta en la posicion " + position);

        System.out.println("Ejercicio D: Lenguajes con una o en su nombre: ");
        for (String language : languages) {
            int positionO = -1;
            int coincidence = 0;
            for (int count = 0; count != language.length(); count++) {
                positionO = language.indexOf("o");
                if (positionO != -1) {
                    coincidence++;
                }
            }
            if (coincidence != 0) {
                System.out.println("- " + language);
            }
            coincidence = 0;

        }
    }
}
