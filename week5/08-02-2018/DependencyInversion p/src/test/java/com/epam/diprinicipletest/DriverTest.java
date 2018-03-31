/**
 * This package has simple example of Dependency Inversion Principle.
 */
package com.epam.diprinicipletest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.epam.dipriniciple.Driver;
import com.epam.dipriniciple.NormalCar;
import com.epam.dipriniciple.RacingCar;
import com.epam.dipriniciple.Vehicle;

/**
 * @author Krishnakanth_Yachare
 */
public class DriverTest {

    /**
     * Racing car maximum fuel capacity.
     */
    private static final int RACING_VEHICLE_MAX_FUEL_CAPACITY = 40;
    /**
     * Normal car maximum fuel capacity.
     */
    private static final int NORMAL_VEHICLE_MAX_FUEL_CAPACITY = 30;
    /**
     * Vehicle interface reference for racingCar.
     */
    private Vehicle racingCar;
    /**
     * Vehicle interface reference for normalCar.
     */
    private Vehicle normalCar;

    /**
     * @throws java.lang.Exception
     *             {@link Exception}
     */
    @Before
    public void setUp() throws Exception {
        racingCar = new RacingCar(RACING_VEHICLE_MAX_FUEL_CAPACITY);
        normalCar = new NormalCar(NORMAL_VEHICLE_MAX_FUEL_CAPACITY);
    }

    /**
     * This method tests the racing car fuel.
     */
    @Test
    public void racingCarFueltest() {
        Driver driver = new Driver(racingCar);
        driver.increaseSpeed();
        assertEquals(RACING_VEHICLE_MAX_FUEL_CAPACITY - 2, racingCar.getFuel());
    }

    /**
     * This method tests the racing car speed.
     */
    @Test
    public void racingCarSpeedtest() {
        Driver driver = new Driver(racingCar);
        driver.increaseSpeed();
        assertEquals(20, racingCar.getSpeed());
    }

    /**
     * This method tests the normal car fuel.
     */
    @Test
    public void normalCarFueltest() {
        Driver driver = new Driver(normalCar);
        driver.increaseSpeed();
        assertEquals(NORMAL_VEHICLE_MAX_FUEL_CAPACITY - 1, normalCar.getFuel());
    }

    /**
     * This method tests the normal car speed.
     */
    @Test
    public void normalCarSpeedtest() {
        Driver driver = new Driver(normalCar);
        driver.increaseSpeed();
        assertEquals(10, normalCar.getSpeed());
    }
}
