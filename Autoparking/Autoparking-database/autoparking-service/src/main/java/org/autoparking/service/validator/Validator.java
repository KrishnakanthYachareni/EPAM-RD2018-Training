/**
 * Autaparking application using database.
 */
package org.autoparking.service.validator;

import org.autoparking.service.exception.InvalidParkingLotException;
import org.autoparking.service.exception.InvalidRegistrationNumberException;
import org.autoparking.service.exception.InvalidUserNameException;

/**
 * @author Krishnakanth_Yachare
 */
public interface Validator {
    /**
     * @param string validating parameter.
     * @return boolean
     * @throws InvalidRegistrationNumberException {@link InvalidRegistrationNumberException}
     * @throws InvalidUserNameException {@link UserNameValidator}
     * @throws InvalidParkingLotException {@link InvalidParkingLotException}
     */
    boolean validate(String string) throws InvalidRegistrationNumberException,
            InvalidUserNameException, InvalidParkingLotException;
}
