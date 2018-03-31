/**
 * Autaparking application using database.
 */
package org.autoparking.model;

import java.util.Objects;

/**
 * @author Krishnakanth
 *
 */
public class User {

    private int id;
    private String userName;
    private String password;
    private String parkingLotName;

    public User() {
        // Nothing to do.
    }

    /**
     * This constructor can initialize the user details.
     * 
     * @param userName
     * @param password
     * @param parkingLotName
     * @param id
     */
    public User(String userName, String password, String parkingLotName, int id) {
        this.userName = userName;
        this.password = password;
        this.parkingLotName = parkingLotName;
        this.id = id;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(final String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * @return the parkingLotName
     */
    public String getParkingLotName() {
        return parkingLotName;
    }

    /**
     * @param parkingLotName the parkingLotName to set
     */
    public void setParkingLotName(final String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final int id) {
        this.id = id;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.userName, this.password, this.parkingLotName);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return Objects.equals(this.userName, other.userName)
                && Objects.equals(this.password, other.password)
                && Objects.equals(this.parkingLotName, other.parkingLotName);
    }

}
