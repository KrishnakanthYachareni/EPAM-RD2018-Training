/**
 * This is a simple login example.
 */
package org.login.dao;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class UserDaoFactory {
    /**
     * @return
     */
    public static UserDao create() {
        return new UserDaoImpl();
    }
}
