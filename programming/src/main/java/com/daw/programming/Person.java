/*
 NO ES UN EJERCICIO, ES UNA INTRODUCCIÓN*/
package com.daw.programming;
import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private int altura;

    private static int numberOfPersons = 0;
    private static Person presidente;

    public Person(String name, int age, int altura) {
        this.name = name;
        this.age = age;
        this.altura = altura;
        numberOfPersons++;
    }

    public static int getNumberOfPersons() {
        return numberOfPersons;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public static String getPresidente() {
        if (presidente != null) {
            return presidente.name;
        } else {
            return "No hay presidente";
        }
    }

    public static void setPresidente(Person president) {
        presidente = president;
    }

    public String toString() {
        return name;
    }

    public boolean gcCheck() {
        int LIMIT = 160;
        if (altura >= LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public void olderThanMe(Person persona2) {
        if (age > persona2.age) {
            System.out.println(name + " es mayor que " + persona2.name);
        } else if (age < persona2.age) {
            System.out.println(persona2.name + " es mayor que " + name);
        } else {
            System.out.println("Tanto " + name + ", como " + persona2.name + " tienen la misma edad");
        }
    }

    public static void printNumberOfPersons() {
        System.out.println("Number of persons is: " + numberOfPersons);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Juan", 25, 177);
        Person person2 = new Person("Luisa", 29, 159);
        Person person3 = new Person("Ana", 33, 169);
        ArrayList<Person> personas = new ArrayList();
        personas.add(person1);
        personas.add(person2);
        personas.add(person3);
        Collections.sort(personas);
        System.out.println(personas);
        /*
        System.out.println(person1.name + ", " + person1.age);
        System.out.println(person2.name + ", " + person2.age);
        System.out.println(person3.name + ", " + person3.age);

        System.out.println(person1);
        if (person1.gcCheck()) {
            System.out.println(person1.name + " puede ser Guardia Civil");
        } else {
            System.out.println(person1.name + " no puede ser Guardia Civil");
        }
         
        person3.olderThanMe(person2);
        printNumberOfPersons();*/
        System.out.println(getPresidente());
        setPresidente(person2);
        System.out.println("El presidente ahora es " + getPresidente());
        System.out.println(getPresidente());

        int personasTotal = getNumberOfPersons();
        System.out.println(personasTotal);
        int edad = person2.getAge();
        System.out.println(edad);
    }

    @Override
    public int compareTo(Person o) {
        int alturaDiferencia = this.altura - o.getAltura(); 
        return alturaDiferencia*-1;
    }

    
}
