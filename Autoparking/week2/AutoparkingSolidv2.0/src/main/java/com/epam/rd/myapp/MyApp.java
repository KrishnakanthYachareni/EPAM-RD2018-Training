/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp;

import com.epam.rd.myapp.exceptions.InvalidParkingAreaException;
import com.epam.rd.myapp.model.ParkingHandler;

/**
 * The MyApp class has main method.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public final class MyApp {
    /**
     * Default Constructor.
     */
    private MyApp() {
    }

    /**
     * @param args
     *            Main method can accept two command line arguments then pass it
     *            to ParkingHandler class.
     */
    public static void main(final String[] args) {
        ParkingHandler ph = new ParkingHandler();
        try {
            ph.isValidate(args);
            ph.vehicleDriver();
        } catch (InvalidParkingAreaException e) {
            System.err.println(e.getLocalizedMessage());
        }

    }

}
