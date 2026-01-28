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
        return "Me llamo: " + name + " y tengo " + age + " anios.";
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
            System.out.println(name + " es mas mayor que " + persona2.name);
        } else if (age < persona2.age) {
            System.out.println(persona2.name + " es mas mayor que " + name);
        } else {
            System.out.println("Tanto " + name + ", como " + persona2.name + " tienen la misma edad");
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Juan", 25, 177);
        Person person2 = new Person("Luisa", 29, 159);
        Person person3 = new Person("Ana", 33, 169);
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
*/
        person3.olderThanMe(person2);
    }

}
