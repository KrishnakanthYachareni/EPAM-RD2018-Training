/**
 * This is a simple login example.
 */
package org.login.service.validator;

import org.login.service.exception.InvalidUserNameException;

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
     * This method validates the password.Password can have Alpha Numeric characters. Password can have Lower/Upper case
     * alphabets. Length of password should be within the range 8-20
     * 
     * @param password use password.
     * @return true or false.
     * @throws InvalidUserNameException {@link InvalidUserNameException}
     */
    public boolean validate(final String password) throws InvalidUserNameException {
        if (!password.matches(REGEX_PASSWORD_VALIDATION)) {
            throw new InvalidUserNameException(
                    "Password length should be" + "in between in between 8 to 20");
        }
        return true;
    }
}
