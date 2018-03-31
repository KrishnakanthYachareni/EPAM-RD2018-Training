/**
 * This program instantiates the properties for
 * Metro Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class Metro extends LandEngineVehicle {
    /**
     * Metro speed float type.
     */
    private float speed;
    /**
     * metro length float type.
     */
    private float length;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;
    /**
     * @param properties of metro.
     */
    public Metro(final List<String> properties) {
        super(properties.get(FOUR), Float.parseFloat(properties.get(1)));
        this.speed = Float.parseFloat(properties.get(2));
        this.length = Float.parseFloat(properties.get(THREE));
    }

    /**
     * @return metro speed float type.
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @return metro length float type.
     */
    public float getLength() {
        return length;
    }

    @Override
    public final String toString() {
        return "Vehicle ID : " + super.getVehicleID() + "\nEngine Capacity : "
                + super.getEngineCapacity() + "\nLength : " + length
                + "\nSpeed " + speed;
    }

}
