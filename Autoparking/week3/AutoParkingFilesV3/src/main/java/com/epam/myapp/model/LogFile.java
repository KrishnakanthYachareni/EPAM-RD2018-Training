/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.epam.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.myapp.service.Command;
import com.epam.myapp.service.ParkingManager;
import com.epam.myapp.util.Constants;

/**
 * The {@link LogFile} class can used to get the previous parking arrea data.
 * @author Krishnakanth_Yachareni
 * @version 3.0
 */
public class LogFile implements Command {
    /**
     * Default constructor.
     */
    public LogFile() {
    }

    @Override
    public final void doTask(final ParkingManager parkingManager)
            throws InvalidRegistrationNumberException, IOException {

        System.out.println(
                "************** Parked Vehicles in Parking Lot  ************");
        Path pathTemp = Paths.get(Constants.PARKINGLOT_TRANSCATION);
        if (Files.notExists(pathTemp)) {
            pathTemp = Files.createFile(pathTemp);
        }
        /*
         * Read the file and then prints the data on console.
         */
        try (BufferedReader reader = Files.newBufferedReader(pathTemp)) {
            Stream<String> stream = reader.lines();
            Iterable<String> iterable = stream::iterator;
            for (String log : iterable) {
                System.out.println(log);
            }
        }
        System.out.println(
                "************** Auto Parking Transcation LogFile ************");
        // Checking if file path is not exists create file.
        Path path = Paths.get(Constants.PARKINGLOT_TRANSCATION_LOG);
        if (Files.notExists(path)) {
            path = Files.createFile(path);
        }
        /*
         * Read the file and then prints the data on console.
         */
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            Stream<String> stream = reader.lines();
            Iterable<String> iterable = stream::iterator;
            for (String log : iterable) {
                System.out.println(log);
            }
        }
    }
}
