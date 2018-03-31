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
 * The Park class simply validates vehicle registration number, then add to hash
 * set.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class Park implements ParkingLot {
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
        if (vm.checkingOccupiedSlots()) {
            System.out.println("Enter Vehicle Registration Number.");
            vehicleNumber = sc.next().toLowerCase();
            /*
             * Validating vehicle number and add vehicle to hashset. *
             */
            if (validate.isRegNumValid(vehicleNumber)
                    && validate.isRegHasTwoDigits(vehicleNumber)) {
                if (!vm.searchVehicle(vehicleNumber)) {
                    vm.getHashSet().add(vehicleNumber);
                    System.out.println(
                            vehicleNumber + " vehicle has successfully parked");
                } else {
                    System.out.println(
                            vehicleNumber + " vehicle has already present");
                }
            }
        } else {
            System.out.println("Parking slots are full.");
        }
    }

}
