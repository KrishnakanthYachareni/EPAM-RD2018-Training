/**
 * Autaparking application using database.
 */
package org.autoparking.service.exception;

/**
 * @author Krishnakanth
 *
 */
public class InvalidCredentialsException extends Exception {

    /**
     * Default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param message exception message.
     */
    public InvalidCredentialsException(final String message) {
        super(message);
    }
}
