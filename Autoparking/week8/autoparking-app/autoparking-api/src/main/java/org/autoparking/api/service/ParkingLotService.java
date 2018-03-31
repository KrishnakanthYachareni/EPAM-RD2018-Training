/**
 * This is autoparking web application verison4.
 */
package org.autoparking.api.service;

import org.apache.log4j.Logger;
import org.autoparking.api.exception.InvalidParkingLotException;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Krishnakanth_Yachare
 *
 */
public abstract class ParkingLotService {

    /**
     * Parking Lot capacity.
     */
    private static final int PARKING_LOT_CAPACITY = 60;
    /**
     * Parking Lot transcation file to holds the vehicles TEMP data.
     */
    private static final String PARKINGLOT_TRANSCATION = "AutoTranscation.txt";
    /**
     * Logger declaration.
     */
    private static final Logger LOGGER = Logger.getLogger(ParkingLotService.class);

    /**
     * Parking Lot hashmap to holds the parked vehicles data.
     */
    private Map<String, List<String>> parkingLot;
    /**
     * HashSet to maintain the parking slots.
     */
    private Set<Integer> parkingSlots;

    /**
     * This is an abstract method to execute park and unpark commands.
     * 
     * @param registrationNumber
     * @return
     * @throws InvalidParkingLotException
     */
    public abstract boolean execute(String registrationNumber) throws InvalidParkingLotException;

    /**
     * Default constructor
     */
    public ParkingLotService() {
        parkingLot = new HashMap<>();
        parkingSlots = new HashSet<>();
        readDataFromFileToHashMap();
    }

    /**
     * @return get parkingLot Hash map.
     */
    public Map<String, List<String>> getParkingLot() {
        return parkingLot;
    }

    /**
     * @return ste parking slots hashset.
     */
    public Set<Integer> getParkingSlots() {
        return parkingSlots;
    }

    /**
     * This method can search vehicle in HashMap.
     * 
     * @param vehicleNumber Vehicle registration number.
     * @return boolean true if passed vehicle registration number is present
     *         else return false.
     */
    public boolean searchVehicle(final String vehicleNumber) {
        return parkingLot.containsKey(vehicleNumber);
    }

    /**
     * This method return the no of occupied slots in Parking area(HashMap).
     * 
     * @return true if HashMap size is less than parking capacity otherwise it
     *         will return false.
     */
    public boolean checkingOccupiedSlots() {
        boolean slot = false;
        if (parkingLot.size() < PARKING_LOT_CAPACITY) {
            slot = true;
        }
        return slot;
    }

    /**
     * This method return the no of empty slots present in Parking
     * area(HashMap).
     * 
     * @return false if hash set size is less than 1 otherwise it will return
     *         true.
     */
    public boolean checkingEmptySlots() {
        boolean slot = true;
        if (parkingLot.size() < 1) {
            slot = false;
        }
        return slot;
    }

    /**
     * This method can generate the parking slot numbers with in the limit of
     * parking area capacity.
     * 
     * @return Integer as parking slot number.
     */
    public Integer getParkingSlotNumber() {
        int slot = 0;
        // Generate the parking slot number
        for (Integer i = 1; i <= PARKING_LOT_CAPACITY; i++) {
            if (!parkingSlots.contains(i)) {
                slot = i;
                break;
            }
        }
        return slot;
    }

    /**
     * This method read the TEMP file data to HashMap in-order to get the data
     * if system crash or abnormally terminate the application.then we can get
     * TEMP file data to HashMap without losing the data. And also it can set
     * the parking slot details to the HashSet.
     * 
     * @throws IOException {@link IOException}
     */
    private void readDataFromFileToHashMap() {
        String line = null;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(PARKINGLOT_TRANSCATION))) {
            while ((line = reader.readLine()) != null) {
                ArrayList<String> arrList = new ArrayList<>();
                String[] arr = line.split(",");
                arrList.add(arr[0]);
                arrList.add(arr[2]);
                parkingSlots.add(Integer.parseInt(arr[0]));
                parkingLot.put(arr[1], arrList);
            }
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }
}
