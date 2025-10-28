package com.daw.programming;

import java.util.Scanner;

public class Challenge3_16f {

    public static void main(String[] args) {
        char letterName = ' ';
        boolean space = false;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Escribe la letra que quieras comprobar si es vocal");
        String completeName = keyboard1.nextLine();

        System.out.println("Tu nombre en minusculas es: " + completeName.toLowerCase());
        System.out.println("Tu nombre en mayusculas es: " + completeName.toUpperCase());
        System.out.println(" ");
        System.out.print("Tu nombre escrito con las iniciales en mayusculas es: ");
        for (int count = 0; count < completeName.length(); count++) {
            letterName = completeName.charAt(count);
            while (letterName == ' ') {
                count++;
                letterName = completeName.charAt(count);
                space = true;
            }
            if (space) {
                System.out.print(" ");
                space = false;
                letterName = completeName.charAt(count);
                String stringLetter = String.valueOf(letterName);
                stringLetter = stringLetter.toUpperCase();
                System.out.print(stringLetter);

            } else if (count == 0) {
                letterName = completeName.charAt(count);
                String stringLetter = String.valueOf(letterName);
                stringLetter = stringLetter.toUpperCase();
                System.out.print(stringLetter);
            } else {
                System.out.print(letterName);
            }
        }
    }
}
