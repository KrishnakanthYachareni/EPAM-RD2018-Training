/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.validators;

import com.epam.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.myapp.util.Constants;

/**
 * The {@link RegNumberValidator} class can validate the vehicle registration
 * number.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class RegNumberValidator implements Validator {
    /**
     * This method checks the whether the given vehicle registration number is
     * valid or not.
     * @param regNum
     *            vehicle registration number
     * @return true if registration number length is 10 and should not have any
     *         special symbols.
     * @throws InvalidRegistrationNumberException
     *             {@link InvalidRegistrationNumberException}
     */
    @Override
    public boolean validate(final String regNum)
            throws InvalidRegistrationNumberException {
        boolean bool = false;
        if (regNum.isEmpty()) {
            throw new InvalidRegistrationNumberException(
                    "Vehicle registration number should not be empty");
        }
        /*
         * Condition to check vehicleNo length should be 10, regular expression
         * for vehicleNo should be alphanumeric.
         */
        if (regNum.length() == Constants.VEHICLE_REGISTRATION_NUM_LENGTH
                && regNum.matches(Constants.REGISTRATION_NUM_VALID_REGEX)) {
            bool = true;
        } else {
            // raise if registration number is not valid.
            throw new InvalidRegistrationNumberException(
                    "Vehicle registration number should"
                            + "be alpha numeric and length should be 10");
        }
        /*
         * Checks Registration number should have at least 2 digits.
         */
        if (regNum.replaceAll("[a-zA-Z]", "")
                .length() < Constants.VEHICLE_REGISTRATION_NUM_MIN_DIGITS) {
            throw new InvalidRegistrationNumberException(
                    "Vehicle registration number should"
                            + "have atleast two digit");
        }
        return bool;
    }
}
