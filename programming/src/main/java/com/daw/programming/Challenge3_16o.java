package com.daw.programming;

import java.util.Scanner;

/*o.     [ADVANCED] “Goya chicken”.
In “Goya Chicken” shop we can buy nuggets in packages of 4, 7 or 10 units.
Ask to the user for a number of nuggets and tell if it is possible to buy this exact number of nuggets at “Goya Chicken”.
For example, we can buy 27 nuggets (2 packages of 10 and one of 7), but it is not possible to buy 13 nuggets exactly.
 */
public class Challenge3_16o {

    public static void main(String[] args) {
        boolean pedidoCompleto = false;
        int polloDiez = 0;
        int polloSiete = 0;
        int polloCuatro = 0;
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Bienvenido a Goya Chicken, dime cuantas piezas de nuggets quieres?: ");
        int cantidadPollo = keyboard1.nextInt();
        System.out.println("En ese caso...");
        for (polloDiez = 0; polloDiez * 10 <= cantidadPollo && !pedidoCompleto; polloDiez++) {
            for (polloSiete = 0; polloSiete * 7 <= cantidadPollo && !pedidoCompleto; polloSiete++) {
                for (polloCuatro = 0; polloCuatro * 4 <= cantidadPollo; polloCuatro++) {
                    if ((polloCuatro * 4) + (polloSiete * 7) + (polloDiez * 10) == cantidadPollo) {
                        pedidoCompleto = true;
                        System.out.println("Opcion");
                        if (polloDiez > 0) {
                            System.out.println("- " + polloDiez + " paquetes de 10 piezas");
                        }
                        if (polloSiete > 0) {
                            System.out.println("- " + polloSiete + " paquetes de 7 piezas");
                        }
                        if (polloCuatro > 0) {
                            System.out.println("- " + polloCuatro + " paquetes de 4 piezas");
                        }
                    }
                }
            }
            if (pedidoCompleto) {
                break;
            }
        }
        if (!pedidoCompleto) {
            System.out.println("No podemos darte esa cantidad de pollo exacta... Lo sentimos");
        }
    }
}
/* Faltan un par de IF y tambien funcionaria
            if ((cantidadPollo % 10) == 0) {
                while (cantidadPollo != 0) {
                    cantidadPollo -= 10;
                    polloDiez++;
                }
                System.out.println("Con " + polloDiez + " de paquetes de 10 piezas tendrias tu pedido");
            } else if ((cantidadPollo % 7) == 0) {
                while (cantidadPollo != 0) {
                    cantidadPollo -= 7;
                    polloSiete++;
                }
                System.out.println("Con " + polloSiete + " de paquetes de 7 piezas tendrias tu pedido");
            } else if ((cantidadPollo % 4) == 0) {
                while (cantidadPollo != 0) {
                    cantidadPollo -= 4;
                    polloCuatro++;
                }
                System.out.println("Con " + polloCuatro + " de paquetes de 4 piezas tendrias tu pedido");

            } else {
                for (; cantidadPollo >= 10; polloDiez++) {
                    cantidadPollo -= 10;
                }
                if ((cantidadPollo / 4) > (cantidadPollo / 7)) {
                    for (; cantidadPollo >= 7; polloSiete++) {
                        cantidadPollo -= 7;
                        if (cantidadPollo == 0) {
                            polloSiete++;
                            System.out.println("Con " + polloDiez + " paquetes de 10 piezas y " + polloSiete + " paquetes de 7 piezas completas tu pedido");
                            pedidoCompleto = true;
                        }
                    }
                } else {
                    for (; cantidadPollo >= 4; polloCuatro++) {
                        cantidadPollo -= 4;
                        if (cantidadPollo == 0) {
                            polloCuatro++;
                            System.out.println("Con " + polloDiez + " paquetes de 10 piezas, " + polloSiete + " paquetes de 7 piezas completas tu pedido y " + polloCuatro + " paquetes de 4 piezas completas tu pedido");
                            pedidoCompleto = true;
                        }
                    }
                }
                if (pedidoCompleto) {
                    break;
                } else {
                    System.out.println("No te podemos dar esa cantidad exacta, para completarlo con la menor cantidad de paquetes podemos ofrecerte:");
                    if (polloDiez > 0) {
                        System.out.println("- " + polloDiez + " paquetes de 10 piezas");
                    }
                    if (polloSiete > 0) {
                        System.out.println("- " + polloSiete + " paquetes de 7 piezas");
                    }
                    if (polloCuatro > 0) {
                        System.out.println("- " + polloCuatro + " paquetes de 4 piezas");
                    }
                    System.out.println("Faltarian " + cantidadPollo + " nuggets para completar tu pedido, lo sentimos mucho");
                    break;
                }

            }
 */
