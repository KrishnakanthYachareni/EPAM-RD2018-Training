/**
 * This package has simple example of Dependency Inversion Principle.
 */
package com.epam.dipriniciple;

/**
 * @author Krishnakanth_Yachare
 */
public class Driver {
    /**
     * {@link Vehicle} interface reference.
     */
    private Vehicle vehicle;

    /**
     * @param vehicl
     *            vehicle object.
     */
    public Driver(final Vehicle vehicl) {
        this.vehicle = vehicl;
    }

    /**
     * This method can call the {@link Vehicle} interface method.
     */
    public void increaseSpeed() {
        vehicle.accelerate();
    }
}
