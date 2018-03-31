/**
 * This program instantiates the properties for
 * Water Vehicle.
 */
package com.epam.vehicle.water;

import java.util.List;

import com.epam.vehicle.WaterVehicle;

/**
 * classname is Ship.
 */
public class Ship extends WaterVehicle {

    /**
     * Ship weight float type.
     */
    private float weight;
    /**
     * Ship beam float type.
     */
    private float beam;
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
     *            for Ship.
     */
    public Ship(final List<String> properties) {
        super(properties.get(1), Float.parseFloat(properties.get(THREE)));
        this.weight = Float.parseFloat(properties.get(2));
        this.beam = Float.parseFloat(properties.get(FOUR));
    }

    /**
     * @return for Ship weight float type.
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @return Ship Beam float type.
     */
    public float getBeam() {
        return beam;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nLength : "
                + super.getLength() + "\nWeight : " + weight + "\nBeam : "
                + beam;
    }
}
