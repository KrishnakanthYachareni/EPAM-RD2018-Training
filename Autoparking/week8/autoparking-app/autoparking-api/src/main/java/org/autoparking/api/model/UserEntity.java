/**
 * This is Web based Auto Parking Application.
 */
package org.autoparking.api.model;

/**
 * This {@link UserEntity} POJO class it can holds the user information.
 * 
 * @author Krishnakanth_Yachare
 *
 */
public class UserEntity {

    /**
     * Admin user name.
     */
    private String userName;
    /**
     * Admin Password.
     */
    private String password;
    /**
     * Parking area name.
     */
    private String parkingLotName;

    /**
     * Default constructor.
     */
    public UserEntity() {
        // No thing to do
    }

    /**
     * @param userName admin user name.
     * @param password admin password.
     * @param parkingLotName parking area name.
     */
    public UserEntity(final String userName, final String password, final String parkingLotName) {
        this.userName = userName;
        this.password = password;
        this.parkingLotName = parkingLotName;
    }

    /**
     * @return return admin username.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName setup admin user name.
     */
    public void setUserName(final String userName) {
        this.userName = userName;
    }

    /**
     * @return return password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password set password.
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * @return String parking area name.
     */
    public String getParkingLotName() {
        return parkingLotName;
    }

    /**
     * @param parkingLotName parking lot name.
     */
    public void setParkingLotName(final String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    @Override
    public final int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((parkingLotName == null) ? 0 : parkingLotName.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        return result;
    }

    @Override
    public final boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UserEntity other = (UserEntity) obj;
        if (parkingLotName == null) {
            if (other.parkingLotName != null) {
                return false;
            }
        } else if (!parkingLotName.equals(other.parkingLotName)) {
            return false;
        }
        if (password == null) {
            if (other.password != null) {
                return false;
            }
        } else if (!password.equals(other.password)) {
            return false;
        }
        if (userName == null) {
            if (other.userName != null) {
                return false;
            }
        } else if (!userName.equals(other.userName)) {
            return false;
        }
        return true;
    }

}
