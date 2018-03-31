/**
 * This program instantiates the properties for
 * QuadBike Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class QuadBike extends LandEngineVehicle {
    /**
     * QuadBike speed float type.
     */
    private float speed;
    /**
     * QuadBike model string type.
     */
    private String model;
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
     *            of QuadBike.
     */
    public QuadBike(final List<String> properties) {
        super(properties.get(THREE), Float.parseFloat(properties.get(FOUR)));
        this.speed = Float.parseFloat(properties.get(1));
        this.model = properties.get(2);
    }

    /**
     * @return QuadBike speed float type.
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @return QuadBikeModel String type.
     */
    public String getModel() {
        return model;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nEngine Capacity : "
                + super.getEngineCapacity() + "\nSpeed : " + speed
                + "\nModel : " + model;
    }

}
