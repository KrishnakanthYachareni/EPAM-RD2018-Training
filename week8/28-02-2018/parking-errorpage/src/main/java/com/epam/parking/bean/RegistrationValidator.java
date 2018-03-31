/**
 * This is an jsp errorPage example.
 */
package com.epam.parking.bean;

import com.epam.parking.exception.InvalidRegistrationException;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class RegistrationValidator {
    /**
     * @param vehicleNumber
     * @throws InvalidRegistrationException {@link InvalidRegistrationException}
     */
    public void registrationNumValidator(final String vehicleNumber)
            throws InvalidRegistrationException {
        if (vehicleNumber == null || vehicleNumber.isEmpty()) {
            throw new InvalidRegistrationException(
                    "Registration Number should not be empty ot null");
        }
        if (vehicleNumber.length() != 10) {
            throw new InvalidRegistrationException("Registration Number length shoulbe 10");
        }
    }
}
