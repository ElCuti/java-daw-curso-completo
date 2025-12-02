/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create an ArrayList of Strings. By using the keyboard, the user should
 * introduce person names until he introduce an empty word. Store this person
 * names in the ArrayList.
 *
 * At the end, show the names contained in the ArrayList.
 *
 *
 */
public class Challenge5_11 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        String name = "";
        Scanner keyboard1 = new Scanner(System.in);
        do {
            System.out.println("Pon el nombre que quieras agregar, cuando no quieras mas, pulsa enter");
            name = keyboard1.nextLine();
            if (!name.equals("")){
            names.add(name);}
        } while (!name.equals(""));
        System.out.println(names);

    }
}
