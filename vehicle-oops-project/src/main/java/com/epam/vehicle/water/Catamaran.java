/**
 * This program instantiates the properties for
 * Catamaran.
 */
package com.epam.vehicle.water;

import java.util.List;

import com.epam.vehicle.WaterVehicle;

/**
 * @author welcome class name is Catamaran.
 */
public class Catamaran extends WaterVehicle {

    /**
     * Catamaran weight float type.
     */
    private float weight;
    /**
     * Catamaran speed float type.
     */
    private float speed;
    /**
     * Catamaran capacity float type.
     */
    private float capacity;
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
     *            of Catamaran.
     */
    public Catamaran(final List<String> properties) {
        super(properties.get(2));
        this.weight = Float.parseFloat(properties.get(1));
        this.speed = Float.parseFloat(properties.get(THREE));
        this.capacity = Float.parseFloat(properties.get(FOUR));
    }

    /**
     * @return Catamaran weight float type.
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @return Catamaran speed float type.
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @return Catamaran capacity float type.
     */
    public float getCapacity() {
        return capacity;
    }

    @Override
    public final String toString() {
        return "Weight : " + weight + "\nSpeed : " + speed + "\nCapacity : "
                + capacity + "\nVehicleID : " + super.getVehicleID();
    }
}
