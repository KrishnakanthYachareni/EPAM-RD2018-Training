/**
 * This is a simple login example.
 */
package org.login.dao;

import org.login.dao.model.User;

/**
 * This is an interface for UserDao.
 * 
 * @author Krishnakanth_Yachare
 *
 */
public interface UserDao {

    /**
     * @param user {@link User}
     * @return true if successfully add else false.
     */
    boolean addUser(User user);

    /**
     * @param userName
     * @param password
     * @return true if both are valid else false;
     */
    boolean isValid(String userName, String password);

    /**
     * @param username
     * @return true if given username is exist else return false.
     */
    boolean isExist(String username);

}
