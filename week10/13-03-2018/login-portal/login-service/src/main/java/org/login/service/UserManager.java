/**
 * This is a simple login example.
 */
package org.login.service;

import org.login.dao.UserDaoFactory;
import org.login.dao.model.User;
import org.login.service.exception.InvalidCredentialsException;
import org.login.service.exception.InvalidUserNameException;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class UserManager {

    /**
     * @param username
     * @param password
     * @return true if successful login.
     * @throws InvalidCredentialsException {@link InvalidCredentialsException}
     */
    public boolean login(String username, String password) throws InvalidCredentialsException {

        if (!UserDaoFactory.create().isValid(username, password)) {
            throw new InvalidCredentialsException("Invalid Username and Password");
        }
        return true;
    }

    /**
     * @param username
     * @param password
     * @return true if successful signup.
     * @throws InvalidCredentialsException {@link InvalidCredentialsException}
     */
    public boolean signIn(String username, String password) throws InvalidUserNameException {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        if (UserDaoFactory.create().isExist(username)) {
            throw new InvalidUserNameException(
                    "User name is already exists, please give other name");
        }
        return UserDaoFactory.create().addUser(user);

    }
}
