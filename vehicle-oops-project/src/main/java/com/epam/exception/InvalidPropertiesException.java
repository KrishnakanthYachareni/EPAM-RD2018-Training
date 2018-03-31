/**
 * This is custom Exception.
 */
package com.epam.exception;

/**
 * This class can execute when vehicle properties in a file is empty. or one or
 * more properties are empty.
 * @author Krishnakanth_Yachare
 *
 */
public class InvalidPropertiesException extends Exception {

    /**
     * Default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Parameterized Constructor.
     * @param message
     *            exception message.
     */
    public InvalidPropertiesException(final String message) {
        super(message);

    }
}
