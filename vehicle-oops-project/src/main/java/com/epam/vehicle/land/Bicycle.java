/**
 * This program instantiates the properties for
 * Bicycle Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.NonEngineVehicle;

/**
 * @author Krishnakanth_Yachare
 */
public class Bicycle extends NonEngineVehicle {
    /**
     * Bicycle Weight float type.
     */
    private float weight;
    /**
     * Bicycle Model String type.
     */
    private String model;
    /**
     * Bicycle Type String type.
     */
    private String type;

    /**
     * @param properties of Bicycle.s
     */
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;
    /**
     * @param properties of Bicycle.s
     */
    public Bicycle(final List<String> properties) {
        super(Float.parseFloat(properties.get(THREE)));
        this.weight = Float.parseFloat(properties.get(1));
        this.model = properties.get(2);
        this.type = properties.get(FOUR);
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return the maxSpeed
     */
    public String getType() {
        return type;
    }

    @Override
    public final String toString() {
        return "Weight :\t" + weight + "\nModel :\t" + model + "\nMax Speed :\t"
                + super.getMaxSpeed() + "\nType :\t" + type;
    }
}
