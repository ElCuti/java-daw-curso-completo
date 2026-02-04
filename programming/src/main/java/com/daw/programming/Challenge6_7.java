/*Have a look to the class "Math". This is a predefined class in Java (it comes with Java when you use it), and have a lot of methods to perform different operations. With this class:
a) Use the appropriate method to round this number 12.8765 to the closest integer (that is, 13).
b) Calculate the absolute value of a number (the absolute value of 13 is 13 and the absolute value of -13 is 13).
c) Calculate the square root of 48.
d) Calculate 2 to the power of 10.

Now by using the class Integer:
e) Convert a String value to an int.
 */
package com.daw.programming;

public class Challenge6_7 {

    public static void main(String[] args) {
        //A
        System.out.println(Math.round(12.8765));
        //B
        System.out.println(Math.abs(-13));
        //C
        System.out.println(Math.sqrt(48));
        //D
        System.out.println(Math.pow(2, 10));
        //E
        String test1 = "24";
        int test2= Integer.parseInt(test1);
        System.out.println(test2);
    }

}
