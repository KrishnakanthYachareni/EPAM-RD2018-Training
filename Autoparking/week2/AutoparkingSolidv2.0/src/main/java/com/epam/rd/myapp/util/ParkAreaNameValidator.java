/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.util;

import com.epam.rd.myapp.exceptions.InvalidParkingAreaException;

/**
 * @author Krishnakanth Yachareni
 *
 */
public class ParkAreaNameValidator {

    /**
     * This method checks arguments.
     * @param args
     *            string array
     * @return true if string array length not 0 and more 2.
     * @throws InvalidParkingAreaException
     *             custom exception.
     */
    public boolean argumentsCheck(final String[] args)
            throws InvalidParkingAreaException {
        if (args.length == 0) {
            throw new InvalidParkingAreaException(
                    "Parking area name should not be null.");
        } else if (args.length > 2) {
            throw new InvalidParkingAreaException("Pass only two arguments");
        }
        return true;
    }

    /**
     * @param name
     *            first command line argument as string.
     * @return true if name doesn't contain any special symbols.
     * @throws InvalidParkingAreaException
     *             custom exception.
     */
    public boolean isAreaNameValid(final String name)
            throws InvalidParkingAreaException {
        boolean bool = false;
        if (name.matches("[a-zA-Z0-9]+") && name.length() <=100) {
            bool = true;
        } else {
            throw new InvalidParkingAreaException(
                    "Parking area name should have "
                            + "only alphanumeric characters"
                            + "\nExample: EPAMParking");
        }
        return bool;
    }

    /**
     * @param cpacity
     *            is parking area capacity.
     * @return true if capacity is integer.
     * @throws InvalidParkingAreaException
     *             custom exception.
     */
    public boolean isCapacityValid(final String cpacity)
            throws InvalidParkingAreaException {
        boolean bool = false;
        if (cpacity.matches("[0-9]+")) {
            bool = true;
        } else {
            throw new InvalidParkingAreaException(
                    "Parking capacity should be positive integer");
        }
        return bool;
    }

    /**
     * @param capacity
     *            is parking area capacity.
     * @return true if capacity is in between 10 to 100.
     * @throws InvalidParkingAreaException
     *             custom exception.
     */
    public boolean isCapacityRange(final int capacity)
            throws InvalidParkingAreaException {
        boolean bool = false;
        if (capacity >= Constants.PARKING_AREA_MIN_CAPACITY
                && capacity <= Constants.PARKING_AREA_MAX_CAPACITY) {
            bool = true;
        } else {
            throw new InvalidParkingAreaException(
                    "Parking capacity should be in " + "between 10 to 100");
        }
        return bool;
    }
}
