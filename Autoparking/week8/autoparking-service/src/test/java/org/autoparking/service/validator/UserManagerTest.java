/**
 * This is J unit test cases for user manager class.
 */
package org.autoparking.service.validator;

import static org.junit.Assert.assertTrue;

import org.autoparking.api.model.impl.UserEntityImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * This UserManagerTest class test the user login and sign up.
 * @author Krishnakanth_Yachare
 */
@RunWith(MockitoJUnitRunner.class)
public class UserManagerTest {

    /**
     * {@link UserManager} reference.
     */
    @InjectMocks
    private UserEntityImpl uManager;

    /**
     * This can test New user adding to file.
     */
    @Test
    public void addNewUserTest() {
        boolean bool = uManager.addNewUser("Krishna", "password",
                "EPAM Systems");
        assertTrue(bool);
    }

    /**
     * This can test the given login credentails are valid or not.
     */
    @Test
    public void isUserValidTest() {
        boolean bool = uManager.checkUser("Krishna", "password");
        assertTrue(bool);
    }
}
