/**
 * This program instantiates the properties for
 * JetSki Vehicle.
 */
package com.epam.vehicle.water;

import java.util.List;

import com.epam.vehicle.WaterVehicle;

/**
 * class name is JetSki.
 */
public class JetSki extends WaterVehicle {

    /**
     * JetSki YearBuilt float type.
     */
    private float yearBuilt;

    /**
     * JetSki persons capacity float type.
     */
    private float personMax;
    /**
     * three index.
     */
    private static final int THREE = 3;
    /**
     * four index.
     */
    private static final int FOUR = 4;
    /**
     * @param properties of JetSki.
     */
    public JetSki(final List<String> properties) {
        super(properties.get(FOUR), Float.parseFloat(properties.get(1)));
        this.yearBuilt = Float.parseFloat(properties.get(2));
        this.personMax = Float.parseFloat(properties.get(THREE));
    }

    /**
     * @return JetSki Year Built float type.
     */
    public float getYearBuilt() {
        return yearBuilt;
    }

    /**
     * @return JetSki Peronsmax float type.
     */
    public float getPersonMax() {
        return personMax;
    }

    @Override
    public final String toString() {
        return "VehicleID : " + super.getVehicleID() + "\nLength : "
                + super.getLength() + "\nYear Built: " + yearBuilt
                + "\nPerson Max: " + personMax;
    }
}
