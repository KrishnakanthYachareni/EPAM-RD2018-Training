/**
 * This program instantiates the properties for
 * Segway Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class Segway extends LandEngineVehicle {
    /**
     * Segway distance per charge float type.
     */
    private float distancePerCharge;
    /**
     * segway charging time float type.
     */
    private float chargingTime;
    /**
     * segway weight float type.
     */
    private float weight;
    /**
     * segway maximum speed float type.
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
     * @param properties of segway.
     */
    public Segway(final List<String> properties) {
        this.distancePerCharge = Float.parseFloat(properties.get(1));
        this.chargingTime = Float.parseFloat(properties.get(2));
        this.weight = Float.parseFloat(properties.get(THREE));
        this.maxSpeed = Float.parseFloat(properties.get(FOUR));

    }

    /**
     * @return segway distance per charge float type.
     */
    public float getDistancePerCharge() {
        return distancePerCharge;
    }

    /**
     * @return segway charging time float type.
     */
    public float getChargingTime() {
        return chargingTime;
    }

    /**
     * @return segway weight float type.
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @return Segway Maximum speed float type.s
     */
    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public final String toString() {
        return "Distance Per Charge : " + distancePerCharge
                + "\nCharging Time : " + chargingTime + "\nWeight : " + weight
                + "\nMaximum Speed : " + maxSpeed;
    }

}
