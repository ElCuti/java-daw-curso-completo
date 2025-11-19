/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.util.Scanner;

/**
 * Take the following programs, debug them and try to fix them. The main goal of
 * this exercise is not to solve the problem, but to familiarize with the debug
 * functionality.
 *
 * a. Debug1.java.
 *
 * A program to classify 2 numbers. Follow the instructions in the
 * “System.out.println” to fix it.
 *
 * b. Debug2.java.
 *
 * By using the “while” statement, make a program which stores in a variable a
 * secret number between 1 and 10. The program will ask to the user a number to
 * guess the secret number. Each time the user enters a number, the program have
 * to indicate if the number entered by the user is smaller than, equal to ,
 * greater than the secret number or if the user has guessed the right number
 * (in this case, the program should finish).
 *
 * c. Debug3.java.
 *
 * Ask to the user for the name of 2 persons and store them into variables.
 *
 * Then you have to print “coincidence” if the names of both persons start by
 * the same letter or if they finish by the same letter. In any other case,
 * print “there is NO coincidence”.
 */
public class Challenge4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Debug1
        int numero1 = 1;
        int numero2 = 2;
        if (numero2 > 0) {
            System.out.println("numero2 es positivo");
        }
        if (numero1 < numero2) {
            System.out.println("numero1 no es mayor que numero2");
        }
        if (numero1 < 0 || numero2 < 0) {
            System.out.println("tanto numero1 como numero2 son negativos");
        }
        if (numero1 == 13 || numero2 == 13) {
            /*Aqui podemos ver el fallo del programa (numero1 == 13 && numero2 == 13)
            En vez de ser && (And) debería ser || (Or) o cambiar el mensaje en pantalla*/
            System.out.println("numero1 es trece o numero2 es trece");
        }

        /*Debug 2*/
        Scanner keyboard = new Scanner(System.in);
        int secretNumber = 7;
        int respuesta = 7;
        /*Previamente era respuesta=7*/
        while (respuesta != secretNumber) {
            /*Aqui podemos ver el error de este código, el cual aplica
            una condición para hacer un bucle hasta que el user encuentre el numero, pero al definir la variable
            nos encontramos con que han sido definidas con el mismo valor, este problema se solucionaria de varias maneras
            Algunos ejemplos serian: Hacer un Do While en vez de un While, definir la variable respuesta como 0 o preguntar dos
            veces al usuario, una antes de entrar al bucle y otra despues*/
            System.out.println("Introduzca un número:");
            respuesta = keyboard.nextInt();
            /*Otro error encontrado es el siguiente if: if (respuesta > secretNumber) {, la respuesta del out y la condición no tienen sentido ya que
            son contrarias*/
            if (respuesta < secretNumber) {
                System.out.println("El número que buscamos es mayor");
                /*Otro error encontrado es el siguiente else if: else if (respuesta < secretNumber) {, la respuesta del out y la condición no tienen sentido ya que
            son contrarias*/
            } else if (respuesta > secretNumber) {
                System.out.println("El número que buscamos es menor");
            } else {
                System.out.println("Has acertado");
            }
        }
        System.out.println("Introduce el primer nombre:");
        String nombre1 = keyboard.nextLine();
        System.out.println("Introduce el segundo nombre:");
        String nombre2 = keyboard.nextLine();
        char inicial1 = nombre1.charAt(0);
        char inicial2 = nombre2.charAt(0);
        int longitud1 = nombre1.length();
        int longitud2 = nombre2.length();
        char final1 = nombre1.charAt(longitud1 - 1);
        /*En vez de longitud1 como valor del charAt, deberia ser longitud1-1, para no salirnos*/
        char final2 = nombre2.charAt(longitud2 - 1);
        /*Debería ser longitud2 y nombre2, aparte de que sería lonogitud2-1*/
        if (inicial1 == inicial2 || final1 == final2) {
            /*Deberia ser condición or || en vez de and &&*/

            System.out.println("Coincidence");
        } else {
            System.out.println("There is NO coincidence");
        }
    }

}
