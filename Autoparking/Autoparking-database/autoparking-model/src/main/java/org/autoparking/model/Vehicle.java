/**
 * This application is example datasource for MYSQL database.
 */
package org.autoparking.model;

import java.util.Objects;

/**
 * @author Krishnakanth
 *
 */
public class Vehicle {

    /**
     * Unique id for Vehicle to identify the information in database.
     */
    private int id;

    /**
     * Parking Slot Number.
     */
    private int soltNumber;

    /**
     * Vehicle Registration Number.
     */
    private String registrationID;

    /**
     * Vehicle Parking Time.
     */
    private String parkTime;

    /**
     * Vehicle Unparking Time.
     */
    private String unparkTime;

    /**
     * Autoparking transcation table records updatation time.
     */
    private String updatedTime;

    /**
     * Autoparking transcation table records creatrion time.
     */
    private String createdTime;

    public Vehicle() {
        // Do Nothing.
    }

    /**
     * @param id
     * @param soltNumber
     * @param registrationID
     * @param parkTime
     * @param unparkTime
     * @param updatedTime
     * @param createdTime
     */
    public Vehicle(final int id, final int soltNumber,
            final String registrationID, final String parkTime,
            final String unparkTime) {
        this.id = id;
        this.soltNumber = soltNumber;
        this.registrationID = registrationID;
        this.parkTime = parkTime;
        this.unparkTime = unparkTime;
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

    /**
     * @return the soltNumber
     */
    public int getSoltNumber() {
        return soltNumber;
    }

    /**
     * @param soltNumber
     *            the soltNumber to set
     */
    public void setSoltNumber(int soltNumber) {
        this.soltNumber = soltNumber;
    }

    /**
     * @return the registrationID
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * @param registrationID
     *            the registrationID to set
     */
    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    /**
     * @return the parkTime
     */
    public String getParkTime() {
        return parkTime;
    }

    /**
     * @param parkTime
     *            the parkTime to set
     */
    public void setParkTime(String parkTime) {
        this.parkTime = parkTime;
    }

    /**
     * @return the unparkTime
     */
    public String getUnparkTime() {
        return unparkTime;
    }

    /**
     * @param unparkTime
     *            the unparkTime to set
     */
    public void setUnparkTime(String unparkTime) {
        this.unparkTime = unparkTime;
    }

    /**
     * @return the updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * @param updatedTime
     *            the updatedTime to set
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * @return the createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     *            the createdTime to set
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.id, this.parkTime, this.registrationID,
                this.soltNumber, this.unparkTime, this.updatedTime,
                this.createdTime);
    }

    @Override
    public final boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        return Objects.equals(this.id, other.id)
                && Objects.equals(this.registrationID, other.registrationID)
                && Objects.equals(this.soltNumber, other.soltNumber)
                && Objects.equals(this.parkTime, other.parkTime)
                && Objects.equals(this.unparkTime, other.unparkTime)
                && Objects.equals(this.createdTime, other.createdTime)
                && Objects.equals(this.updatedTime, other.updatedTime);
    }
}
