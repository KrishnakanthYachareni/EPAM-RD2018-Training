/**
 * This is basic Junit Testing example.
 */
package com.epam.myapp.utiltest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.myapp.exceptions.InvalidUserNameException;
import com.epam.myapp.validators.UseNameValidator;

/**
 * The UserNameTest class test the username. Username: Requirement: Username
 * should have lowercase alphabets only. Length of username should be within the
 * range 5-8.
 * @author Krishnakanth Yachareni
 */
public class UserNameTest {
    /**
     * This method test user name start with only alphabets.
     * @throws InvalidUserNameException
     *             {@link InvalidUserNameException}
     */
    @Test(expected = InvalidUserNameException.class)
    public void nameStartWithTest() throws InvalidUserNameException {
        UseNameValidator userName = new UseNameValidator();
        userName.validate("kri");
    }

    /**
     * This method test user name length should be in between 5 to 8.
     * @throws InvalidUserNameException
     *             {@link InvalidUserNameException}
     */
    @Test
    public void nameLengthtest() throws InvalidUserNameException {
        UseNameValidator userName = new UseNameValidator();
        assertTrue(userName.validate("krishna"));
    }
}
