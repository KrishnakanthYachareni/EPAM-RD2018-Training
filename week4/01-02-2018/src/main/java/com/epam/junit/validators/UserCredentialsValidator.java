/**
 * This is a basic user validation J unit example.
 */
package com.epam.junit.validators;

import com.epam.junit.exceptions.InvalidAgeException;
import com.epam.junit.exceptions.InvalidCredentialsException;

/**
 * The {@link UserCredentialsValidator} class validates the user name, age,
 * password.
 * @author Krishnakanth_Yachareni.
 */
public class UserCredentialsValidator {

    /**
     * Invalid credentials exception message.
     */
    private static final String
    INVALID_CREDENTIALS_EXCEPTION_MESSAGE = "Invalid Credentials";
    /**
     * Invalid Age exception.
     */
    private static final String INVALID_AGE_EXCEPTION_MESSAGE = "Invalid AGE";
    /**
     * {@link UseNameValidation} reference.
     */
    private UseNameValidation userNameValidation;
    /**
     * {@link AgeValidation} reference.
     */
    private AgeValidation ageValidation;
    /**
     * {@link PasswordValidation} reference.
     */
    private PasswordValidation passwordValidation;

    /**
     * This is constructor that can accept {@link UserCredentialsValidator}
     * parameters and then initialize to the above objects.
     * @param name
     *            {@link UseNameValidation} object.
     * @param age
     *            {@link AgeValidation} object.
     * @param password
     *            {@link PasswordValidation} object.
     */
    public UserCredentialsValidator(final UseNameValidation name,
            final AgeValidation age, final PasswordValidation password) {
        this.userNameValidation = name;
        this.ageValidation = age;
        this.passwordValidation = password;
    }

    /**
     * This method validates user name, age, password.
     * @param validUserName
     *            user name.
     * @param validAge
     *            age.
     * @param validPassword
     *            password.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    public void isValidCredentials(final String validUserName,
            final int validAge, final String validPassword)
            throws InvalidCredentialsException, InvalidAgeException {
        /*
         * Calling user name, age, password validators method.
         */
        boolean isValiduserName = this.userNameValidation
                .isNameValid(validUserName);
        boolean isValidPassword = this.passwordValidation
                .isPasswordValid(validPassword);
        boolean isValidAge = this.ageValidation.isAgeValid(validAge);
        if (!isValiduserName) {
            throw new InvalidCredentialsException(
                    INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        }
        if (!isValidPassword) {
            throw new InvalidCredentialsException(
                    INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        }
        if (!isValidAge) {
            throw new InvalidAgeException(INVALID_AGE_EXCEPTION_MESSAGE);
        }
    }
}
