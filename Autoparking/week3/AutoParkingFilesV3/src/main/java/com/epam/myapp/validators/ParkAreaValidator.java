/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.validators;

import com.epam.myapp.exceptions.InvalidParkingAreaException;
import com.epam.myapp.util.Constants;

/**
 * The {@link ParkAreaValidator} class can validates the paring area name.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class ParkAreaValidator implements Validator {

    /**
     * This method can check the parking area name is valid or not.
     * @param name
     *            is vehicle registration number.
     * @return true if name doesn't contain any special symbols.
     * @throws InvalidParkingAreaException
     *             {@link InvalidParkingAreaException} if parking area not
     *             valid.
     */
    @Override
    public boolean validate(final String name)
            throws InvalidParkingAreaException {
        boolean bool = false;
        if (name.matches(Constants.PARKING_AREA_NAME_VALID_REGEX)
                && name.length() <= Constants.PARKING_AREA_MAX_CAPACITY) {
            bool = true;
        } else {
            throw new InvalidParkingAreaException(
                    "Parking area name should have "
                            + "only alphanumeric characters"
                            + "\nExample: EPAMParking");
        }
        return bool;
    }
}
