/**
 * Autaparking application using database.
 */
package org.autoparking.service.user;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.autoparking.dao.user.UserDAO;
import org.autoparking.dao.user.UserDAOImpl;
import org.autoparking.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Set;

/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class UserDAOImplTest {

    /**
     * {@link UserDAO}
     */
    @InjectMocks
    private UserDAOImpl userDao;

    /**
     * {@link User}
     */
    private User user;

    @Before
    public void setUp() {
        user = new User();
    }


    @Test
    public void testInsertUser() {
        user.setUserName("krishna");
        user.setPassword("krishna1");
        user.setParkingLotName("EPAM SYSYMS");
        assertTrue(userDao.insertUser(user));
    }

    @Test
    public void testGetUser() {
        assertThat(userDao.getUser(1).getUserName(), equalTo("krishna"));
    }

    @Test
    public void testGetAllUsers() {
        Set<User> users = userDao.getAllUsers();
        for (User user : users) {
            assertTrue(user instanceof User);
        }
    }

    @Test
    public void testIsUserValid() {
        assertTrue(userDao.isUserValid("krishna", "krishna1"));
    }
}
