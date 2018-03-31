/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package org.autoparking.service.validator;

import org.autoparking.api.exception.InvalidParkingLotException;

/**
 * The {@link ParkingNameValidator} class can validates the paring area name.
 * 
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class ParkingNameValidator implements Validator {

    /**
     * Regular expression for validate parking area name.
     */
    private static final String PARKING_AREA_NAME_VALID_REGEX = "[a-zA-Z0-9]+";
    /**
     * 
     */
    private static final int PARKING_AREA_NAME_MAX_LENGTH = 30;

    /**
     * This method can check the parking area name is valid or not.
     * 
     * @param name
     *            is vehicle registration number.
     * @return true if name doesn't contain any special symbols.
     */
    @Override
    public boolean validate(final String name)
            throws InvalidParkingLotException {
        boolean bool = false;
        if (name.matches(PARKING_AREA_NAME_VALID_REGEX)
                && name.length() <= PARKING_AREA_NAME_MAX_LENGTH) {
            bool = true;
        } else {
            throw new InvalidParkingLotException(
                    "Parking area name should have "
                            + "only alphanumeric characters"
                            + "\nExample: EPAMParking");
        }
        return bool;
    }
}
