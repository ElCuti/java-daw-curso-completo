package com.daw.programming;

import java.util.HashMap;

/**
 * Create a HashMap with sport teams (choose one football, basketball, jugger…)
 * associating the colour of the T-shirt with each team.
 *
 * Add some elements to it.
 *
 * Loop through all elements showing keys and values simultaneously.
 *
 * For example:
 *
 * Real Madrid wears a white T-shirt.
 *
 * Barcelona wears a blue-red T-shirt.
 *
 * Sevilla wears a white T-shirt.
 *
 * Croatia wears a tablecloth T-shirt.
 */
public class Challenge5_17 {

    public static void main(String[] args) {
        HashMap<String, String> teams = new HashMap();
        teams.put("Atletico de Madrid", "rojiblancos");
        teams.put("Real Madrid", "blancos");
        teams.put("Barcelona", "blaugranas");
        for (String team : teams.keySet()) {
            String color = teams.get(team);
            System.out.println(team + " viste de colores " + color);
        }

    }

}
