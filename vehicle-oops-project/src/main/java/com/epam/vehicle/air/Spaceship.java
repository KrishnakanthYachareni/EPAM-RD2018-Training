/**
 * This program instantiates the properties for
 * Spaceship Vehicle.
 */
package com.epam.vehicle.air;

import java.util.List;

import com.epam.vehicle.AirVehicle;

/**
 * @author Krishnakanth_Yachare
 */
public class Spaceship extends AirVehicle {
    /**
     * Spaceship Weight float type.
     */
    private float weight;
    /**
     * Spaceship fuelstock float type.
     */
    private float fuelStock;
    /**
     * SpaceShip length float type.
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
     * @param properties of Spaceship.
     */
    public Spaceship(final List<String> properties) {
        super(properties.get(1));
        this.weight = Float.parseFloat(properties.get(2));
        this.fuelStock = Float.parseFloat(properties.get(THREE));
        this.length = Float.parseFloat(properties.get(FOUR));
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @return the fuelStock
     */
    public float getFuelStock() {
        return fuelStock;
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    @Override
    public final String toString() {
        return "VehicleID :\t" + super.getVehicleID() + "\nWeight :\t" + weight
                + "\nFuel Stock :\t" + fuelStock + "\nLength :\t" + length;
    }
}
