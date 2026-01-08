/*
d.      Cities and length.
Create an ArrayList with city names.
Loop through the array and for each city tell the number of characteers on its name.
 */
package com.daw.programming;
import java.util.ArrayList;

public class Challenge5_20d {

    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<String>();
        cityNames.add("Barcelona");
        cityNames.add("Madrid");
        cityNames.add("Valencia");
        cityNames.add("Murcia");
        for(String city : cityNames){
            System.out.println("La ciudad "+city+" tiene en su nombre "+city.length()+" caracteres");
        }

    }

}
