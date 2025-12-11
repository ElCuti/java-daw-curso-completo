package com.daw.programming;

import java.util.ArrayList;
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
        /*A
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
        }*/
        //B
        ArrayList<String> equiposColor;
        HashMap<String, String> teams = new HashMap();
        HashMap<String, ArrayList<String>> coloresEquipo = new HashMap();
        teams.put("Alaves", "Blanquiazules");
        teams.put("Athletic Club", "Rojiblancos");
        teams.put("Atletico de Madrid", "Rojiblancos");
        teams.put("Barcelona", "Blaugranas");
        teams.put("Celta de Vigo", "Celestes");
        teams.put("Getafe", "Azulones");
        teams.put("Girona", "Blanquirrojos");
        teams.put("Granada", "Rojiblancos");
        teams.put("Las Palmas", "Amarillos");
        teams.put("Mallorca", "Bermellones");
        teams.put("Osasuna", "Rojillos");
        teams.put("Rayo Vallecano", "Franjirrojos");
        teams.put("Real Betis", "Verdiblancos");
        teams.put("Real Madrid", "Blancos");
        teams.put("Real Sociedad", "Txuriurdines");
        teams.put("Sevilla", "Blanquirrojos");
        teams.put("Valencia", "Blanquinegros");
        teams.put("Villarreal", "Amarillos");
        teams.put("Cadiz", "Amarillos");
        teams.put("Almeria", "Rojiblancos");
        teams.put("Albacete", "Blanquiazules");
        teams.put("Amorebieta", "Azules");
        teams.put("Andorra", "Tricolores");
        teams.put("Burgos", "Blanquinegros");
        teams.put("Cartagena", "Albinegros");
        teams.put("Eibar", "Azulgrana");
        teams.put("Eldense", "Azulgranas");
        teams.put("Espanyol", "Blanquiazules");
        teams.put("Huesca", "Azulgranas");
        teams.put("Leganes", "Blanquiazules");
        teams.put("Levante", "Azulgranas");
        teams.put("Mirandes", "Rojillos");
        teams.put("Oviedo", "Azules");
        teams.put("Racing Santander", "Verdiblancos");
        teams.put("Racing de Ferrol", "Verdes");
        teams.put("Real Valladolid", "Blanquivioletas");
        teams.put("Sporting de Gijon", "Rojiblancos");
        teams.put("Tenerife", "Blanquiazules");
        teams.put("Zaragoza", "Blanquillos");
        teams.put("Elche", "Franjiverdes");
        teams.put("Villarreal B", "Amarillos");
        teams.put("Alcorcon", "Amarillos");
        for (String team : teams.keySet()) {
            // You have only to create the array in the event that it is necessary. I mean, create the array has a cost, so if it is not necessary you dont have to create it

            String color = teams.get(team);
            if (coloresEquipo.containsKey(color)) { // Simplify this
                equiposColor = coloresEquipo.get(color);
            } else {
                equiposColor = new ArrayList();
            }
            equiposColor.add(team);
            coloresEquipo.put(color, equiposColor);
        }
        for (String color : coloresEquipo.keySet()) {
            int count = 0;
            equiposColor = coloresEquipo.get(color);
            System.out.print("- " + color + " colour is worn by");
            for (String team : equiposColor) {
                count++;
                if (count == 1) {
                    System.out.print(" " + team);
                } else {
                    System.out.print(", " + team);
                }
            }
            System.out.println("");
        }
    }
}
