/**
 * Custom Exception.
 */
package com.epam.rd.files.Exception;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class InputValidationException extends Exception {
    /**
     * @param message user defined exception message.
     * @return
     */
    public InputValidationException(final String message) {
            super(message);
    }
}
