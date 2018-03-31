/**
 * This is basic Junit Testing example.
 */
package com.epam.junit.exceptions;

/**
 * The InvalidCredentialException class is custom exception.
 * @author Krishnakanth_Yachare
 */
public class InvalidCredentialException extends Exception {
    /**
     * Default serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param message
     *            Message passed from subclasses.
     */
    public InvalidCredentialException(final String message) {
        // super class constructor.
        super(message);
    }
}
