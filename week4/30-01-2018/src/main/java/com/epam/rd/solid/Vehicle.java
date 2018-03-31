/**
 * This package has implementation of Interface segregation design principle.
 */
package com.epam.rd.solid;

/**
 * @author Krishnakanth Yachareni.
 */
public class Vehicle implements Engine {
    /**
     * Vehicle type.
     */
    private String vehicle = "";
    /**
     * Vehicle status.
     */
    private String vehicleStatus = "Engine is stoped";

    /**
     * @param vehicl
     *            String.
     */
    public Vehicle(final String vehicl) {
        this.vehicle = vehicl;
    }

    /**
     * This method start the engine.
     * @see com.epam.rd.solid.Engine#engineStart()
     */
    public void engineStart() {
        this.vehicleStatus = vehicle + " Engine is Running";
    }

    /**
     * This method stop the engine.
     * @see com.epam.rd.solid.Engine#engineStop()
     */
    public void engineStop() {
        this.vehicleStatus = vehicle + " Engine is stoped";
    }

    /**
     * @return the vehicle
     */
    public final String getVehicle() {
        return vehicle;
    }

    /**
     * @return the vehicleStatus
     */
    public final String getVehicleStatus() {
        return vehicleStatus;
    }
}
