/**
 * This is basic Junit Testing example.
 */
package com.epam.junitcase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.junit.PasswordValidation;

/**
 * The PasswordTest class test the password.
 * @author Krishnakanth Yachareni.
 */
public class PasswordTest {
    /**
     * This method tests the user password. Requirement: Password can have Alpha
     * Numeric characters. Password can have Lower/Upper case alphabets.
     */
    @Test
    public void passAlphaNumericTest() {
        PasswordValidation pass = new PasswordValidation();

        assertFalse("Invalid,Password should not have special symbols",
                pass.passwordValidation("@abcdghe123"));
        assertFalse("Invalid,Password should not contains spaces or tabs",
                pass.passwordValidation("Krish nak12"));
        assertTrue("Valid password",
                pass.passwordValidation("Krishnakanth5343"));
    }

    /**
     * This method Test the length of password should be within the range 8-20.
     */
    @Test
    public void passLengthTest() {
        PasswordValidation pass = new PasswordValidation();
        assertFalse("Invalid,Password Length should not be less than 8",
                pass.passwordValidation("Kri12"));
        assertFalse("Invalid,Password length should not be more than 20",
                pass.passwordValidation("Krishnakanth123Yachareni"));
    }

}
