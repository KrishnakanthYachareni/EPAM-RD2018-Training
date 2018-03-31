/**
 * This is basic Junit Testing example.
 */
package com.epam.junit.exceptions;

/**
 * The InvalidCredentialException class is custom exception that can raise when
 * user name and password are not valid.
 * @author Krishnakanth_Yachare
 */
public class InvalidCredentialsException extends Exception {
    /**
     * Default serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param message
     *            Message passed from subclasses.
     */

    public InvalidCredentialsException(final String message) {
        super(message);
    }
}
