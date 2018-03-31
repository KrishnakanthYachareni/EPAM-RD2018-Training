/**
 * This is basic Junit Testing example.
 */
package com.epam.myapp.utiltest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.myapp.exceptions.InvalidUserNameException;
import com.epam.myapp.validators.PasswordValidator;

/**
 * The PasswordTest class test the password.
 * @author Krishnakanth Yachareni.
 */
public class PasswordTest {
    /**
     * This method tests the user password. Requirement: Password can have Alpha
     * Numeric characters. Password can have Lower/Upper case alphabets.
     * @throws InvalidUserNameException
     *             {@link InvalidUserNameException}
     */
    @Test(expected = InvalidUserNameException.class)
    public void passwordTest1() throws InvalidUserNameException {
        PasswordValidator pass = new PasswordValidator();
        pass.validate("Hel@#12");
    }

    /**
     * This method Test the length of password should be within the range 8-20.
     * @throws InvalidUserNameException
     *             {@link InvalidUserNameException}
     */
    @Test
    public void passwordTest2() throws InvalidUserNameException {
        PasswordValidator pass = new PasswordValidator();
        assertTrue(pass.validate("Krishnakanth12"));
    }

}
