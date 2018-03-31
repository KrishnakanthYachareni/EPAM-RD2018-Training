/**
 * Autaparking application using database.
 */
package org.autoparking.service.validator;

import org.autoparking.service.exception.InvalidUserNameException;

/**
 * The UseNameValidation class has method to validate the user name.
 * 
 * @author Krishnakanth Yachareni
 */
public class UserNameValidator implements Validator {

    /**
     * Regular expression for validate username.
     */
    private static final String REGEX_USERNAME_VALID = "^[a-z]{5,20}$";

    /**
     * @param name String username.
     * @return true or false, It returns true if user name have only lower case letters and length in between 5 to 8.
     *         Otherwise it will return false.
     * @throws InvalidUserNameException {@link InvalidUserNameException}
     */
    public boolean validate(final String name) throws InvalidUserNameException {
        if (!name.matches(REGEX_USERNAME_VALID)) {
            throw new InvalidUserNameException("User name should should not contain"
                    + " special symbols &" + " length in between 5 to 20");
        }
        return true;
    }
}
