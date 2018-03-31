/**
 * This program instantiates the properties for
 * Train Vehicle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class Train extends LandEngineVehicle {
    /**
     * Train length float type.
     */
    private float length;
    /**
     * Train Maximum speed float type.
     */
    private float maxSpeed;
    /**
     * Train type string type.
     */
    private String type;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;

    /**
     * @param properties of Train.
     */
    public Train(final List<String> properties) {
        super(properties.get(1));
        this.length = Float.parseFloat(properties.get(2));
        this.maxSpeed = Float.parseFloat(properties.get(THREE));
        this.type = properties.get(FOUR);
    }

    /**
     * @return Train length float type.
     */
    public float getLength() {
        return length;
    }

    /**
     * @return Train speed float type.
     */
    public float getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @return Train type string type.
     */
    public String getType() {
        return type;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nLength : " + length
                + "\nMaximum Speed : " + maxSpeed + "\nType : " + type;
    }

}
