/**
 * This is basic Junit Testing example.
 */
package com.epam.junit.validators;

/**
 * The UseNameValidation class has method to validate the user name.
 * @author Krishnakanth Yachareni
 */
public class UseNameValidation {
    /**
     * Regex for user name validation.
     */
    private static final String REGEX_USERNAME_VALID = "^[a-z]{5,8}$";

    /**
     * @param name
     *            String username.
     * @return true or false, It returns true if user name have only lower case
     *         letters and length in between 5 to 8. Otherwise it will return
     *         false.
     */
    public boolean isNameValid(final String name) {
        boolean bool = true;
        if (name == null || !name.matches(REGEX_USERNAME_VALID)) {
            bool = false;
        }
        return bool;
    }
}
