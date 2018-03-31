/**
 * This is basic Junit Testing example.
 */
package com.epam.junit;

import com.epam.junit.exceptions.InvalidCredentialException;

/**
 * The CredentialValidation class can validates user name, age, password at a
 * time.
 * @author Krishnakanth_Yachareni
 */
public class CredentialValidation {

    /**
     * Declare UseNameValidation reference.
     */
    private UseNameValidation userName;
    /**
     * Declare AgeValidation reference.
     */
    private AgeValidation age;
    /**
     * Declare PasswordValidation reference.
     */
    private PasswordValidation password;

    /**
     * This is constructor that can initialize the above objects.
     * @param name
     *            user name.
     * @param pAge
     *            age.
     * @param pass
     *            password.
     */
    public CredentialValidation(final UseNameValidation name,
            final AgeValidation pAge, final PasswordValidation pass) {
        this.userName = name;
        this.age = pAge;
        this.password = pass;
    }

    /**
     * @param name
     *            user name.
     * @param pAge
     *            age.
     * @param pass
     *            password.
     * @return boolean, true if name,age,password are valid else false.
     * @throws InvalidCredentialException
     *             {@link InvalidCredentialException}
     */
    public boolean isValidCredentials(final String name, final int pAge,
            final String pass) throws InvalidCredentialException {
        /*
         * Calling user name, age, password validators.
         */
        boolean nameBool = this.userName.validateName(name);
        boolean ageBool = this.age.ageValidation(pAge);
        boolean passBool = this.password.passwordValidation(pass);
        /*
         * checking individual return value either true or false.
         */
        if (!nameBool) {
            throw new InvalidCredentialException("Invalid User Name");
        }
        if (!ageBool) {
            throw new InvalidCredentialException("Invalid Age");
        }
        if (!passBool) {
            throw new InvalidCredentialException("Invalid Password");
        }
        return nameBool && ageBool && passBool;
    }
}
