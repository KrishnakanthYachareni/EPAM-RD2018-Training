/**
 * This is autoparking Junit Testing.
 */
package org.autoparking.service.validator;

import static org.junit.Assert.assertTrue;

import org.autoparking.service.exception.InvalidUserNameException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * The PasswordTest class test the password.
 * 
 * @author Krishnakanth Yachareni.
 */
@RunWith(MockitoJUnitRunner.class)
public class PasswordTest {

    /**
     * {@link PasswordValidator}.
     */
    @InjectMocks
    private PasswordValidator passValidator;

    /**
     * This method tests the user password. Requirement: Password can have Alpha
     * Numeric characters. Password can have Lower/Upper case alphabets.
     * 
     * @throws InvalidUserNameException {@link InvalidUserNameException}
     */
    @Test(expected = InvalidUserNameException.class)
    public void invalidPasswordTest() throws InvalidUserNameException {
        passValidator.validate("Hel@#12");
    }

    /**
     * This method Test the length of password should be within the range 8-20.
     * 
     * @throws InvalidUserNameException {@link InvalidUserNameException}
     */
    @Test
    public void validPasswordTest() throws InvalidUserNameException {
        assertTrue(passValidator.validate("Krishnakanth12"));
    }

}
