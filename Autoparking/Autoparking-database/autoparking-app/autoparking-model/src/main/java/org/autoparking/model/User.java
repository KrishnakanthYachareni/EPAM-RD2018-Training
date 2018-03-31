/**
 * 
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

    public User(String userName, String password, String parkingLotName,
            int id) {
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
     * @param userName
     *            the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the parkingLotName
     */
    public String getParkingLotName() {
        return parkingLotName;
    }

    /**
     * @param parkingLotName
     *            the parkingLotName to set
     */
    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
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
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        return Objects.equals(this.userName, other.userName)
                && Objects.equals(this.password, other.password)
                && Objects.equals(this.parkingLotName, other.parkingLotName);
    }

}
