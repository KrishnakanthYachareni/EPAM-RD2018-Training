/**
 * This is a simple javax validator example.
 */
package com.epam.javax.validator;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * This is User bean class here we are validating the user parameters by using validator API.
 * 
 * @author Krishnakanth_Yachare
 *
 */
public class User {

    /**
     * User name to validate.
     */
    private String username;

    /**
     * Password to validate.
     */
    private String password;

    /**
     * @return username
     */
    @NotNull(message = "First name is compulsory")
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    @Pattern(regexp = "[a-z-A-Z]*", message = "password has invalid characters")
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
