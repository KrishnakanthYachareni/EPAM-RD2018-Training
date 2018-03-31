/**
 * This program instantiates the properties for
 * Car Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare
 */
public class Car extends LandEngineVehicle {
    /**
     * car mileage foat type.
     */
    private float mileage;
    /**
     * car model string type.
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
     * @param properties of car.
     */
    public Car(final List<String> properties) {
        super(properties.get(1), Float.parseFloat(properties.get(2)));
        this.mileage = Float.parseFloat(properties.get(THREE));
        this.model = properties.get(FOUR);
    }
    /**
     * @return car mileage float type.
     */
    public float getMileage() {
        return mileage;
    }

    /**
     * @return car model string type.
     */
    public String getModel() {
        return model;
    }

    @Override
    public final String toString() {
        return "\nCar\nVehicleID : " + super.getVehicleID()
                + "\nEngine Capacity : " + super.getEngineCapacity()
                + "\nMileage : " + mileage + "\nModel : " + model;
    }

}
