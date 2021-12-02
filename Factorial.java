/* This program calculates Factorial using recursion
*
* @author  Hussein
* @version 1.0
* @since 2020-11-30
*/

import java.util.Scanner;

/**
* This is the standard "Factorial" program.
*/

final class Factorial {

    /**
    * Declaring exponent variable.
    */
    public static final String SPACE = "\n";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Factorial() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting the reverse Method.
    *
    * @param someInt for Method
    * @return factorial calculation
    */

    public static int factorial(int someInt) {
        // this Method uses recursion to reverse a Integer
        final int returnVar;
        if (someInt == 1) {
            returnVar = someInt;
        } else {
            returnVar = someInt * factorial(someInt - 1);
        }
        return returnVar;
    }

    /**
    * Starting the main Method.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        try {
            // Create a Scanner object
            final Scanner myObj = new Scanner(System.in);
            System.out.print("Enter the number to turn it to factorial: ");
            // Read user input
            final int input = myObj.nextInt();
            // calling reverse method
            System.out.print(SPACE + input + "!" + " = "
                                   + factorial(input) + SPACE);
        } catch (java.util.InputMismatchException errorCode) {
            // Invalid Input.
            System.out.println("Invalid Input.");
        }
        // print Done.
        System.out.println("\nDone.");
    }
}
