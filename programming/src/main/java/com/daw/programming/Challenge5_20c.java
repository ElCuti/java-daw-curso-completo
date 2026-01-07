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
        for (int count = 7; count != 0; count--) {
            repeatCharacter("*", count);
            System.out.println();
        }
    }

}
