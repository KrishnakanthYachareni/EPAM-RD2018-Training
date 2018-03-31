/**
 * This is basic Junit Testing example.
 */
package com.epam.junitcase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.epam.junit.AgeValidation;
import com.epam.junit.CredentialValidation;
import com.epam.junit.PasswordValidation;
import com.epam.junit.UseNameValidation;
import com.epam.junit.exceptions.InvalidCredentialException;

/**
 * The CredentialValidationTest is a J unit class it tests the
 * {@link CredentialValidation} class,It has integrated with
 * {@link AgeValidation}, {@link UseNameValidation}, {@link PasswordValidation}.
 * @author Krishnakanth_Yachareni.
 */
public class CredentialValidationTest {
    /**
     * UseNameValidation Object.
     */
    private UseNameValidation userName = new UseNameValidation();
    /**
     * AgeValidation Object.
     */
    private AgeValidation age = new AgeValidation();
    /**
     * AgeValidation Object.
     */
    private PasswordValidation password = new PasswordValidation();
    /**
     * CredentialValidation object reference.
     */
    private CredentialValidation credValid;

    /**
     * This method test valid username, age, password.
     * @throws InvalidCredentialException
     *             {@link InvalidCredentialException}
     */
    @Test
    public void credentailsValidationTest1() throws InvalidCredentialException {
        credValid = new CredentialValidation(userName, age, password);
        final String pass = "Krishna123"; // Valid password.
        final int pAge = 21; // valid age.
        final String pName = "krishna"; // Valid user name.
        assertTrue(credValid.isValidCredentials(pName, pAge, pass));
    }

    /**
     * It is J unit rule that checks expected Exceptions.
     */
    @Rule
    public ExpectedException uException = ExpectedException.none();

    /**
     * This method tests invalid username.
     * @throws InvalidCredentialException
     *             {@link InvalidCredentialException}
     */
    @Test()
    public void credentailsValidationTest2() throws InvalidCredentialException {
        final String pass = "Krishna123"; // Valid password.
        final int pAge = 21; // valid age.
        /*
         * InvalidCredentialException exception expected.
         */
        uException.expect(InvalidCredentialException.class);
        /*
         * InvalidCredentialException message validates.
         */
        uException.expectMessage("Invalid User Name");
        credValid = new CredentialValidation(userName, age, password);
        /*
         * User name should have only LowerCase.
         */
        assertFalse(credValid.isValidCredentials("123434", pAge, pass));
        assertFalse(credValid.isValidCredentials("@krish", pAge, pass));
        assertFalse(credValid.isValidCredentials("Krishna", pAge, pass));
        assertFalse(credValid.isValidCredentials("kris hna", pAge, pass));
        /*
         * User name length should be in between 5 to 8.
         */
        assertFalse(credValid.isValidCredentials("krishnakanth", pAge, pass));
        assertFalse(credValid.isValidCredentials("kri", pAge, pass));
    }

    /**
     * This method tests invalid age.
     * @throws InvalidCredentialException
     *             {@link InvalidCredentialException}
     */
    @Test()
    public void credentailsValidationTest3() throws InvalidCredentialException {
        final String pName = "krishna"; // Valid username
        final String pass = "Krishna123"; // Valid password.
        final int lowAge = 10; // Invalid age.
        final int highAge = 70; // Invalid age.
        /*
         * InvalidCredentialException exception expected.
         */
        uException.expect(InvalidCredentialException.class);
        /*
         * InvalidCredentialException message validates.
         */
        uException.expectMessage("Invalid Age");
        credValid = new CredentialValidation(userName, age, password);
        /*
         * Age should be in between 16 to 60.
         */
        assertFalse(credValid.isValidCredentials(pName, lowAge, pass));
        assertFalse(credValid.isValidCredentials(pName, highAge, pass));
    }

    /**
     * This method tests invalid password.
     * @throws InvalidCredentialException
     *             {@link InvalidCredentialException}
     */
    @Test()
    public void credentailsValidationTest4() throws InvalidCredentialException {
        /*
         * Valid user name and age.
         */
        final String pName = "krishna";
        final int pAge = 21;
        /*
         * InvalidCredentialException exception expected.
         */
        uException.expect(InvalidCredentialException.class);
        /*
         * InvalidCredentialException message validates.
         */
        uException.expectMessage("Invalid Password");
        credValid = new CredentialValidation(userName, age, password);
        /*
         * Password should have only lower case or upper case or numbers.
         */
        assertFalse(credValid.isValidCredentials(pName, pAge, "@abcdghe123"));
        assertFalse(credValid.isValidCredentials(pName, pAge, "Krish nak12"));
        /*
         * Password length should be in between 8 to 20.
         */
        assertFalse(credValid.isValidCredentials(pName, pAge, "Kri12"));
        assertFalse(credValid.isValidCredentials(pName, pAge,
                "Krishnakanth123Yachareni"));
    }
}
