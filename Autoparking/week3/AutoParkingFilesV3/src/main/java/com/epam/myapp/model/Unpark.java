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
 * The {@link Unpark} class simply unpark the vehicle(i.e, Remove vehicle number
 * from HashMap).
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class Unpark implements Command {

    /**
     * This method unpark the vehicle. (non-Javadoc).
     * @see com.epam.Command.myapp.service.ParkingLot#doTask
     *      (com.epam.rd.myapp.service.ParkingManager)
     * @param parkingManager
     *            {@link ParkingManager} object reference.
     * @throws InvalidRegistrationNumberException
     *             custom exception.
     * @throws IOException
     *             {@link IOException}
     * @throws InvalidParkingAreaException
     *             {@link InvalidParkingAreaException}
    @throws InvalidUserNameException {@link InvalidUserNameException}
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
         * checking for available slots in hash set.
         */
        if (!parkingManager.checkingEmptySlots()) {
            throw new InvalidParkingAreaException("Parking slots are empty");
        }
        System.out.println("Enter Vehicle Registration Number.");
        sc = new Scanner(System.in);
        // Read input
        vehicleNumber = sc.next().toUpperCase();
        // Validating vehicle number.
        if (validate.validate(vehicleNumber)) {
            if (!parkingManager.searchVehicle(vehicleNumber)) {
                throw new InvalidParkingAreaException(
                        vehicleNumber + " vehicle has not present");
            }
            // Unpark vehicle.
            parkingManager.removeVehicle(vehicleNumber);
            System.out.println(
                    vehicleNumber + " vehicle has successfully unparked");
        }
    }
}
