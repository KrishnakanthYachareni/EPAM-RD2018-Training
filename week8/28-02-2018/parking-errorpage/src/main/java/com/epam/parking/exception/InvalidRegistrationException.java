/**
 * This is an jsp errorPage example.
 */
package com.epam.parking.exception;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class InvalidRegistrationException extends Exception {
    /**
     * Default serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param message custom exception message.
     */
    public InvalidRegistrationException(final String message) {
        super(message);
    }
}
