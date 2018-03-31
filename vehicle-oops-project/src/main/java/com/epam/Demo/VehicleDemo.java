package com.epam.Demo;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.epam.exception.InvalidPropertiesException;
import com.epam.exception.NoVehicleFoundException;
import com.epam.service.CsvParser;
import com.epam.service.VehicleServiceManager;
import com.epam.vehicle.Vehicle;

/**
 * This is vehicle demo it has main method.
 * @author Krishnakanth
 *
 */
public final class VehicleDemo {
    /**
     * Default constructor.
     */
    private VehicleDemo() {
    }

    /**
     * Logger initialization.
     */
    private static final Logger LOGGER = Logger
            .getLogger(VehicleServiceManager.class);

    /**
     * Main method to be called by JVM.
     * @param args
     *            command line arguments.
     */
    public static void main(final String[] args) {
        /*
         * Create object for csvParser and vehicle service manager.
         */
        CsvParser parser = new CsvParser();
        VehicleServiceManager serviceManager = new VehicleServiceManager();
        /*
         * accept input to search the vehicle.
         */
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Search vehcile....");
            List<List<String>> vehicleList = parser.parseVehicle(sc.next());
            /*
             * Iterate vehicles and then pass it to VehicleServiceManager.
             */
            for (List<String> vehicleProperty : vehicleList) {
                Vehicle vehicleObject = serviceManager
                        .getVehicleObject(vehicleProperty);
                // call toString() of class.
                System.out.println(vehicleObject);
            }
        } catch (FileNotFoundException | NoVehicleFoundException
                | InvalidPropertiesException e) {
            LOGGER.error(e);
        }

    }
}
