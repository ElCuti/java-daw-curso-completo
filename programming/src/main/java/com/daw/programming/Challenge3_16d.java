package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16d {

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de voto electoral");
        System.out.println("Dispones de 3 partidos politicos para votar:");
        System.out.println("(A) The cool party");
        System.out.println("(B) The angry party");
        System.out.println("(C) The supercrazy party");
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe la letra del partido que quieres votar");
        String vote = keyboard1.nextLine();
        vote = vote.toUpperCase();
        while (!vote.equals("A") && !vote.equals("B") && !vote.equals("C")) {
            System.out.println("Has tenido un error a la hora de introducir a que partido quieres votar, te vuelvo a mostrar los candidatos posibles:");
            System.out.println("(A) The cool party");
            System.out.println("(B) The angry party");
            System.out.println("(C) The supercrazy party");
            System.out.println("Escribe la letra del partido que quieres votar");
            vote = keyboard1.nextLine();
        }
        if (vote.equals("A")) {
            System.out.println("Has votado al partido politico The cool party");
        } else if (vote.equals("B")) {
            System.out.println("Has votado al partido politico The angry party");
        } else {
            System.out.println("Has votado al partido politico the supercrazy party");
        }
    }
}
