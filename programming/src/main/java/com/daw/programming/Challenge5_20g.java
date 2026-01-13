/*
 g.      Champions winners.

Create a HashMap to store how many times a team won the Champions League.
Ask for a team to the user and print how many Champions League has won.
If the team has won no Champions League, the program should tell it.
Change it to ignore if the user enters the name of the team in upper or lower case.*/
package com.daw.programming;

import java.util.HashMap;
import java.util.Scanner;

public class Challenge5_20g {

    public static void main(String[] args) {
        HashMap<String, Integer> teamsChampions = new HashMap();

        teamsChampions.put("Real Madrid", 15);
        teamsChampions.put("AC Milan", 7);
        teamsChampions.put("Bayern Munich", 6);
        teamsChampions.put("Liverpool", 6);
        teamsChampions.put("FC Barcelona", 5);
        teamsChampions.put("Ajax", 4);
        teamsChampions.put("Manchester United", 3);
        teamsChampions.put("Inter Milan", 3);
        teamsChampions.put("Chelsea", 2);
        teamsChampions.put("Nottingham Forest", 2);
        teamsChampions.put("Benfica", 2);
        teamsChampions.put("Juventus", 2);
        teamsChampions.put("FC Porto", 2);
        teamsChampions.put("Manchester City", 1);
        teamsChampions.put("Borussia Dortmund", 1);
        teamsChampions.put("Olympique de Marseille", 1);
        teamsChampions.put("Celtic", 1);
        teamsChampions.put("Hamburger SV", 1);
        teamsChampions.put("Steaua Bucuresti", 1);
        teamsChampions.put("Aston Villa", 1);
        teamsChampions.put("PSV Eindhoven", 1);
        teamsChampions.put("Feyenoord", 1);
        teamsChampions.put("Red Star Belgrade", 1);
        teamsChampions.put("Atletico de Madrid", 0);
        teamsChampions.put("Valencia CF", 0);
        teamsChampions.put("Stade de Reims", 0);
        teamsChampions.put("Arsenal", 0);
        teamsChampions.put("Paris Saint-Germain", 0);
        teamsChampions.put("Tottenham Hotspur", 0);
        teamsChampions.put("Bayer Leverkusen", 0);
        teamsChampions.put("AS Monaco", 0);
        teamsChampions.put("AS Roma", 0);
        teamsChampions.put("Sampdoria", 0);
        teamsChampions.put("Borussia Monchengladbach", 0);
        teamsChampions.put("Leeds United", 0);
        teamsChampions.put("Club Brugge", 0);
        teamsChampions.put("Panathinaikos", 0);
        teamsChampions.put("Partizan", 0);
        teamsChampions.put("Saint-Etienne", 0);
        teamsChampions.put("Fiorentina", 0);
        teamsChampions.put("Eintracht Frankfurt", 0);
        teamsChampions.put("Malmo FF", 0);

        Scanner keyboard1 = new Scanner(System.in);
        String userRequest = "";
        do {
            System.out.println("De que equipo quieres ver sus Champions ganadas? (Enter para salir): ");
            userRequest = keyboard1.nextLine();
            if (teamsChampions.containsKey(userRequest)) {
                int championsGanadas = teamsChampions.get(userRequest);
                if (championsGanadas == 0) {
                    System.out.println("El " + userRequest + " no ha ganado ninguna Champions pero ha disputado como minimo una final");
                } else {
                    System.out.println("El " + userRequest + " ha ganado en total " + championsGanadas + " Champions League");
                }

            } else if (!userRequest.equals("")) {
                System.out.println("Ese equipo esta mal escrito o nunca ha jugado una final de champions");
            }

        } while (!userRequest.equals(""));
    }

}
