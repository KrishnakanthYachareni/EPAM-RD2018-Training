/**
 * This program instantiates the properties
 * for Tank Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class Tank extends LandEngineVehicle {
    /**
     * Tank speed float type.
     */
    private float speed;
    /**
     * Tank weight float type.
     */
    private float weight;
    /**
     * Tank crew int type.
     */
    private int crew;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;
    /**
     * @param properties of Tank.
     */
    public Tank(final List<String> properties) {
        super(Float.parseFloat(properties.get(THREE)));
        this.speed = Float.parseFloat(properties.get(1));
        this.weight = Float.parseFloat(properties.get(2));
        this.crew = Integer.parseInt(properties.get(FOUR));

    }

    /**
     * @return Tank speed float type.
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @return Tank Weight float type.
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @return Tank crew int type.
     */
    public int getCrew() {
        return crew;
    }

    @Override
    public final String toString() {
        return "Speed : " + speed + "\nEngine Capacity : "
                + super.getEngineCapacity() + "\nWeight : " + weight
                + "\nCrew: " + crew;
    }

}
