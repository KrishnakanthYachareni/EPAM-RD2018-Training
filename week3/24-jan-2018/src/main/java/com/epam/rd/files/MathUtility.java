/**
 * This code is simple interactive math utility that reads a real number
 * from the user and prints its sin, cos, tg values on the screen.
 * The code should run until the user specifies the ”END” input.
 */
package com.epam.rd.files;

import java.util.Scanner;

/**
 * The MathUtility class is simple interactive math utility that reads a real
 * number from the user and prints its sin, cos, tg values on the screen. The
 * code should run until the user specifies the ”END” input.
 * @author Krishnakanth_Yachareni.
 * @since 24-01-2018
 */
public final class MathUtility {
    /**
     * Default Constructor.
     */
    private MathUtility() {
    }

    /**
     * @param args
     *            string array
     */
    public static void main(final String[] args) {
        String value = "";
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println(
                        "Enter value for sin,cos,tan or use 'end' to exit");
                // Read input as string
                value = sc.next();
                if (value.equalsIgnoreCase("End")) { // check for end command
                    break;
                } else {
                    /*
                     * Converting string double.
                     */
                    double d = Double.parseDouble(value);
                    // Math convert number to radians
                    d = Math.toRadians(d);
                    System.out.println(Math.sin(d));
                    System.out.println(Math.cos(d));
                    System.out.println(Math.tan(d));
                }
            } // Loop end.
        } catch (NumberFormatException e) {
            System.err.println("Enter only double values");
        } finally {
            sc.close();
        }

    }

}
