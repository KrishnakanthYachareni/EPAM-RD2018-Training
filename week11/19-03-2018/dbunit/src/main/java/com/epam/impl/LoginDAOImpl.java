/**
 * This is simple dbUnit example.
 */
package com.epam.impl;

import java.sql.SQLException;

import com.epam.LoginDAO;
import com.epam.helper.LoginCRUD;
import com.epam.model.User;

/**
 * @author Krishnakanth_Yachareni
 *
 */
public class LoginDAOImpl implements LoginDAO {

    /**
     * {@link LoginCRUD}
     */
    private LoginCRUD loginCRUD;

    /**
     * This constructor can initialize the {@link LoginCRUD} object.
     */
    public LoginDAOImpl() {
        loginCRUD = new LoginCRUD();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.epam.LoginDAO#findEmployeeByUsername(java.lang.String)
     */
    public User findEmployeeByUsername(String userName) {
        try {
            return loginCRUD.getUserCredential(userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
