/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.validators;

import com.epam.myapp.exceptions.InvalidUserNameException;
import com.epam.myapp.util.Constants;

/**
 * The UseNameValidation class has method to validate the user name.
 * @author Krishnakanth Yachareni
 */
public class UseNameValidator implements Validator {
    /**
     * @param name
     *            String username.
     * @return true or false, It returns true if user name have only lower case
     *         letters and length in between 5 to 8. Otherwise it will return
     *         false.
     * @throws InvalidUserNameException
     *             {@link InvalidUserNameException}
     */
    @Override
    public boolean validate(final String name) throws InvalidUserNameException {
        if (!name.matches(Constants.REGEX_USERNAME_VALID)) {
            throw new InvalidUserNameException(
                    "User name should should not contain" + " special symbols &"
                            + " length in between 5 to 20");
        }
        return true;
    }
}
