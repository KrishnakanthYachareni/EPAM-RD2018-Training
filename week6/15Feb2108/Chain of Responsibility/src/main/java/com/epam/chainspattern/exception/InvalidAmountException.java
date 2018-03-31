/**
 * This is example of chain of responsibility design pattern.
 */
package com.epam.chainspattern.exception;

/**
 * This class is custom exception.
 *
 */
public class InvalidAmountException extends Exception {
    /**
     * Default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Parameterized constructor.
     * @param message
     *            exception message.
     */
    public InvalidAmountException(final String message) {
        super(message);
    }
}
