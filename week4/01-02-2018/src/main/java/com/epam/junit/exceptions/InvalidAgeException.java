/**
 * This is a basic user validation J unit example.
 */
package com.epam.junit.exceptions;

/**
 * The InvalidAgeException is custom exception it can raise when age is not in
 * between 16 - 60.
 * @author Krishnakanth_Yachare
 */
public class InvalidAgeException extends Exception {
    /**
     * Default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param message
     *            Age exception message.
     */
    public InvalidAgeException(final String message) {
        super(message);
    }
}
