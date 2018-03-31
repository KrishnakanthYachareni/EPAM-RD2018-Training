/**
 * This program instantiates the properties for
 * Scooter Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class Scooter extends LandEngineVehicle {
    /**
     * Scooter mileage float type.
     */
    private float mileage;
    /**
     * Scooter type string type.
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
     * @param properties of Scooter.
     */
    public Scooter(final List<String> properties) {
        super(properties.get(FOUR), Float.parseFloat(properties.get(THREE)));
        this.mileage = Float.parseFloat(properties.get(2));
        this.type = properties.get(1);
    }

    /**
     * @return scooter mileage float type.
     */
    public float getMileage() {
        return mileage;
    }

    /**
     * @return scooter type string type.
     */
    public String getType() {
        return type;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nEngine Capacity : "
                + super.getEngineCapacity() + "\nMileage : " + mileage
                + "\nType : " + type;
    }

}
