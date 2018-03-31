/**
 * Autaparking application using database.
 */
package org.autoparking.service.exception;

/**
 * The {@link InvalidRegistrationNumberException} class raise when vehicle
 * registration number is not in valid format.
 * @author Krishnakanth Yachareni
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
