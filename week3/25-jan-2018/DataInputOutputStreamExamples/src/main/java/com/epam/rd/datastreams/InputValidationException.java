/**
 * Custom Exception.
 */
package com.epam.rd.datastreams;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class InputValidationException extends Exception {
    /**
     * Default serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param message
     *            user defined exception message.
     * @return
     */
    public InputValidationException(final String message) {
        super(message);
    }
}
