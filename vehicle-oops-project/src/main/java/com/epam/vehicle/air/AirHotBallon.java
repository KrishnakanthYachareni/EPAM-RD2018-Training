/**
 * This program sets the properties
 * for AirHotBallon Vehicle.
 */
package com.epam.vehicle.air;

import java.util.List;

import com.epam.vehicle.AirVehicle;

/**
 * @author Krishnakanth_Yachare
 */
public class AirHotBallon extends AirVehicle {
    /**
     * maxHeight float type.
     */
    private float maxHeight;
    /**
     * duration float type.
     */
    private float duration;
    /**
     * THREE INDEX.
     */
    private static final int THREE = 3;
    /**
     * FOUR INDEX.
     */
    private static final int FOUR = 3;
    /**
     * @param properties List String type.
     */
    public AirHotBallon(final List<String> properties) {
        super(properties.get(2), Float.parseFloat(properties.get(1)));
        this.maxHeight = Float.parseFloat(properties.get(THREE));
        this.duration = Float.parseFloat(properties.get(FOUR));
    }

    /**
     * @return the maxHeight
     */
    public float getMaxHeight() {
        return maxHeight;
    }

    /**
     * @return the duration
     */
    public float getDuration() {
        return duration;
    }

    @Override
    public final String toString() {
        return "VehicleID :\t" + super.getVehicleID() + "\nEngine Capacity :\t"
                + super.getEngineCapacity() + "\nMax Height :\t" + maxHeight
                + "\nDuration :\t" + duration;
    }

}
