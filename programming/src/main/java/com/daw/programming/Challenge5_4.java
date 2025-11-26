/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

/**
 * Generate a random number between 1 and 7. Create a function that returns the
 * day of the week in letter (corresponding 1 to Monday and 7 to Sunday).
 *
 * Show on screen: Today is 5 corresponding to Friday.
 *
 * To make it easier, create an array with the names of the days of the week:
 * Monday, Tuesday…
 *
 * Once you have the number from 1 to 7, pick from the array the right day of
 * the week.
 */
public class Challenge5_4 {

    public static void main(String[] args) {
        int numero = (int) (Math.random() * 7) + 1;
        dayInLetter(numero);
    }

    public static void dayInLetter(int numero) {
        String day[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        String dayInLetter = day[numero - 1];
        System.out.println("Hoy es el dia " + numero + " de la semana, que corresponde a " + dayInLetter);
    }
}
