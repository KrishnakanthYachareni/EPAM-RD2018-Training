/**
 * This is a simple login example.
 */
package org.login.dao.dao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.login.dao.UserDaoImpl;
import org.login.dao.model.User;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * This class can test the {@link UserDaoImpl}.
 * 
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class UserDaoImplTest {

    /**
     * Injecting into {@link UserDaoImpl}.
     */
    @InjectMocks
    UserDaoImpl userDao;

    /**
     * This method can test the given credentials adding to the database or not.
     */
    @Test
    public void addUserTest() {
        User user = new User();
        user.setUsername("krishna");
        user.setPassword("password");
        assertTrue(userDao.addUser(user));
    }

    /**
     * This can test whether the given credentials are correct or not.
     */
    @Test
    public void credentialTest() {
        assertTrue(userDao.isValid("krishna", "password"));
        assertFalse(userDao.isValid("user", "password"));
    }

    /**
     * This method can test the whether the username is existing or not.
     */
    @Test
    public void isExistTest() {
        assertTrue(userDao.isExist("krishna"));
        assertFalse(userDao.isExist("user"));
    }

}
