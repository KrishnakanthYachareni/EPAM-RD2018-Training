/**
 * This application print comma separated data using PushBackInputStream. If the
 * first argument is even number, print the row. If the first argument is odd
 * number, skip the row. Sample input: 20,Krishnakanth 21,Yachareni Sample
 * input: 20,Krishnakanth
 */
package com.epam.rd.io;

import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * @author Krishnakanth Yachareni
 *
 */
public class PushBackEvenOdd {

    /**
     * Finding line number to read.
     */
    private static int line = 1;

    /**
     * @return line number.
     */
    public int getLine() {
        return line;
    }

    /**
     * This method first word in line and returns it.
     * @param pis
     *            PushbackInputStream
     * @param currentByte
     *            current reading byte.
     * @return string as first word in a file.
     * @throws IOException
     *             input output exception
     */
    public static String findValue(final PushbackInputStream pis,
            final int currentByte) throws IOException {
        int temp = currentByte;
        String value = new String("");
        // read bytes until find ',' in a line.
        while ((char) temp != ',') {
            value += (char) temp;
            temp = pis.read();
        }
        /*
         * Unread comma to print.
         */
        pis.unread(temp);
        /*
         * Replace spaces with empty.
         */
        return value.replaceAll("\n", "");
    }

    /**
     * The checkingEvenOdd method check given string is an even or odd. If it's
     * even then it calls readingRestBytes to print the line. if its's odd then
     * it calls jumpingBytes to skip the bytes to not print.
     * @param pis
     *            PushbackInputStream
     * @param str
     *            string
     * @throws IOException
     *             input output exception
     */
    public static void checkingEvenOdd(final PushbackInputStream pis,
            final String str) throws IOException {
        // convert string to integer
        int number = Integer.parseInt(str);
        // condition o check even or odd.
        if (number % 2 == 0) {
            System.out.print(str);
            readingRestBytes(pis);

        } else {
            jumpingBytes(pis);
        }
    }

    /**
     * The readingRestBytes read bytes & prints until new line is found.
     * @param pis
     *            PushbackInputStream
     * @throws IOException
     *             input output exception
     */
    public static void readingRestBytes(final PushbackInputStream pis)
            throws IOException {
        int currentByte;
        do {
            // reading bytes.
            currentByte = pis.read();
            if (currentByte == -1) {
                break;
            }
            System.out.print((char) currentByte);
        } while ((char) currentByte != '\n');
        // count lines
        line++;
    }

    /**
     * jumpingBytes read the bytes until new line found to not to print.
     * @param pis
     *            PushbackInputStream
     * @throws IOException
     *             input output exception
     */
    public static void jumpingBytes(final PushbackInputStream pis)
            throws IOException {
        char value;
        do {
            int currentByte = pis.read();
            if (currentByte == -1) {
                return;
            }
            value = (char) currentByte;
        } while (value != '\n');
    }

    /**
     * This method read bytes from file and pass that bytes to
     * findValue,checkingEvenOdd methods.
     * @param pis
     *            PushbackInputStream
     * @throws IOException
     *             input output exception
     */
    public void pushDriver(final PushbackInputStream pis) throws IOException {
        int currentByte;
        // Loop until file new line is empty.
        while ((currentByte = pis.read()) != -1) {
            /*
             * Ignoring new line, tab space, space characters from file
             */
            if ((char) currentByte == '\r' || currentByte == ' '
                    || currentByte == '\t') {
                System.out.print((char) currentByte);
                continue;
            }
            // calling method to return first word of each line in a file.
            String value = findValue(pis, currentByte);
            /*
             * passing PushbackInputStream reference and first word in a line to
             * check whether even or odd.
             */
            checkingEvenOdd(pis, value);
        }

    }
}
