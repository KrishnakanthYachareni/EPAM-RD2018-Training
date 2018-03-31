/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.model;

import java.io.IOException;
import java.util.Scanner;

import com.epam.myapp.exceptions.InvalidParkingAreaException;
import com.epam.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.myapp.exceptions.InvalidUserNameException;
import com.epam.myapp.service.Command;
import com.epam.myapp.service.ParkingManager;
import com.epam.myapp.validators.RegNumberValidator;
import com.epam.myapp.validators.Validator;

/**
 * The {@link Park} class simply validates vehicle registration number, then add
 * to vehicle number to HashMap.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class Park implements Command {

    /**
     * This method the park the vehicle. (non-Javadoc).
     * @see com.epam.Command.myapp.service.ParkingLot#doTask
     *      (com.epam.rd.myapp.service.ParkingManager)
     * @param parkingManager
     *            is object reference of ParkingManager.
     * @throws InvalidRegistrationNumberException
     *             custom exception.
     * @throws IOException
     *             {@link IOException}
     * @throws InvalidParkingAreaException
     *             {@link InvalidParkingAreaException}
     * @throws InvalidUserNameException {@link InvalidUserNameException}
     */
    @SuppressWarnings("resource")
    public void doTask(final ParkingManager parkingManager)
            throws InvalidRegistrationNumberException, IOException,
            InvalidParkingAreaException, InvalidUserNameException {

        // Registration number validation class instance.
        Validator validate = new RegNumberValidator();

        String vehicleNumber = null;
        Scanner sc;
        /*
         * checking for available slots.
         */
        if (!parkingManager.checkingOccupiedSlots()) {
            throw new InvalidParkingAreaException("Parking slots are full");
        }
        System.out.println("Enter Vehicle Registration Number.");
        sc = new Scanner(System.in);
        vehicleNumber = sc.next().toUpperCase();
        /*
         * Validating vehicle number and then park the vehicle.
         */
        if (validate.validate(vehicleNumber)) {
            if (parkingManager.searchVehicle(vehicleNumber)) {
                throw new InvalidParkingAreaException(
                        vehicleNumber + " vehicle has already present");
            }
            // Park the vehicle.
            parkingManager.addVehicle(vehicleNumber);
            System.out.println(
                    vehicleNumber + " vehicle has successfully parked");
        }
    }
}
