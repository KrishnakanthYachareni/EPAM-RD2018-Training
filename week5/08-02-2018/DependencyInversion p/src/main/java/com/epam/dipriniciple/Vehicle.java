/**
 * This package has simple example of Dependency Inversion Principle.
 */
package com.epam.dipriniciple;

/**
 * @author Krishnakanth_Yachareni
 */
public interface Vehicle {
    /**
     * vehicle accelerate method.
     */
    void accelerate();

    /**
     * @return vehicle fuel.
     */
    int getFuel();

    /**
     * @return vehicle speed.
     */
    int getSpeed();
}
