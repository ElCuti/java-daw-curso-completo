/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.daw.programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * We are going to organize a raffle (sorteo). We have to get a number from 1 to
 * 10 to get the winners of the raffle. We are going to have 3 winners but we
 * don’t want to get the same number to win twice (two times). So, if the same
 * number wins twice, we would have to get a new number for the winner.
 */
public class Challenge5_16 {

    public static void main(String[] args) {
        int limit = 10;
        int nPremiados = 3;
        Random generador = new Random();
        HashSet<Integer> premiados = new HashSet();
        for (int count = 0; premiados.size() != nPremiados; count++) {
            int aleatorio = generador.nextInt(limit)+1;
            premiados.add(aleatorio);
        }
        System.out.println("Los premiados son: " + premiados);
    }
}
