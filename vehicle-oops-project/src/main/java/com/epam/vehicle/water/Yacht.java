/**
 * This program instantiates the properties for
 * Yacht Vehicle.
 */
package com.epam.vehicle.water;

import java.util.List;

import com.epam.vehicle.WaterVehicle;

/**
 * classname is Yacht.
 */
public class Yacht extends WaterVehicle {

    /**
     * Yacht type string type.
     */
    private String type;
    /**
     * Yacht speed float type.
     */
    private float speed;
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
     *            of Yacht.
     */
    public Yacht(final List<String> properties) {
        super(properties.get(1), Float.parseFloat(properties.get(FOUR)));
        this.speed = Float.parseFloat(properties.get(THREE));
        this.type = properties.get(2);
    }

    /**
     * @return Yacht speed float type.
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @return Yacht type string type.
     */
    public String getType() {
        return type;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nLength : "
                + super.getLength() + "\nSpeed : " + speed + "\nType : " + type;
    }
}
