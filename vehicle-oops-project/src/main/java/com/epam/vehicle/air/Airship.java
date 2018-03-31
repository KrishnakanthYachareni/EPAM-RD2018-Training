/**
 * This program sets the properties for Airship
 * vehicle.
 */
package com.epam.vehicle.air;

import java.util.List;

import com.epam.vehicle.AirVehicle;

/**
 * @author Krishnakanth_Yachareni & Srinivas_Chintakindhi
 */
public class Airship extends AirVehicle {
    /**
     * length float type.
     */
    private float length;
    /**
     * volume of vehicle float type.
     */
    private float volume;
    /**
     * vehicle type String.
     */
    private String type;

    /**
     * THREE INDEX.
     */
    private static final int THREE = 3;
    /**
     * FOUR INDEX.
     */
    private static final int FOUR = 4;
    /**
     * @param properties List String type.
     */
    public Airship(final List<String> properties) {
        super(properties.get(1));
        this.length = Float.parseFloat(properties.get(2));
        this.volume = Float.parseFloat(properties.get(THREE));
        this.type = properties.get(FOUR);
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @return the volume
     */
    public float getVolume() {
        return volume;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    @Override
    public final String toString() {
        return "VehicleID :\t" + super.getVehicleID() + "\nLength :\t" + length
                + "\nVoulme :\t" + volume + "\ntype :\t" + type;
    }
}
