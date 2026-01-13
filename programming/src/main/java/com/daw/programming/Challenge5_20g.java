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

        teamsChampions.put("real madrid", 15);
        teamsChampions.put("ac milan", 7);
        teamsChampions.put("bayern munich", 6);
        teamsChampions.put("liverpool", 6);
        teamsChampions.put("fc barcelona", 5);
        teamsChampions.put("ajax", 4);
        teamsChampions.put("manchester united", 3);
        teamsChampions.put("inter milan", 3);
        teamsChampions.put("chelsea", 2);
        teamsChampions.put("nottingham forest", 2);
        teamsChampions.put("benfica", 2);
        teamsChampions.put("juventus", 2);
        teamsChampions.put("fc porto", 2);
        teamsChampions.put("manchester city", 1);
        teamsChampions.put("borussia dortmund", 1);
        teamsChampions.put("olympique de marseille", 1);
        teamsChampions.put("celtic", 1);
        teamsChampions.put("hamburger sv", 1);
        teamsChampions.put("steaua bucuresti", 1);
        teamsChampions.put("aston villa", 1);
        teamsChampions.put("psv eindhoven", 1);
        teamsChampions.put("feyenoord", 1);
        teamsChampions.put("red star belgrade", 1);
        teamsChampions.put("atletico de madrid", 0);
        teamsChampions.put("valencia cf", 0);
        teamsChampions.put("stade de reims", 0);
        teamsChampions.put("arsenal", 0);
        teamsChampions.put("paris saint-germain", 0);
        teamsChampions.put("tottenham hotspur", 0);
        teamsChampions.put("bayer leverkusen", 0);
        teamsChampions.put("as monaco", 0);
        teamsChampions.put("as roma", 0);
        teamsChampions.put("sampdoria", 0);
        teamsChampions.put("borussia monchengladbach", 0);
        teamsChampions.put("leeds united", 0);
        teamsChampions.put("club brugge", 0);
        teamsChampions.put("panathinaikos", 0);
        teamsChampions.put("partizan", 0);
        teamsChampions.put("saint-etienne", 0);
        teamsChampions.put("fiorentina", 0);
        teamsChampions.put("eintracht frankfurt", 0);
        teamsChampions.put("malmo ff", 0);

        Scanner keyboard1 = new Scanner(System.in);
        String userRequest = "";
        do {
            System.out.println("De que equipo quieres ver sus Champions ganadas? (Enter para salir): ");
            userRequest = keyboard1.nextLine().toLowerCase();
            if (teamsChampions.containsKey(userRequest)) {
                int championsGanadas = teamsChampions.get(userRequest);
                if (championsGanadas == 0) {
                    System.out.println("El " + userRequest.toUpperCase() + " no ha ganado ninguna Champions pero ha disputado como minimo una final");
                } else {
                    System.out.println("El " + userRequest.toUpperCase() + " ha ganado en total " + championsGanadas + " Champions League");
                }

            } else if (!userRequest.equals("")) {
                System.out.println("Ese equipo esta mal escrito o nunca ha jugado una final de champions");
            }

        } while (!userRequest.equals(""));
    }

}
