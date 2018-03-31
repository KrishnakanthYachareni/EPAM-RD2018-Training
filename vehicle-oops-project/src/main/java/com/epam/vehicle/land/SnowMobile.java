/**
 * This program instantiates the properties for
 * SnowMobile.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class SnowMobile extends LandEngineVehicle {
    /**
     * SnowMobile Mileage float type.
     */
    private float mileage;
    /**
     * SnowMobile model string type.
     */
    private String model;
    /**
     * SnowMobile speed float type.
     */
    private float speed;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;

    /**
     * @param properties of SnowMobile.
     */
    public SnowMobile(final List<String> properties) {
        super(properties.get(2));
        this.speed = Float.parseFloat(properties.get(1));
        this.mileage = Float.parseFloat(properties.get(THREE));
        this.model = properties.get(FOUR);
    }

    /**
     * @return SnowMobile Mileage float type.
     */
    public float getMileage() {
        return mileage;
    }

    /**
     * @return SnowMobile Model String type.
     */
    public String getModel() {
        return model;
    }

    /**
     * @return SnowMobile speed float type.
     */
    public float getSpeed() {
        return speed;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nSpeed : " + speed
                + "\nMileage : " + mileage + "\nModel : " + model;
    }

};
