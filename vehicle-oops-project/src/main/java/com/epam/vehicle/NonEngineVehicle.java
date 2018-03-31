/**
 * This program sets and gets the properties for Non Engine Vehicles.
 */
package com.epam.vehicle;

/**
 * @author Krishnakanth_Yachare
 */
public abstract class NonEngineVehicle implements Vehicle {
    /**
     * maxspeed float type.
     */
    private float maxSpeed;

    /**
     * @param maxSpeedTemp
     *            float type.
     */
    public NonEngineVehicle(final float maxSpeedTemp) {
        this.maxSpeed = maxSpeedTemp;
    }

    /**
     * @return max speed.
     */
    public float getMaxSpeed() {
        return maxSpeed;
    }

}
