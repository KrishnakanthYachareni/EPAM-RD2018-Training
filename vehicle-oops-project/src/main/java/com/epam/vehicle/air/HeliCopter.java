/**
 * This program instantiates the properties
 * for Helicopter vehicle.ss
 */
package com.epam.vehicle.air;

import java.util.List;

import com.epam.vehicle.AirVehicle;

/**
 * @author Krishnakanth_Yachare
 */
public class HeliCopter extends AirVehicle {
    /**
     * Helicopter Maximum Height float type.
     */
    private float maxHeight;
    /**
     * Number of Blades in Helicopter int type.
     */
    private int bladesNumber;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;

    /**
     * @param properties of Helicopter.
     */
    public HeliCopter(final List<String> properties) {
        super(properties.get(1), Float.parseFloat(properties.get(2)));
        this.maxHeight = Float.parseFloat(properties.get(THREE));
        this.bladesNumber = Integer.parseInt(properties.get(FOUR));
    }

    /**
     * @return the maxHeight
     */
    public float getMaxHeight() {
        return maxHeight;
    }

    /**
     * @return the bladesNumber
     */
    public int getBladesNumber() {
        return bladesNumber;
    }

    @Override
    public final String toString() {
        return "VehicleID :\t" + super.getVehicleID() + "\nEngine Capacity :\t"
                + super.getEngineCapacity() + "\nMax Height :\t" + maxHeight
                + "\nNumber of Blades :\t" + bladesNumber;
    }
}
