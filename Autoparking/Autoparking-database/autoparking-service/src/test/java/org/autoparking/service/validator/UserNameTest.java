/**
 * This is basic Junit Testing example.
 */
package org.autoparking.service.validator;

import static org.junit.Assert.assertTrue;

import org.autoparking.service.exception.InvalidUserNameException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * The UserNameTest class test the username. Username: Requirement: Username
 * should have lowercase alphabets only. Length of username should be within the
 * range 5-8.
 * 
 * @author Krishnakanth Yachareni
 */
@RunWith(MockitoJUnitRunner.class)
public class UserNameTest {

    /**
     * {@link UserNameValidator}.
     */
    @InjectMocks
    private UserNameValidator userName;

    /**
     * This method test user name start with only alphabets.
     * 
     * @throws InvalidUserNameException
     *             {@link InvalidUserNameException}
     */
    @Test(expected = InvalidUserNameException.class)
    public void nameStartWithTest() throws InvalidUserNameException {
        userName.validate("kri");
    }

    /**
     * This method test user name length should be in between 5 to 8.
     * 
     * @throws InvalidUserNameException
     *             {@link InvalidUserNameException}
     */
    @Test
    public void nameLengthTest() throws InvalidUserNameException {
        assertTrue(userName.validate("krishna"));
    }
}
