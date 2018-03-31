/**
 * This is basic Junit Testing example.
 */
package com.epam.junitcase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.junit.UseNameValidation;

/**
 * The UserNameTest class test the username. Username: Requirement: Username
 * should have lowercase alphabets only. Length of username should be within the
 * range 5-8.
 * @author Krishnakanth Yachareni
 */
public class UserNameTest {
    /**
     * This method test user name start with only alphabets.
     */
    @Test
    public void nameStartWithTest() {
        UseNameValidation userName = new UseNameValidation();
        assertFalse("Invalid,Username should not contain numbers",
                userName.validateName("12345"));
        assertFalse("Invalid,Username should not contain special symbols",
                userName.validateName("@kridn"));
        assertFalse("Invalid,Username should not contain UpperCase letters",
                userName.validateName("Krishna"));
        assertTrue("Valid user name", userName.validateName("krishna"));
    }

    /**
     * This method test user name length should be in between 5 to 8.
     */
    @Test
    public void nameLengthtest() {
        UseNameValidation userName = new UseNameValidation();
        assertFalse("Invalid,Username length should not be less than 5",
                userName.validateName("kris"));
        assertFalse("Invalid,Username length should not be more than 8",
                userName.validateName("krishnakanth"));
    }
}
