/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.model;

import com.epam.rd.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.rd.myapp.service.ParkingLot;
import com.epam.rd.myapp.service.ParkingManager;

/**
 * The Report class simply display current occupied and empty slots in a parking
 * area.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class Report implements ParkingLot {

    /**
     * (non-Javadoc).
     * @see com.epam.rd.myapp.service.ParkingLot#doTask
     *      (com.epam.rd.myapp.service.ParkingManager)
     * @param parkingManager
     *            is object reference of ParkingManager.
     * @throws InvalidRegistrationNumberException
     *             custom exception.
     */
    public void doTask(final ParkingManager parkingManager)
            throws InvalidRegistrationNumberException {
        System.out.println(
                "Occupied Slots are: " + parkingManager.getHashSet().size());
        System.out.println(
                "Empty slots are: " + (parkingManager.getParkingCapacity()
                        - parkingManager.getHashSet().size()));
        System.out.println("Vehicles are: " + parkingManager.getHashSet());

    }

}
