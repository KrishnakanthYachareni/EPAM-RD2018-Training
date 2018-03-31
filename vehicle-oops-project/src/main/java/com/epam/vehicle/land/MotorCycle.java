/**
 * This program instantiates the properties for
 * MotorCycle.
 */
package com.epam.vehicle.land;

import java.util.List;

import com.epam.vehicle.LandEngineVehicle;

/**
 * @author Krishnakanth_Yachare & Srinivas_Chintakindhi
 */
public class MotorCycle extends LandEngineVehicle {
    /**
     * MotorCycle color String type.
     */
    private String color;
    /**
     * MotorCycle bodystyle string type.
     */
    private String bodyStyle;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;
    /**
     * @param properties of motorcycle.
     */
    public MotorCycle(final List<String> properties) {
        super(properties.get(THREE), Float.parseFloat(properties.get(FOUR)));
        this.color = properties.get(1);
        this.bodyStyle = properties.get(2);
    }

    /**
     * @return MotorCycle color string type.
     */
    public String getColor() {
        return color;
    }

    /**
     * @return MotorCycle BodyStyle.ss
     */
    public String getBodyStyle() {
        return bodyStyle;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nEngine Capacity : "
                + super.getEngineCapacity() + "\nColor : " + color
                + "\nBody Style : " + bodyStyle;
    }

}
