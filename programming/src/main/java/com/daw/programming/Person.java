/*
 NO ES UN EJERCICIO, ES UNA INTRODUCCIÓN*/
package com.daw.programming;

public class Person {

    String name;
    int age;
    int altura;

    public Person(String newName, int newAge, int newAltura) {
        name = newName;
        age = newAge;
        altura = newAltura;
    }

    public String toString() {
        return "Me llamo: " + name + " y tengo " + age + " años.";
    }

    public boolean gcCheck() {
        int LIMIT = 160;
        if (altura >= LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Juan", 25, 177);
        Person person2 = new Person("Luisa", 29, 159);
        Person person3 = new Person("Ana", 33, 169);

        System.out.println(person1.name + ", " + person1.age);
        System.out.println(person2.name + ", " + person2.age);
        System.out.println(person3.name + ", " + person3.age);

        System.out.println(person1);
        boolean check = person2.gcCheck();
        if (check){
            System.out.println(person2.name+" puede ser Guardia Civil");
        }
        else{
            System.out.println(person2.name+" no puede ser Guardia Civil");
        }
    }

}
