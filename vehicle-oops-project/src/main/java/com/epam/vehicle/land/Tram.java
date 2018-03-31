/**
 * This program instantiates the properties for
 * Tram Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class Tram extends LandEngineVehicle {
    /**
     * Tram length float type.
     */
    private float length;
    /**
     * Tram type string type.
     */
    private String type;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;
    /**
     * @param properties
     *            of Tram.
     */
    public Tram(final List<String> properties) {
        super(properties.get(THREE), Float.parseFloat(properties.get(2)));
        this.length = Float.parseFloat(properties.get(1));
        this.type = properties.get(FOUR);
    }

    /**
     * @return Tram length float type.
     */
    public float getLength() {
        return length;
    }

    /**
     * @return Tram type string type.
     */
    public String getType() {
        return type;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nEngine Capacity : "
                + super.getEngineCapacity() + "\nLength : " + length
                + "\nType : " + type;
    }

}
