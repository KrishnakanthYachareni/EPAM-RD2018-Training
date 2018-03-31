/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.epam.myapp.util.Constants;
import com.epam.myapp.util.CurrentDate;

/**
 * @author Krishnakanth_Yachareni
 * @version 3.0
 */
public class ParkingManager extends UserManager {
    /**
     * HashMap can holds the vehicle registration number, parking slot
     * number,parking vehicle current date and time. This HasMmap temporarily
     * holds the data and write it into {AutoTranscation.txt} file.
     * Key-->Vehicle registration number. ArrayList first index-->Parking slot
     * Number. ArrayList second index-->Vehicle parking time.
     */
    private Map<String, ArrayList<String>> map;
    /**
     * {@literal parkingSlots}is a HashSet and it can holds the parking slot
     * numbers.
     */
    private Set<Integer> parkingSlots;

    /**
     * This is {@link ParkingManager} default constructor that can initialize
     * the HashMamp, HashSet and It can call
     * {@literal readDataFromFileToHashMap} method to write the
     * AutoTranscation.txt file data to HashMap.(Because If systems crash
     * parking vehicle details will not lost).
     */
    public ParkingManager() {
        // Initializing
        map = new HashMap<String, ArrayList<String>>();
        parkingSlots = new HashSet<Integer>();
        try {
            // write data to HashMap from file.
            readDataFromFileToHashMap();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method can add the parking details to the HashMap and
     * AutoTranscation.txt file.It can also add the parking slot number to
     * HashSet.
     * @param vehicleNo
     *            Vehicle registration number to park.
     * @throws IOException
     *             {@link IOException}
     */
    public void addVehicle(final String vehicleNo) throws IOException {
        ArrayList<String> arrList = new ArrayList<String>();
        // Get current date and time.
        CurrentDate date = new CurrentDate();
        // Get parking slot number.
        Integer slot = getParkingSlotNumber();
        // Add parking slot number to HashSet.
        parkingSlots.add(slot);
        /*
         * Add Parking details to the HashMap.
         */
        arrList.add("" + slot);
        arrList.add(date.getDate());
        map.put(vehicleNo, arrList);
        /*
         * calling method to add parking details to the file.
         */
        writeDataToTempFile();
    }

    /**
     * This method initially read the unparking vehicle data from TEMP file then
     * write that data to another permanent log file. and It can remove the
     * vehicle number from HashMap. It can also update the parking slot number
     * in HashSet.
     * @param vehicleNo
     *            Vehicle registration number to unpark Vehicle from the parking
     *            Lot.
     * @throws IOException
     *             {@link IOException}
     */
    public void removeVehicle(final String vehicleNo) throws IOException {
        String line = null;
        Integer slot = 0;
        /*
         * Reading the file to get unparking vehicle data.
         */
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(Constants.PARKINGLOT_TRANSCATION))) {
            CurrentDate date = new CurrentDate();
            // validating
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(",");
                if (arr[1].equalsIgnoreCase(vehicleNo)) {
                    /*
                     * set unparking vehicle parking slot number to replace
                     * another vehicle.
                     */
                    slot = Integer.parseInt(arr[0]);
                    line += "," + date.getDate();
                    break;
                }
            }
        }

        // Checking if file path is not exists create file.
        Path path = Paths.get(Constants.PARKINGLOT_TRANSCATION_LOG);
        /*
         * Write above data to permanent file.It can has parking and unparking
         * vehicle data.
         */
        try (BufferedWriter bufW = Files.newBufferedWriter(path,
                StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            bufW.write(line);
            bufW.newLine();
        }
        // Remove vehicle number from HashMap.
        map.remove(vehicleNo);
        // Remove parking slot number from HashSet.
        parkingSlots.remove(slot);
        // Updating TEMP file
        writeDataToTempFile();
    }

    /**
     * This method write the HashMap data to TEMP File.
     * @throws IOException
     *             {@link IOException}
     */
    public void writeDataToTempFile() throws IOException {
        // Open file.
        try (BufferedWriter bufW = Files.newBufferedWriter(
                Paths.get(Constants.PARKINGLOT_TRANSCATION))) {
            for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
                // writing data to file.
                bufW.write(entry.getValue().get(0) + "," + entry.getKey() + ","
                        + entry.getValue().get(1));
                bufW.newLine();
            }
        }
    }

    /**
     * This method read the TEMP file data to HashMap in-order to get the data
     * if system crash or abnormally terminate the application.then we can get
     * TEMP file data to HashMap without losing the data. And also it can set
     * the parking slot details to the HashSet.
     * @throws IOException
     *             {@link IOException}
     */
    public void readDataFromFileToHashMap() throws IOException {
        String line = null;
        // Checking if file path is not exists create file.
        Path path = Paths.get(Constants.PARKINGLOT_TRANSCATION);
        if (Files.notExists(path)) {
            path = Files.createFile(path);
        }
        // Read data from TEMP file.
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            while ((line = reader.readLine()) != null) {
                ArrayList<String> arrList = new ArrayList<String>();
                String[] arr = line.split(",");
                // index 0 has Parking slot number
                arrList.add(arr[0]);
                // index 2 has vehicle parked time.
                arrList.add(arr[2]);
                // add parking slot number to HashSet.
                parkingSlots.add(Integer.parseInt(arr[0]));
                // adding file data to HashMap
                map.put(arr[1], arrList);
            }
        }
    }

    /**
     * This method can generate the parking slot numbers with in the limit of
     * parking area capacity.
     * @return Integer as parking slot number.
     */
    public int getParkingSlotNumber() {
        int slot = 0;
        // Generate the parking slot number
        for (Integer i = 1; i <= super.getParkingCapacity(); i++) {
            if (!parkingSlots.contains(i)) {
                slot = i;
                break;
            }
        }
        return slot;
    }

    /**
     * This method can search vehicle in HashMap.
     * @param vehicleNumber
     *            Vehicle registration number.
     * @return boolean true if passed vehicle registration number is present
     *         else return false.
     */
    public boolean searchVehicle(final String vehicleNumber) {
        return map.containsKey(vehicleNumber);
    }

    /**
     * This method return the no of occupied slots in Parking area(HashMap).
     * @return true if HashMap size is less than parking capacity otherwise it
     *         will return false.
     */
    public boolean checkingOccupiedSlots() {
        boolean slot = false;
        if (map.size() < super.getParkingCapacity()) {
            slot = true;
        }
        return slot;
    }

    /**
     * This method return the no of empty slots present in Parking
     * area(HashMap).
     * @return false if hash set size is less than 1 otherwise it will return
     *         true.
     */
    public boolean checkingEmptySlots() {
        boolean slot = true;
        if (map.size() < 1) {
            slot = false;
        }
        return slot;
    }
}
