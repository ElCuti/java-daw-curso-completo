/*
Create a new class to store cities.

Store the name, the country and number of habitants.

Create a constructor for this class.

Create 2 cities (objects belonging to this class).

Print each one of this cities (in a nice way).*/
package com.daw.programming;


/*
CHALLENGE 6_1
*/
public class City {

    String name;
    String country;
    int citizens;

    public City(String cityName, String countryName, int cityCitizens) {
        name = cityName;
        country = countryName;
        citizens = cityCitizens;

    }

    public String toString() {
        return name + " es una ciudad de " + country + " con " + citizens + " habitantes.";
    }

    public static void main(String[] args) {
        City ciudad1 = new City("Valencia", "Espana", 50000);
        City ciudad2 = new City("Madrid", "Espana", 200000);
        System.out.println(ciudad1);
        System.out.println(ciudad2);
    }

}
