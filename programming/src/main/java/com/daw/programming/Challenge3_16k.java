package com.daw.programming;

import java.util.Scanner;

/*
k.      Asking for a password.
Store in a variable a secret password.
Ask to the user for the password and print if the password entered is right or not.
Repeat the program until de password is ok.
Modify the program to not having into account lowercase and uppercase characters.
Example of execution (if the password is “myCatHarry”):
 */
public class Challenge3_16k {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        boolean contrasenaAcierto = false;
        String contrasena = "myCatHarry";
        System.out.println("Quieres intentar adivinar la contrasena con mayusculas[0] ");
        System.out.println("o sin modificaciones de texto[1]? ");
        int opcionUser = keyboard1.nextInt();
        while (opcionUser != 0 && opcionUser != 1) {
            System.out.println("Quieres intentar adivinar la contrasena con mayusculas[0] ");
            System.out.println("o sin modificaciones de texto[1]? ");
            opcionUser = keyboard1.nextInt();
        }
        keyboard1.nextLine();
        if (opcionUser == 0) {

            do {

                System.out.println("Escribe la contrasena:");
                String contrasenaIntento = keyboard1.nextLine();
                if (contrasenaIntento.equals(contrasena)) {
                    contrasenaAcierto = true;
                } else {
                    System.out.println("Te has equivocado...");
                }

            } while (contrasenaAcierto == false);

            System.out.println("Enhorabuena, has acertado la contrasena");
        } else {
            contrasena = contrasena.toLowerCase();
            do {

                System.out.println("Escribe la contrasena:");
                String contrasenaIntento = keyboard1.nextLine();
                contrasenaIntento = contrasenaIntento.toLowerCase();
                if (contrasenaIntento.equals(contrasena)) {
                    contrasenaAcierto = true;
                } else {
                    System.out.println("Te has equivocado...");
                }

            } while (contrasenaAcierto == false);

            System.out.println("Enhorabuena, has acertado la contrasena");
        }
    }
}
