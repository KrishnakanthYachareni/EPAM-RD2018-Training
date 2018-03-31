/**
 * This is a simple login example.
 */
package org.login.dao.model;

import java.util.Objects;

/**
 * This is an user POJO class.
 * 
 * @author Krishnakanth_Yachare
 *
 */
public class User {

    /**
     * User id.
     */
    private int id;

    /**
     * Admin user name.
     */
    private String username;

    /**
     * Admin password.
     */
    private String password;

    /**
     * @return user id
     */
    public int getId() {
        return id;
    }


    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.username, this.password);
    }

    @Override
    public final boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return Objects.equals(this.username, other.username)
                && Objects.equals(this.password, other.password);
    }


}
