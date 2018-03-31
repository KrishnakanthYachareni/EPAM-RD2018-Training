/**
 * This application is example datasource for MYSQL database.
 */
package org.autopaking.model.bean;

import java.util.Objects;

/**
 * @author Krishnakanth
 *
 */
public class ParkingLotBean {

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


    /**
     * @param id
     * @param soltNumber
     * @param registrationID
     * @param parkTime
     * @param unparkTime
     * @param updatedTime
     * @param createdTime
     */
    public ParkingLotBean(final int id, final int soltNumber,
            final String registrationID, final String parkTime,
            final String unparkTime, final String updatedTime,
            final String createdTime) {
        this.id = id;
        this.soltNumber = soltNumber;
        this.registrationID = registrationID;
        this.parkTime = parkTime;
        this.unparkTime = unparkTime;
        this.updatedTime = updatedTime;
        this.createdTime = createdTime;
    }

    /**
     * @return the registrationID
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * @return the parkTime
     */
    public String getParkTime() {
        return parkTime;
    }

    /**
     * @return the unparkTime
     */
    public String getUnparkTime() {
        return unparkTime;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the soltNumber
     */
    public int getSoltNumber() {
        return soltNumber;
    }

    /**
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    @Override
    public final String toString() {
        return String.format(
                "{\"id\":\"%d\", \"registrationNumber\":\"%s\",\"slotNumber\""
                        + ":\"%d\",\"parkTime\":\"%s\",\"unparkTime\":\"%s\",}",
                id, registrationID, soltNumber, parkTime, unparkTime);
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
        final ParkingLotBean other = (ParkingLotBean) obj;
        return Objects.equals(this.id, other.id)
                && Objects.equals(this.registrationID, other.registrationID)
                && Objects.equals(this.soltNumber, other.soltNumber)
                && Objects.equals(this.parkTime, other.parkTime)
                && Objects.equals(this.unparkTime, other.unparkTime)
                && Objects.equals(this.createdTime, other.createdTime)
                && Objects.equals(this.updatedTime, other.updatedTime);
    }
}
