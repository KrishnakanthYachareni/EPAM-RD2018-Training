/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.service;

import java.io.IOException;

import com.epam.myapp.exceptions.InvalidParkingAreaException;
import com.epam.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.myapp.exceptions.InvalidUserNameException;

/**
 * The Command is an interface with doTask method.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public interface Command {
    /**
     * @param parkingManager
     *            {@link ParkingManager} reference.
     * @throws InvalidRegistrationNumberException
     *             {@link InvalidRegistrationNumberException}
     * @throws IOException
     *             {@link IOException}
     * @throws InvalidParkingAreaException {@link InvalidParkingAreaException}
     * @throws InvalidUserNameException {@link InvalidUserNameException}
     */
    void doTask(ParkingManager parkingManager)
            throws InvalidRegistrationNumberException, IOException,
            InvalidParkingAreaException, InvalidUserNameException;
}
