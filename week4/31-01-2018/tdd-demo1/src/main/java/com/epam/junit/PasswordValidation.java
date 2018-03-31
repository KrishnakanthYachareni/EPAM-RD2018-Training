/**
 * This is basic Junit Testing example.
 */
package com.epam.junit;

/**
 * The PasswordValidation class validats the user password.
 * @author Krishnakanth Yachareni.
 */
public class PasswordValidation {
    /**
     * Regular expression for password validation. Password minimum length is 8,
     * Maximum length is 20.
     */
    private static final String REGEX_PASSWORD_VALIDATION =
            "^[a-zA-Z0-9]{8,20}$";
    /**
     * This method validates the password.Password can have Alpha Numeric
     * characters. Password can have Lower/Upper case alphabets. Length of
     * password should be within the range 8-20
     * @param password
     *            use password.
     * @return true or false.
     */
    public boolean passwordValidation(final String password) {
        boolean bool = true;
        if (!password.matches(REGEX_PASSWORD_VALIDATION)) {
            bool = false;
        }
        return bool;
    }
}
