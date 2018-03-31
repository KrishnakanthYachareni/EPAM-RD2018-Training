/**
 * Autaparking application using database.
 */
package org.autoparking.dao.user;

/**
 * Singleton class of {@link UserDAOImpl}
 * 
 * @author Krishnakanth
 *
 */
public class UserDAOFactory {

    /**
     * @return {@link UserDAOImpl}
     */
    public static UserDAO create() {
        return new UserDAOImpl();
    }

}
