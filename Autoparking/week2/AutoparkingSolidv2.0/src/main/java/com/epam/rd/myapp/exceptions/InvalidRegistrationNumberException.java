/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.exceptions;

/**
 * The InvalidRegistrationNumberException class extends Exception class.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class InvalidRegistrationNumberException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * @param message
     *            Error message
     */
    public InvalidRegistrationNumberException(final String message) {
        // calls super class constructor.
        super(message);
    }
}
