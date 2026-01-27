/*
Create a Class to store hours, minutes and seconds.

Create a new object of this class called "miHour". 

Print it on screen with:

System.out.println(miHour);

b) [ADVANCED]

Create a static method that converts a number of seconds to hour, minutes and seconds.

For example:

int hours = totalSeconds / 3600;
int remainingSeconds = totalSeconds - (hours * 3600);
int minutes = remainingSeconds / 60;
int seconds = remainingSeconds - (minutes * 60);

Make the method to return an object of this type created.

Take the object returned by the method and print it on screen. */
package com.daw.programming;
/*
CHALLENGE6_2
*/
public class Time {

    int hour;
    int min;
    int seg;

    public Time(int myhour, int mymin, int myseg) {
        hour = myhour;
        min = mymin;
        seg = myseg;

    }

    public String toString() {
        return "Reloj: " + hour + " horas, " + min + " minutos y " + seg + " segundos";
    }

    public static Time segConverse(int seg) {
        int myhours = 0;
        int mymin = 0;
        for (; seg - 3600 >= 0; myhours++) {
            seg -= 3600;
        }
        for (; seg - 60 >= 0; mymin++) {
            seg -= 60;
        }
        Time hora = new Time(myhours, mymin, seg);
        return hora;
    }

    public static void main(String[] args) {
        Time hora1 = segConverse(3680);
        Time hora2 = segConverse(3600);
        System.out.println(hora1);
        System.out.println(hora2);
    }

}
