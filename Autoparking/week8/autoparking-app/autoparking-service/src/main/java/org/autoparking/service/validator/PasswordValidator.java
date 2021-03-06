/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package org.autoparking.service.validator;

import org.autoparking.service.exception.InvalidUserNameException;

/**
 * The PasswordValidation class validats the user password.
 * 
 * @author Krishnakanth Yachareni.
 */
public class PasswordValidator implements Validator {

    /**
     * Regular expression to validate the user password.
     */
    private static final String REGEX_PASSWORD_VALIDATION = "^[a-zA-Z0-9]{8,20}$";

    /**
     * This method validates the password.Password can have Alpha Numeric
     * characters. Password can have Lower/Upper case alphabets. Length of
     * password should be within the range 8-20
     * 
     * @param password use password.
     * @return true or false.
     * @throws InvalidUserNameException {@link InvalidUserNameException}
     */
    @Override
    public boolean validate(final String password) throws InvalidUserNameException {
        if (!password.matches(REGEX_PASSWORD_VALIDATION)) {
            throw new InvalidUserNameException(
                    "Password length should be" + "in between in between 8 to 20");
        }
        return true;
    }
}
