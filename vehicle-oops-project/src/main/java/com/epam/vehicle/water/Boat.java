/**
 * This program instantiates the properties for
 * Boat Vehicle.
 */
package com.epam.vehicle.water;

import java.util.List;

import com.epam.vehicle.WaterVehicle;

/**
 * class name is Boat.
 */
public class Boat extends WaterVehicle {

    /**
     * Boat material string type.
     */
    private String material;
    /**
     * Boat buoyancy float type.
     */
    private float buoyancy;
    /**
     * Boat type string type.
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
     * @param properties
     *            of Boat.
     */
    public Boat(final List<String> properties) {
        super(Float.parseFloat(properties.get(FOUR)));
        this.material = properties.get(1);
        this.buoyancy = Float.parseFloat(properties.get(2));
        this.type = properties.get(THREE);
    }

    /**
     * @return Boat Material string type.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @return Boat buoyancy float type.
     */
    public float getBuoyancy() {
        return buoyancy;
    }

    /**
     * @return Boat type string type.
     */
    public String getType() {
        return type;
    }

    @Override
    public final String toString() {
        return "Length : " + super.getLength() + "\nMaterial : " + material
                + "\nBuoyancy : " + buoyancy + "\nType : " + type;
    }
}
