/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.service;

import java.util.HashSet;
import java.util.Set;

/**
 * The InvalidCommandException class extends Exception class.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class ParkingManager {
    /**
     * This is the HashSet can contain parking vehicles.
     */
    private Set<String> hashSet;
    /**
     * Parking area name.
     */
    private String parkingAreaName;
    /**
     * Parking area capacity.
     */
    private int parkingCapacity;

    /**
     * @return hasSet
     */
    public Set<String> getHashSet() {
        return hashSet;
    }

    /**
     * @param areaName
     *            name of parking area.
     * @param capacity
     *            capacity of parking area.
     */
    public ParkingManager(final String areaName, final int capacity) {
        super();
        this.hashSet = new HashSet<String>();
        this.parkingAreaName = areaName;
        this.parkingCapacity = capacity;
    }

    /**
     * @return parkingAreaName parking area name.
     */
    public String getParkingAreaName() {
        return parkingAreaName;
    }

    /**
     * @return parkingCapacity
     */
    public int getParkingCapacity() {
        return parkingCapacity;
    }

    /**
     * @param vehicleNumber
     *            search vehicle in vehicle hash set.
     * @return boolean true if passed vehicle registration number is present
     *         else return false.
     */
    public boolean searchVehicle(final String vehicleNumber) {
        return hashSet.contains(vehicleNumber);
    }

    /**
     * @return true if hash set size is less than parking capacity otherwise it
     *         will return false.
     */
    public boolean checkingOccupiedSlots() {
        boolean slot = false;
        if (hashSet.size() < parkingCapacity) {
            slot = true;
        }
        return slot;
    }

    /**
     * @return false if hash set size is less than 1 otherwise it will return
     *         true.
     */
    public boolean checkingEmptySlots() {
        boolean slot = true;
        if (hashSet.size() < 1) {
            slot = false;
        }
        return slot;
    }
}
