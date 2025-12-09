/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.daw.programming;

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
        int LIMIT = 300;
        int NPREMIADOS = 5;
        int Premio = 0;
        Random generador = new Random();
        HashSet<Integer> premiados = new HashSet();
        while (premiados.size() != NPREMIADOS) {
            int aleatorio = generador.nextInt(LIMIT) + 1;
            premiados.add(aleatorio);
        }
        for (int premiado : premiados) {
            Premio++;
            System.out.println("El premio " + Premio + " es para el numero " + premiado);
        }
    }
}
