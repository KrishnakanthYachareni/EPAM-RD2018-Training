/**
 * This is an Abstract Factory example.
 */
package com.epam.exceptions;

/**
 * @author Krishnakanth_Yachare
 */
public class InvalidOsTypeException extends Exception {
    /**
     * @param message
     *            String.
     */
    public InvalidOsTypeException(final String message) {
        super(message);
    }
}
