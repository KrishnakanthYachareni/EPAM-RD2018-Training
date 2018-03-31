/**
 * This is a simple login example.
 */
package org.login.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.login.service.exception.InvalidCredentialsException;
import org.login.service.exception.InvalidUserNameException;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class UserManagerTest {

    /**
     * Injecting {@link UserManager}.
     */
    @InjectMocks
    UserManager userManager;


    /**
     * @throws InvalidUserNameException
     */
    @Test
    public void signInTest() throws InvalidUserNameException {
        assertTrue(userManager.signIn("EPAM", "password"));
    }

    /**
     * @throws InvalidUserNameException
     */
    @Test(expected = InvalidUserNameException.class)
    public void nameAlreadyExistTest() throws InvalidUserNameException {
        assertTrue(userManager.signIn("krishna", "password"));
    }

    /**
     * @throws InvalidCredentialsException
     */
    @Test
    public void validloginTest() throws InvalidCredentialsException {
        assertTrue(userManager.login("EPAM", "password"));
    }

    /**
     * @throws InvalidCredentialsException
     */
    @Test(expected = InvalidCredentialsException.class)
    public void invalidUsernameTest() throws InvalidCredentialsException {
        assertTrue(userManager.login("invalid", "password"));
    }

    /**
     * @throws InvalidCredentialsException
     */
    @Test(expected = InvalidCredentialsException.class)
    public void invalidPasswordTest() throws InvalidCredentialsException {
        assertTrue(userManager.login("EPAM", "invalid"));
    }
}
