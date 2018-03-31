/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.validators;

import com.epam.myapp.exceptions.InvalidParkingAreaException;
import com.epam.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.myapp.exceptions.InvalidUserNameException;

/**
 * @author Krishnakanth_Yachare
 */
public interface Validator {
    /**
     * @param string
     *            validating parameter.
     * @return boolean
     * @throws InvalidParkingAreaException
     *             {@link InvalidParkingAreaException}
     * @throws InvalidRegistrationNumberException
     *             {@link InvalidRegistrationNumberException}
     * @throws InvalidUserNameException
     *             {@link UseNameValidator}
     */
    boolean validate(String string) throws InvalidParkingAreaException,
            InvalidRegistrationNumberException, InvalidUserNameException;
}
