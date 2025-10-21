package com.daw.programming;

public class Challenge3_7 {

    public static void main(String[] args) {
        int limitNumber = 100;
        int multiple = 4;
        int x = limitNumber / multiple;
        System.out.println("Numeros multiplos de 4");
        for (int i = 1; i <= x; i++) {
            int number = i * multiple;
            System.out.println(number);
        }

        System.out.println();
        System.out.println("Numeros multiplos de 4 excluyendo a los multiplos de 5");
        for (int i = 1; i <= x; i++) {
            int number = i * multiple;
            if (number % 5 != 0) {
                System.out.println(number);

            }

        }

    }
}
