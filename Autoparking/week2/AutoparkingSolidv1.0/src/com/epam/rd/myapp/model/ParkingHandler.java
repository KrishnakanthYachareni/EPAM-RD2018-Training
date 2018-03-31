/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.model;

import java.util.Scanner;

import com.epam.rd.myapp.exceptions.InvalidCommandException;
import com.epam.rd.myapp.exceptions.InvalidParkingAreaException;
import com.epam.rd.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.rd.myapp.service.ParkingLot;
import com.epam.rd.myapp.service.ParkingManager;
import com.epam.rd.myapp.util.Constants;
import com.epam.rd.myapp.util.Menu;
import com.epam.rd.myapp.util.ParkAreaNameValidator;

/**
 * The VehicleDriver class is validates the arguments first then it can accept
 * commands to park & unpark the car It can call respective class to do an
 * operation.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class ParkingHandler {
    /**
     * ParkingManager object reference.
     */
    private ParkingManager manager;

    /**
     * This method validate parking area name & parking capacity by calling
     * validateParkingNameCapacity(String[]) of Validater class. and assign
     * parking name and parking area to Vehicle Manager methods. after that will
     * call vehicleDriver() .
     * @param arr
     *            string array.
     * @throws InvalidParkingAreaException
     *             custom Exception.
     */
    public void isValidate(final String[] arr)
            throws InvalidParkingAreaException {
        String areaName = "";
        int capacity = 0;

        ParkAreaNameValidator nameV = new ParkAreaNameValidator();
        nameV.argumentsCheck(arr);
        if (arr.length == 1 && nameV.isAreaNameValid(arr[0])) {
            areaName = arr[0];
            capacity = Constants.PARKING_AREA_DEFAULT_CAPACITY;
        }
        if (arr.length == 2 && nameV.isAreaNameValid(arr[0])
                && nameV.isCapacityValid(arr[1])) {

            int cap = Integer.parseInt(arr[1]);
            if (nameV.isCapacityRange(cap)) {

                areaName = arr[0];
                capacity = cap;
            }
        }
        manager = new ParkingManager(areaName, capacity);
    }

    /**
     * This method accept commands and then call respective methods.
     */
    public void vehicleDriver() {
        Scanner sc = new Scanner(System.in);
        // Menu class object
        Menu ob = new Menu();
        DoFactory doF = new DoFactory();
        try {
            while (true) {
                // calling display Menu.
                ob.menu();
                try {
                    ParkingLot pl = doF.getTask(sc.next());
                    if (pl == null) {
                        break;
                    }
                    pl.doTask(manager);
                } catch (InvalidCommandException e) {
                    System.err.println(e.getLocalizedMessage());
                } catch (InvalidRegistrationNumberException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        } finally {
            sc.close(); // closing scanner resource.
        }
    }
}
