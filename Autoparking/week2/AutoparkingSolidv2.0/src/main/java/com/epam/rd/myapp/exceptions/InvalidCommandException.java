/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.exceptions;

/**
 * The InvalidCommandException class extends Exception class.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class InvalidCommandException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * @param message
     *            Error message
     */
    public InvalidCommandException(final String message) {
        super(message);
    }
}
