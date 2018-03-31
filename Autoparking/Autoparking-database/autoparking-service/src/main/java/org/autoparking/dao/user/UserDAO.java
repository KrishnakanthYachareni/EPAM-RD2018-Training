/**
 * Autaparking application using database.
 */
package org.autoparking.dao.user;

import java.util.Set;

import org.autoparking.model.User;

/**
 * @author Krishnakanth
 *
 */
public interface UserDAO {

    /**
     * @param id
     * @return user object based on given id.
     */
    User getUser(int id);

    /**
     * @return list of User objects
     */
    Set<User> getAllUsers();

    /**
     * This method can checks the whether the given user is exist in db or not.
     * 
     * @param userName
     * @param password
     * @return true if user is exists else return false.
     */
    boolean isUserValid(String userName, String password);

    /**
     * This method can insert the user into database.
     * 
     * @param user
     * @return
     */
    boolean insertUser(User user);

}
