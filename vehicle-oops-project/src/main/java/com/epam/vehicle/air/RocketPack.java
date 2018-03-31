/**
 * This program instantiates the properties for
 * RocketPack.
 */
package com.epam.vehicle.air;

import java.util.List;

import com.epam.vehicle.AirVehicle;

/**
 * @author Krishnakanth_Yachareni & Srinivas_Chintakindhis
 */
public class RocketPack extends AirVehicle {
    /**
     * RocketPack endurance float type.
     */
    private float endurance;
    /**
     * RocketPack gross weight float type.
     */
    private float grossWeight;
    /**
     * RocketPack fuel stock float type.
     */
    private float fuelStock;
    /**
     * RocketPack Maximum Speed.
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
     * @param properties of RocketPack.
     */
    public RocketPack(final List<String> properties) {
        this.endurance = Float.parseFloat(properties.get(1));
        this.grossWeight = Float.parseFloat(properties.get(2));
        this.fuelStock = Float.parseFloat(properties.get(THREE));
        this.maxSpeed = Float.parseFloat(properties.get(FOUR));
    }

    /**
     * @return the endurance
     */
    public float getEndurance() {
        return endurance;
    }

    /**
     * @return the grossWeight
     */
    public float getGrossWeight() {
        return grossWeight;
    }

    /**
     * @return the fuelStock
     */
    public float getFuelStock() {
        return fuelStock;
    }

    /**
     * @return the maxSpeed
     */
    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public final String toString() {
        return "Endurance :\t" + endurance + "\nGross Weight :\t" + grossWeight
                + "\nFuel Stock :\t" + fuelStock + "\nMax Speed :\t" + maxSpeed;
    }
}
