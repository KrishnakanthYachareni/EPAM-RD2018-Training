/**
 * This is simple dbUnit example.
 */
package com.epam;

import com.epam.model.User;

/**
 * @author Krishnakanth_Yachareni
 *
 */
public interface LoginDAO {
    
    /**
     * @param userName
     * @return {@link User}
     */
    public User findEmployeeByUsername(String userName);
}
