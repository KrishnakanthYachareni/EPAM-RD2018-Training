/**
 * This program sets the properties for
 * Airplane vehicle.
 */
package com.epam.vehicle.air;

import java.util.List;

import com.epam.vehicle.AirVehicle;

/**
 * @author Krishnakanth_Yachare
 */
public class Airplane extends AirVehicle {
    /**
     * maxheight float type.
     */
    private float maxHeight;
    /**
     * weight float type.
     */
    private float weight;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;

    /**
     * @param properties List string type.
     */
    public Airplane(final List<String> properties) {
        super(properties.get(2), Float.parseFloat(properties.get(1)));
        this.maxHeight = Float.parseFloat(properties.get(THREE));
        this.weight = Float.parseFloat(properties.get(FOUR));
    }

    /**
     * @return max height float type.
     */
    public float getMaxHeight() {
        return maxHeight;
    }

    /**
     * @return weight float type.
     */
    public float getWeight() {
        return weight;
    }

    @Override
    public final String toString() {
        return "VehicleID :\t" + super.getVehicleID() + "\nEngine Capacity :\t"
                + super.getEngineCapacity() + "\nMax Height :\t" + maxHeight
                + "\nWeight :\t" + weight;
    }
}
