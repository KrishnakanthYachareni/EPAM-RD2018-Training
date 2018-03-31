/**
* This program instantiates the properties for
* Barge vehicle.
*/
package com.epam.vehicle.water;

import java.util.List;

import com.epam.vehicle.WaterVehicle;

/**
 * classname Barge.
 */
public class Barge extends WaterVehicle {

    /**
     * barge capacity float type.
     */
    private float capacity;
    /**
     * Barge weight float capacity.
     */
    private float weight;
    /**
     * Barge type String type.
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
     *            of Barge.
     */
    public Barge(final List<String> properties) {
        super(Float.parseFloat(properties.get(FOUR)));
        this.type = properties.get(1);
        this.capacity = Float.parseFloat(properties.get(2));
        this.weight = Float.parseFloat(properties.get(THREE));
    }

    /**
     * @return Barge type String type.
     */
    public String getType() {
        return type;
    }

    /**
     * @return Barge capacity float type.
     */
    public float getCapacity() {
        return capacity;
    }

    /**
     * @return Barge Weight float type.
     */
    public float getWeight() {
        return weight;
    }

    @Override
    public final String toString() {
        return "Length : " + super.getLength() + "\nType : " + type
                + "\nWeight : " + weight + "\nCapacity: " + capacity;
    }
}
