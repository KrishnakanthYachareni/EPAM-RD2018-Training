/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.service;

import com.epam.rd.myapp.exceptions.InvalidRegistrationNumberException;

/**
 * The ParkingLot is an interface with doTask method.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public interface ParkingLot {
    /**
     * @param parkingManager
     *            ParkingManager class type.
     * @throws InvalidRegistrationNumberException custom exception
     */
    void doTask(ParkingManager parkingManager)
            throws InvalidRegistrationNumberException;
}
