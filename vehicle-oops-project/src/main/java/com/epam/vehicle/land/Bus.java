/**
 * This program instantiates the properties for
 * Bus Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class Bus extends LandEngineVehicle {
    /**
     * Bus fuel stock float type.
     */
    private float fuelStock;
    /**
     * Bus passengers capactiy int type.
     */
    private int capacity;

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
     *            of Bus.
     */
    public Bus(final List<String> properties) {
        super(properties.get(1), Float.parseFloat(properties.get(2)));
        this.fuelStock = Float.parseFloat(properties.get(THREE));
        this.capacity = Integer.parseInt(properties.get(FOUR));
    }

    /**
     * @return bus fuel stock.
     */
    public float getFuelStock() {
        return fuelStock;
    }

    /**
     * @return bus passengers capacity.
     */
    public int getCapacity() {
        return capacity;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nEngine Capacity : "
                + super.getEngineCapacity() + "\nFuelStock : " + fuelStock
                + "\nCapacity : " + capacity;
    }

}
