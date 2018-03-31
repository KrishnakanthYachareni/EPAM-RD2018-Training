/**
 * This package has implementation of Interface segregation design principle.
 */
package com.epam.rd.solid;

/**
 * The Engine an interface has two abstract methods to control engine of the
 * vehicle.
 * @author Krishnakanth_Yachareni
 */
public interface Engine {
    /**
     * Engine start.
     */
    void engineStart();

    /**
     * Engine stop.
     */
    void engineStop();
}
