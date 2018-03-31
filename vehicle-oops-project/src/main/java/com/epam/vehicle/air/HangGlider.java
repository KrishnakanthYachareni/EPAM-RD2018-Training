/**
 * This program instantiates the properties for HangGlider Vehicle.
 */
package com.epam.vehicle.air;

import java.util.List;

import com.epam.vehicle.AirVehicle;

/**
 * @author Krishnakanth_Yachareni & Srinivas_Chintakindhi
 */
public class HangGlider extends AirVehicle {
    /**
     * length of HangGlider float type.
     */
    private float length;
    /**
     * HangGlider glide ratio float type.
     */
    private float glideRatio;
    /**
     * Hangglider max speed float type.
     */
    private float maxSpeed;
    /**
     * HangGlider model String type.
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
     *            of HangGlider List String type.
     */
    public HangGlider(final List<String> properties) {
        this.length = Float.parseFloat(properties.get(1));
        this.glideRatio = Float.parseFloat(properties.get(2));
        this.maxSpeed = Float.parseFloat(properties.get(THREE));
        this.model = properties.get(FOUR);
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @return the glideRatio
     */
    public float getGlideRatio() {
        return glideRatio;
    }

    /**
     * @return the maxSpeed
     */
    public float getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    @Override
    public final String toString() {
        return "Length :\t" + length + "\nGlide Ratio :\t" + glideRatio
                + "\nMax Speed :\t" + maxSpeed + "\nModel :\t" + model;
    }
}
