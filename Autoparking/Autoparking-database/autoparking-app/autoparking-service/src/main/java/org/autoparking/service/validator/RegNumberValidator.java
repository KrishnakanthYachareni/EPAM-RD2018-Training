/**
 * Autaparking application using database.
 */
package org.autoparking.service.validator;

import org.autoparking.service.exception.InvalidRegistrationNumberException;

/**
 * The {@link RegNumberValidatorTest} class can validate the vehicle registration number.
 * 
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class RegNumberValidator implements Validator {

    /**
     * Vehicle Registration number maximum length.
     */
    private static final int VEHICLE_REGISTRATION_NUM_LENGTH = 10;

    /**
     * Regular expression for validating Registartion Number.
     */
    private static final String REGISTRATION_NUM_VALID_REGEX =
            "(?=.*[0-9])" + "(?=.*[a-zA-Z])" + "[a-zA-Z0-9]*";

    /**
     * Vehicle registration number should have atleast two digits.
     */
    private static final int VEHICLE_REGISTRATION_NUM_MIN_DIGITS = 2;

    /**
     * This method checks the whether the given vehicle registration number is valid or not.
     * 
     * @param regNum vehicle registration number
     * @return true if registration number length is 10 and should not have any special symbols.
     * @throws InvalidRegistrationNumberException {@link InvalidRegistrationNumberException}
     */
    public boolean validate(final String regNum) throws InvalidRegistrationNumberException {
        boolean bool = false;
        if (regNum.isEmpty()) {
            throw new InvalidRegistrationNumberException(
                    "Vehicle registration number should not be empty");
        }
        /*
         * Condition to check vehicleNo length should be 10, regular expression for vehicleNo should be alphanumeric.
         */
        if (regNum.length() == VEHICLE_REGISTRATION_NUM_LENGTH
                && regNum.matches(REGISTRATION_NUM_VALID_REGEX)) {
            bool = true;
        } else {
            // raise if registration number is not valid.
            throw new InvalidRegistrationNumberException("Vehicle registration number should"
                    + "be alpha numeric and length should be 10");
        }
        /* Checks Registration number should have at least 2 digits. */
        if (regNum.replaceAll("[a-zA-Z]", "").length() < VEHICLE_REGISTRATION_NUM_MIN_DIGITS) {
            throw new InvalidRegistrationNumberException(
                    "Vehicle registration number should have atleast two digits");
        }
        return bool;
    }
}
