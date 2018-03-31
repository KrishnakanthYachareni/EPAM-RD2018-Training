/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.util;

import com.epam.rd.myapp.exceptions.InvalidRegistrationNumberException;

/**
 * @author Krishnakanth Yachareni
 *
 */
public class RegNumberValidator {

    /**
     * @param regNo
     *            vehicle registration number
     * @return true if registration number length is 10 and not contain any
     *         special symbols.
     * @throws InvalidRegistrationNumberException
     *             custom exception.
     */
    public boolean isRegNumValid(final String regNo)
            throws InvalidRegistrationNumberException {
        boolean bool = false;
        if (regNo.isEmpty()) {
            throw new InvalidRegistrationNumberException(
                    "Vehicle registration number should not be empty");
        }
        /*
         * Condition to check vehicleNo length should be 10, regular expression
         * for vehicleNo should be alphanumeric
         */
        if (regNo.length() == Constants.VEHICLE_REGISTRATION_NUM_LENGTH && regNo
                .matches("(?=.*[0-9])" + "(?=.*[a-zA-Z])" + "[a-zA-Z0-9]*")) {
            bool = true;
        } else {
            throw new InvalidRegistrationNumberException(
                    "Vehicle registration number should"
                            + "be alpha numeric and length should be 10");
        }
        return bool;
    }

    /**
     * @param regNo
     *            vehicle registration number
     * @return true if vehicle registration number doesn't contains less than 2
     *         digits.
     * @throws InvalidRegistrationNumberException
     *             custom exception.
     */
    public boolean isRegHasTwoDigits(final String regNo)
            throws InvalidRegistrationNumberException {
        int count = 0;
        for (char character : regNo.toCharArray()) {
            if (Character.isDigit(character)) {
                count++;
            }
        }
        if (count < Constants.VEHICLE_REGISTRATION_NUM_MIN_DIGITS) {
            throw new InvalidRegistrationNumberException(
                    "Vehicle registration number should"
                            + "have atleast two digit");
        }
        return true;
    }

}
