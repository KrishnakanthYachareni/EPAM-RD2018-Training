/**
 * This is simple dbUnit example.
 */
package com.epam.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.epam.model.User;

/**
 * CrudOperation class perform the read operation on the login table and returns
 * the object of user Logincredential class.
 * 
 * @author Krishnakanth_Yachareni.
 *
 */
public class LoginCRUD {

    /**
     * Logginig Initialization.
     */
    private static final Logger LOGGER = LogManager.getLogger(LoginCRUD.class);

    /**
     * Get Database connection from {@link DbManager}
     */
    private static final Connection connection = DbManager.getDBConnection();

    /**
     * This method reads the rows from the login table, then returns the
     * LoginCreddential object.
     * @param username
     *            is the name of the user of whom we want the LoginCredential
     *            data.
     * @return LoginCredential Object
     */
    public User getUserCredential(String username) throws SQLException {
        
        final String queryToGetUserNamePassword = "Select username, password from login where username=?";
        User user = null;
        
        try (PreparedStatement preparedStatement = connection
                .prepareStatement(queryToGetUserNamePassword);) {

            if (null != username) {
                preparedStatement.setString(1, username);
                ResultSet result = preparedStatement.executeQuery();
                while (result.next()) {
                    user = new User(result.getString("username"),
                            result.getString("password"));
                }
            }
        }
        LOGGER.info("returning loginCredential");
        return user;
    }

}
