/**
 * This program instantiates the properties for
 * JetFighter Vehicle.
 */
package com.epam.vehicle.air;

import java.util.List;

import com.epam.vehicle.AirVehicle;

/**
 * @author Krishnakanth_Yachare
 */
public class JetFighter extends AirVehicle {
    /**
     * Jet Fighter Maximum Weight float type.
     */
    private float maxWeight;
    /**
     * JetFighter produced year float type.
     */
    private float produced;
    /**
     * JetFighter Maximum Speed float type.
     */
    private float maxSpeed;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;

    /**
     * @param properties of JetFighter.s
     */
    public JetFighter(final List<String> properties) {
        super(properties.get(THREE));
        this.maxWeight = Float.parseFloat(properties.get(1));
        this.produced = Float.parseFloat(properties.get(2));
        this.maxSpeed = Float.parseFloat(properties.get(FOUR));
    }

    /**
     * @return the maxWeight
     */
    public float getMaxWeight() {
        return maxWeight;
    }

    /**
     * @return the produced
     */
    public float getProduced() {
        return produced;
    }

    /**
     * @return the maxSpeed
     */
    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public final String toString() {
        return "VehicleID :\t" + super.getVehicleID() + "\nMax Weight :\t"
                + maxWeight + "\nProduced :\t" + produced + "\nMax Speed :\t"
                + maxSpeed;
    }
}
