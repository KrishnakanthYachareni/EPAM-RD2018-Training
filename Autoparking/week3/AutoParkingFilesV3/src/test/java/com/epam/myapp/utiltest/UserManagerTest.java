/**
 * This is J unit test cases for user manager class.
 */
package com.epam.myapp.utiltest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.epam.myapp.service.UserManager;

/**
 * This UserManagerTest class test the user login and sign up.
 * @author Krishnakanth_Yachare
 */
public class UserManagerTest {
    /**
     * User name.
     */
    private static final String USERNAME = "admin";
    /**
     * Password.
     */
    private static final String PASSWORD = "admin";
    /**
     * Valid parking lot name.
     */
    private static final String PARKING_LOT_NAME = "EPAM";
    /**
     * valid parking lot capacity.
     */
    private static final int LOT_CAPACITY = 10;
    /**
     * Invalid user name.
     */
    private static final String INVALID_USERNAME = "ADBVS";
    /**
     * Invalid password.
     */
    private static final String INVALID_PASSWORD = "dsfdb";

    /**
     * {@link UserManager} reference.
     */
    private UserManager uManager;

    /**
     * @throws Exception
     *             {@link Exception}
     */
    @Before
    protected void setUp() throws Exception {
        uManager = new UserManager();
    }

    /**
     * ExpectedException junit rule.
     */
    @Rule
    ExpectedException thrown = ExpectedException.none();

    /**
     * @throws IOException
     *             {@link IOException}
     */
    @Test
    public void testAddNewUser() throws IOException {
        boolean bool = uManager.addNewUser(USERNAME, PASSWORD, PARKING_LOT_NAME,
                LOT_CAPACITY);
        assertTrue(bool);
    }

    /**
     * @throws FileNotFoundException
     *             {@link FileNotFoundException}
     * @throws ClassNotFoundException
     *             {@link ClassNotFoundException}
     * @throws IOException
     *             {@link FileNotFoundException}
     */
    @Test
    public void testIsUserValid1()
            throws FileNotFoundException, ClassNotFoundException, IOException {
        boolean bool = uManager.isUserValid(USERNAME, PASSWORD);
        assertTrue(bool);
    }

    /**
     * @throws FileNotFoundException
     *             {@link FileNotFoundException}
     * @throws ClassNotFoundException
     *             {@link ClassNotFoundException}
     * @throws IOException
     *             {@link IOException}
     */
    @Test
    public void testIsUserValid2()
            throws FileNotFoundException, ClassNotFoundException, IOException {
        boolean bool = uManager.isUserValid(INVALID_USERNAME, INVALID_PASSWORD);
        assertFalse(bool);
    }
}
