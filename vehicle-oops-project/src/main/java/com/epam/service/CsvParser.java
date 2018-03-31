package com.epam.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.epam.exception.InvalidPropertiesException;
import com.epam.exception.NoVehicleFoundException;
import com.epam.util.Constants;

/**
 * class name Csv Parser.
 */
public class CsvParser {
    /**
     * Logger initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(CsvParser.class);

    /**
     * Default constructor. {@link VehicleServiceManager}.
     */
    public CsvParser() {
    }

    /**
     * This method can search the vehicle properties from file and then it can
     * call the {@link VehicleServiceManager} getVehicle() method to create the
     * object for vehicle class name.
     * @param nameTosearch
     *            vehicle name.
     * @return vehicle properties list.
     * @throws NoVehicleFoundException
     *             exception message.
     * @throws FileNotFoundException
     *             if file not present.
     * @throws InvalidPropertiesException
     *             {@link InvalidPropertiesException}
     */
    public List<List<String>> parseVehicle(final String nameTosearch)
            throws NoVehicleFoundException, InvalidPropertiesException,
            FileNotFoundException {

        // Empty string variable to holds the line from file.
        String readLine = "";

        // variable to validates the empty vehicle properties in file.
        String dataChecking = "";

        // ArrayList to holds the found vehicles.
        List<List<String>> vehicleList = new ArrayList<>();
        /*
         * Read CSV file to get vehicle data.
         */
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(Constants.VEHICLE_PROPERTIES_FILE))) {

            // Iterating loop to search all the records in a file.
            while ((readLine = reader.readLine()) != null) {
                // Trim the line and then split string into list.
                List<String> vehiclePropertyList = Arrays
                        .asList(readLine.trim().split(","));
                /*
                 * checking for matched vehicles List If match add to list.
                 */
                if (vehiclePropertyList.stream()
                        .anyMatch(nameTosearch::equalsIgnoreCase)) {
                    vehicleList.add(vehiclePropertyList);

                    // assign line if no vehicle it can be empty.
                    dataChecking = readLine;
                }
            }
        } catch (IOException e) {
            LOGGER.error("IOException " + e.getLocalizedMessage());
        }
        if (dataChecking.isEmpty()) {
            LOGGER.warn("No Vehicle Found");
            throw new NoVehicleFoundException(
                    "No Vehicle Found. Search again.....!");
        }
        // Return the array list.
        return vehicleList;
    }
}
