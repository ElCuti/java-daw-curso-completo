package com.daw.programming;

import java.util.HashMap;

/**
 * Take the challenge 5_17 and count how many times is weared each T-Shirt. For
 * example: White colour is weared by 2 teams. Red-blue colour is weared by 1
 * team. Tablecoth colour is weared by 1 team.
 *
 * b) [ADVANCED] Modify this exercise to say what teams are wearing a colour.
 * For example: White colour is weared by Real Madrid, Sevilla. Red-blue colour
 * is weared by Barcelona. Tablecoth colour is weared by Croatia.
 */
public class Challenge5_19 {

    public static void main(String[] args) {
        HashMap<String, String> teams = new HashMap();
        HashMap<String, Integer> colores = new HashMap();
        teams.put("Atletico de Madrid", "rojiblancos");
        teams.put("Real Madrid", "blancos");
        teams.put("Barcelona", "blaugranas");
        teams.put("Atlhetic", "rojiblancos");
        teams.put("Oviedo", "Azules");
        teams.put("Almeria", "rojiblancos");
        for (String team : teams.keySet()) {
            String color = teams.get(team);
            int coincidences = 1;
            if (colores.containsKey(color)) {
                coincidences = colores.get(color);
                coincidences++;
            }
            colores.put(color, coincidences);
        }
        for (String equipo : colores.keySet()) {
            int times = colores.get(equipo);
            String repeticion = "equipos";
            if (times == 1) {
                repeticion = "equipo";
            }
            System.out.println("El color " + equipo + " tiene " + times + " " + repeticion);

        }
    }
}
