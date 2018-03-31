/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.exceptions;

/**
 * The {@link InvalidRegistrationNumberException} class raise when vehicle
 * registration number is not in valid format.
 * @author Krishnakanth Yachareni
 * @version 3.0
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
