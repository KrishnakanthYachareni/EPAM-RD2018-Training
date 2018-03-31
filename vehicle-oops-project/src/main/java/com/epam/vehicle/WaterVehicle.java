/**
 * This program sets and gets the properties for Water Vehicle types.
 */
package com.epam.vehicle;

/**
 * @author Krishnakanth_Yachareni & Srinivas_Chintakindhi
 */
public abstract class WaterVehicle implements Vehicle {
    /**
     * vehicle id.
     */
    private String vehicleID;
    /**
     * length of vehicle.
     */
    private float length;

    /**
     * @param vehicleIdTemp
     *            string type.
     * @param lengthTemp
     *            of vehicle float type.
     */
    public WaterVehicle(final String vehicleIdTemp, final float lengthTemp) {
        this.vehicleID = vehicleIdTemp;
        this.length = lengthTemp;
    }

    /**
     * @param lengthTemp
     *            of vehicle float type.
     */
    public WaterVehicle(final float lengthTemp) {
        this.length = lengthTemp;
    }

    /**
     * @param vehicleIdTemp
     *            String type.ss
     */
    public WaterVehicle(final String vehicleIdTemp) {
        this.vehicleID = vehicleIdTemp;
    }

    /**
     * @return the vehicleID
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

}
