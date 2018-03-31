/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.validators;

import com.epam.myapp.exceptions.InvalidParkingAreaException;
import com.epam.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.myapp.util.Constants;

/**
 * This class can validates the parking lot capacity range.
 * @author Krishnakanth_Yachare
 */
public class CapacityValidator implements Validator {

    /**
     * (non-Javadoc).
     * @see com.epam.myapp.validators.Validator#validate(java.lang.String)
     */
    @Override
    public boolean validate(final String pCapacity)
            throws InvalidRegistrationNumberException,
            InvalidParkingAreaException {
        int capacity = Integer.parseInt(pCapacity);
        boolean bool = false;
        if (capacity >= Constants.PARKING_AREA_MIN_CAPACITY
                && capacity <= Constants.PARKING_AREA_MAX_CAPACITY) {
            bool = true;
        } else {
            throw new InvalidParkingAreaException(
                    "Parking capacity should be in " + "between 10 to 100");
        }
        return bool;
    }
}
