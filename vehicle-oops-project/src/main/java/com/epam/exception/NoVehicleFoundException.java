/**
 * This program handles no commands exception.
 */
package com.epam.exception;

/**
 * @author Krishnakanth_Yachareni
 */
public class NoVehicleFoundException extends Exception {
    /**
     * Default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param message exception message.
     */
    public NoVehicleFoundException(final String message) {
        super(message);
    }
}
