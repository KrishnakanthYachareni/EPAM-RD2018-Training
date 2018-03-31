/**
 * This program instantiates the properties for
 * Van Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class Van extends LandEngineVehicle {
    /**
     * Van speed float type.
     */
    private float speed;
    /**
     * Van capacity float type.
     */
    private float capacity;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;
    /**
     * @param properties of Van.
     */
    public Van(final List<String> properties) {
        super(properties.get(FOUR), Float.parseFloat(properties.get(2)));
        this.speed = Float.parseFloat(properties.get(1));
        this.capacity = Float.parseFloat(properties.get(THREE));
    }

    /**
     * @return Van speed float type.
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @return Van capacity float type.
     */
    public float getCapacity() {
        return capacity;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nEngine Capacity : "
                + super.getEngineCapacity() + "\nSpeed : " + speed
                + "\nCapacity : " + capacity;
    }

}
