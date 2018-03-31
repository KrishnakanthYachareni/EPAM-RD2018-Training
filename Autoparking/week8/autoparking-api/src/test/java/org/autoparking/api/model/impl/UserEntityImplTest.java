/**
 * This is J unit test cases for user manager class.
 */
package org.autoparking.api.model.impl;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * This UserManagerTest class test the user login and sign up.
 * 
 * @author Krishnakanth_Yachare
 */
@RunWith(MockitoJUnitRunner.class)
public class UserEntityImplTest {

    /**
     * {@link UserManager} reference.
     */
    @InjectMocks
    private UserEntityImpl uManager;

    /**
     * This method test the new user adding to file or not.
     */
    @Test
    public void addNewUserTest() {
        boolean bool = uManager.addNewUser
                ("Krishna", "password", "EPAM Systems");
        assertTrue(bool);
    }

    /**
     * This test the given credentails are valid or not.
     */
    @Test
    public void isUserValidTest() {
        boolean bool = uManager.checkUser("Krishna", "password");
        assertTrue(bool);
    }
}
