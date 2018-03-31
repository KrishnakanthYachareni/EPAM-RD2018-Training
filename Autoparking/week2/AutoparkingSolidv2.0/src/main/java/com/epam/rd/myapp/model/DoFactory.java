/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.model;

import com.epam.rd.myapp.exceptions.InvalidCommandException;
import com.epam.rd.myapp.service.ParkingLot;

/**
 * The DoFactory class checks the string and return their respective object.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class DoFactory {
    /**
     * @param taskType
     *            is a command.
     * @return returns repective object based on tested condition.
     * @throws InvalidCommandException
     *             custom exception.
     */
    public ParkingLot getTask(final String taskType)
            throws InvalidCommandException {
        if (taskType == null) {
            return null;
        }
        if (taskType.equalsIgnoreCase("P")) {
            return new Park();

        } else if (taskType.equalsIgnoreCase("U")) {
            return new Unpark();

        } else if (taskType.equalsIgnoreCase("r")) {
            return new Report();
        } else if (taskType.equalsIgnoreCase("E")) {
            return null;
        } else {
            throw new InvalidCommandException("Invalid command");
        }
    }
}
