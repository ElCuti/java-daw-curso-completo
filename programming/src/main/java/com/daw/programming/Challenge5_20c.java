/*
 c.      Repeating characters and making draws.

Write a function to print a character repeated the number of times specified.

For example:

repeatCharacter("*", 7);

Should print:

*******

Now, by using this function, and a for loop, write a program which creates this draw.

*******
******
*****
****
***
**
*

[ADVANCED] By using this function, and for loop create this drawing:

                ****************
        ********        ********
    ****    ****    ****    ****
  **  **  **  **  **  **  **  **
 * * * * * * * * * * * * * * * *
 */
package com.daw.programming;

public class Challenge5_20c {

    public static void repeatCharacter(String simbolo, int repeticiones) {
        for (int count = 0; count != repeticiones; count++) {
            System.out.print(simbolo);
        }
    }

    public static void main(String[] args) {
        int limit = 1;
        for (int count = 16; count != 0; count /= 2) {
            for (int count2 = 0; count2 < limit; count2++) {
                repeatCharacter(" ", count);
                repeatCharacter("*", count);

            }
            limit *= 2;
            System.out.println();
        }
    }

}
