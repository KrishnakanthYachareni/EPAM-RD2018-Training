/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.model;

import java.util.Scanner;

import com.epam.rd.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.rd.myapp.service.ParkingLot;
import com.epam.rd.myapp.service.ParkingManager;
import com.epam.rd.myapp.util.RegNumberValidator;

/**
 * The Unpark class simply validates vehicle registration number, then remove
 * from hashset.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class Unpark implements ParkingLot {
    /**
     * (non-Javadoc).
     * @see com.epam.rd.myapp.service.ParkingLot#doTask
     *      (com.epam.rd.myapp.service.ParkingManager)
     * @param vm
     *            is object reference of ParkingManager.
     * @throws InvalidRegistrationNumberException
     *             custom exception.
     */
    public void doTask(final ParkingManager vm)
            throws InvalidRegistrationNumberException {

        RegNumberValidator validate = new RegNumberValidator();
        Scanner sc = new Scanner(System.in);
        String vehicleNumber = null;
        /*
         * checking for available slots in hash set.
         */
        if (vm.checkingEmptySlots()) {
            System.out.println("Enter Vehicle Registration Number.");
            vehicleNumber = sc.next().toLowerCase();
            // Validating vehicle number.
            if (validate.isRegNumValid(vehicleNumber)
                    && validate.isRegHasTwoDigits(vehicleNumber)) {
                if (vm.searchVehicle(vehicleNumber)) {
                    // removing vehicle number from hash set.
                    vm.getHashSet().remove(vehicleNumber);
                    System.out.println(vehicleNumber
                            + " vehicle has successfully unparked");
                } else {
                    System.out.println(
                            vehicleNumber + " vehicle has not present");
                }
            }
        } else {
            System.out.println("Parking slots are empty");
        }
    }

}
