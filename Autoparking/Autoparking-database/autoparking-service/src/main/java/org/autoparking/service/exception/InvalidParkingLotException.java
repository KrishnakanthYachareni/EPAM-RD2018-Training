/**
 * Autaparking application using database.
 */
package org.autoparking.service.exception;

/**
 * The {@link InvalidParkingLotException} class extends Exception.It raise when
 * the parking area name and parking lot capacity is not in valid format.
 * @author Krishnakanth Yachareni
 */
public class InvalidParkingLotException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * @param message
     *            Error message
     */
    public InvalidParkingLotException(final String message) {
        // calls super class constructor.
        super(message);
    }
}
