/**
 * 
 */
package com.epam.impl;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.epam.helper.LoginCRUD;
import com.epam.model.User;

/**
 * @author Krishnakanth_Yachareni
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginDAOImplTest {

    @Mock
    private static LoginCRUD loginCRUD;

    @InjectMocks
    private static LoginDAOImpl loginDAOImpl;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void UserCredentialsTest() throws SQLException {
        when(loginCRUD.getUserCredential(any(String.class)))
                .thenReturn(new User());

        assertTrue(loginDAOImpl.findEmployeeByUsername("any") instanceof User);
    }

    @Test
    public void employeeByUsernameTest()
            throws SQLException {

        final String actualUsername = "EPAM";
        final String actualPassword = "Hyderabad";

        User expectedLoginCredential = new User();
        expectedLoginCredential.setUserName(actualUsername);
        expectedLoginCredential.setPassword(actualPassword);

        loginDAOImpl = new LoginDAOImpl();

        User actualLoginCredential = loginDAOImpl
                .findEmployeeByUsername(actualUsername);

        assertTrue(actualLoginCredential.getPassword()
                .equals(expectedLoginCredential.getPassword()));
    }

}
