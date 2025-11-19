package com.daw.programming;

import java.util.Scanner;

/*
d.     Voting in the elections.
There are elections to the president of the country. There are 3 political parties: A “the cool party”, B “the angry party” and C “the supercrazy party”.
To vote, the user should enter (A, B or C) and we have to print “You have voted for the XXXX party” (where XXXX is the name of the corresponding party).
If the user enter an invalid option, print “invalid option” and ask again to the user for the vote.
 */
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
            vote = vote.toUpperCase();
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
