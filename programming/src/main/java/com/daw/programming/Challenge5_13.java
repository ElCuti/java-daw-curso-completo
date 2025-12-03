package com.daw.programming;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Create an ArrayList of Strings to store programming languages.
 *
 * Add the following programming languages:
 *
 * Java PHP Python C++ C# Kotlin
 *
 * Show the elements contained in the ArrayList.
 *
 * Order the elements in the ArrayList.
 *
 * Show the elements contained in the ArrayList.
 *
 * b)
 *
 * Make Java to be the first one.
 *
 * Show the elements contained in the ArrayList.
 *
 * c)
 *
 * Tell what is the position of Kotlin.
 *
 * d)
 *
 * Display the languages containing the letter “o”.
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
            int positionO = language.indexOf("o");
            if (positionO != -1) {
                System.out.println("- " + language);
            }
        }
    }
}
