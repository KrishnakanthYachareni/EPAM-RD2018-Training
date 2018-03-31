/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package org.autoparking.service.validator;


import org.autoparking.api.exception.InvalidParkingLotException;
import org.autoparking.service.exception.InvalidRegistrationNumberException;
import org.autoparking.service.exception.InvalidUserNameException;

/**
 * @author Krishnakanth_Yachare
 */
public interface Validator {
    /**
     * @param string validating parameter.
     * @return boolean
     * @throws InvalidRegistrationNumberException
     *         {@link InvalidRegistrationNumberException}
     * @throws InvalidUserNameException {@link UserNameValidator}
     * @throws InvalidParkingLotException {@link InvalidParkingLotException}
     */
    boolean validate(String string) throws InvalidRegistrationNumberException,
            InvalidUserNameException, InvalidParkingLotException;
}
