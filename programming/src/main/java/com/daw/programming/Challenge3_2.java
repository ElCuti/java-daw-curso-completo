package com.daw.programming;
import java.util.Scanner;

public class Challenge3_2 {
    public static void main(String[] args) {
    Scanner keyboard1 = new Scanner(System.in);
    System.out.println("Pon el primer numero: ");
    int num1 = keyboard1.nextInt();
    System.out.println("Pon el segundo numero: ");
    int num2 = keyboard1.nextInt();
    
    if(num2>0) {
    System.out.println("numero2 es positivo");
    }

    if(num2>=num1) {
    System.out.println ("numero1 no es mayor que numero2");
    }

    if(num1<0 && num2<0) {
    System.out.println ("tanto numero1 como numero2 son negativos");
    }

    if(num1==13 || num2==13) {
    System.out.println ("numero1 es trece o numero2 es trece");
    }
}
}

