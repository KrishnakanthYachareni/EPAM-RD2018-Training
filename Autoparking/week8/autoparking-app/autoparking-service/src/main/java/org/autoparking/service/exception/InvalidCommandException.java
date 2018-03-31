/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package org.autoparking.service.exception;

/**
 * The {@link InvalidCommandException} class extends Exception that raise when
 * commands are invlaid.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class InvalidCommandException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * @param message
     *            Error message
     */
    public InvalidCommandException(final String message) {
        super(message);
    }
}
