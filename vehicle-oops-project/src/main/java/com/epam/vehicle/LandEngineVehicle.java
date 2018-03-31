/**
 * This program sets and gets the properties for Land type Vehicles.
 */
package com.epam.vehicle;

/**
 * @author Krishnakanth_Yachare
 */
public abstract class LandEngineVehicle implements Vehicle {
    /**
     * Vehicle id.
     */
    private String vehicleID;
    /**
     * Engine capacity.
     */
    private float engineCapacity;

    /**
     * @param vehicleIdTemp
     *            string type.
     * @param engineCapacityTemp
     *            float type.
     */
    public LandEngineVehicle(final String vehicleIdTemp,
            final float engineCapacityTemp) {
        this.vehicleID = vehicleIdTemp;
        this.engineCapacity = engineCapacityTemp;
    }

    /**
     * @param vehicleIdTemp
     *            string type.
     */
    public LandEngineVehicle(final String vehicleIdTemp) {
        this.vehicleID = vehicleIdTemp;
    }

    /**
     * @param engineCapacityTemp
     *            float type.
     */
    public LandEngineVehicle(final Float engineCapacityTemp) {
        this.engineCapacity = engineCapacityTemp;
    }

    /**
     * no-arg constructor.
     */
    public LandEngineVehicle() {
    }

    /**
     * @return vehcile id string type.
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * @return engine capacity float type.
     */
    public Float getEngineCapacity() {
        return engineCapacity;
    }
}
