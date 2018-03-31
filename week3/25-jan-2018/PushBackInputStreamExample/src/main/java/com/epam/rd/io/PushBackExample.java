/**
 * This application print comma separated data using PushBackInputStream. If the
 * first argument is even number, print the row. If the first argument is odd
 * number, skip the row. Sample input: 20,Krishnakanth 21,Yachareni Sample
 * input: 20,Krishnakanth
 */
package com.epam.rd.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * The PushBackExample class has main() can accept file path from command line
 * argument.
 * @author Krishnakanth Yachareni
 * @since 25-01-2018
 */
public final class PushBackExample {
    /**
     * Default constructor.
     */
    private PushBackExample() {
    }

    /**
     * @param args
     *            String array.
     */
    public static void main(final String[] args) {
        PushBackEvenOdd pushb = null;
        PushbackInputStream pis = null;
        /*
         * Directory file path validation.
         */
        try {
            if (args.length == 1) {
                // PushBackEvenOdd instance.
                pushb = new PushBackEvenOdd();
                /*
                 * Creating PushbackInputStream reference
                 */
                pis = new PushbackInputStream(new FileInputStream(args[0]));
                // calling method.
                pushb.pushDriver(pis);
            } else {
                throw new InputValidationException(
                        "Pass only one exact path directory");
            }
        } catch (InputValidationException e) {
            System.err.println(e.getLocalizedMessage());
        } catch (FileNotFoundException e) {
            System.err.println("File has not found");
        } catch (NumberFormatException e) {
            System.err.println("Error at " + pushb.getLine()
                    + " Please provide integers as first "
                    + "word in every line."
                    + "\nDon't give space between integer "
                    + "and comma in the line");
        } catch (IOException e) {
            System.err.println("Input error");
        } finally {
            if (pis != null) {
                try {
                    pis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
