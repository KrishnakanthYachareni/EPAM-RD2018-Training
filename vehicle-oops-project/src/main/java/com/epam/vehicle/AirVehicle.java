/**
 * this program gets and sets the
 * properties for air type vehicles.
 */
package com.epam.vehicle;

/**
 * @author Krishnakanth_Yachare
 */
public abstract class AirVehicle implements Vehicle {
    /**
     * vehicle id.
     */
    private String vehicleID;
    /**
     * carrying capacity.
     */
    private float carryingCapacity;

    /**
     * @param vehicleIdTemp string type.
     * @param carryingCapacityTemp float.
     */
    public AirVehicle(final String vehicleIdTemp,
            final float carryingCapacityTemp) {
        this.vehicleID = vehicleIdTemp;
        this.carryingCapacity = carryingCapacityTemp;
    }

    /**
     * @param vehicleIdTemp string type.
     */
    public AirVehicle(final String vehicleIdTemp) {
        this.vehicleID = vehicleIdTemp;
    }

    /**
     * no-arg constructor.
     */
    public AirVehicle() {
    }

    /**
     * @return vechicle id string type.
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * @return engine capacity float type.
     */
    public float getEngineCapacity() {
        return carryingCapacity;
    }

}

