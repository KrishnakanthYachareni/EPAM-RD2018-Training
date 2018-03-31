/**
 * This is a simple login example.
 */
package org.login.service.exception;

/**
 * The {@link InvalidUserNameException} class can raise when the user name and passwords are wrong.
 * 
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class InvalidUserNameException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * @param message Error message
     */
    public InvalidUserNameException(final String message) {
        // calls super class constructor.
        super(message);
    }
}
