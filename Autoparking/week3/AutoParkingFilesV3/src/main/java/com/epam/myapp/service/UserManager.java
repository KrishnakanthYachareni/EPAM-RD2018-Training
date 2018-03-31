/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import com.epam.myapp.util.Constants;
import com.epam.myapp.util.CurrentDate;

/**
 * @author Krishnakanth_Yachareni
 * @version 3.0
 */
public class UserManager {
    /**
     * Parking area capacity set by user.
     */
    private int parkingCapacity;

    /**
     * @return Integer as parking capacity.
     */
    public int getParkingCapacity() {
        return parkingCapacity;
    }

    /**
     * This method can checks the given user name password correct or not.If
     * correct returns true else returns false.
     * @param name
     *            Admin name.
     * @param pass
     *            Admin password.
     * @return boolean It returns true if user name and password are matched
     *         else false.
     * @throws FileNotFoundException
     *             {@link FileNotFoundException}
     * @throws IOException
     *             {@link IOException}
     * @throws ClassNotFoundException
     *             {@link ClassNotFoundException}
     */
    public boolean isUserValid(final String name, final String pass)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        boolean isuser = false;
        //Checking if file path is not exists create file.
        Path path = Paths.get(Constants.USER_DATA_FILE);
        if (Files.notExists(path)) {
            path = Files.createFile(path);
        }
        // File reading
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = null;
            // validating
            while ((line = reader.readLine()) != null) {
                if (line.contains(name) && line.contains(pass)) {
                    String[] arr = line.split(",");
                    // set parking area capacity to variable.
                    final int cpIndexInFile = 3;
                    parkingCapacity = Integer.parseInt(arr[cpIndexInFile]);
                    isuser = true;
                    break;
                }
            }
        }
        return isuser;
    }

    /**
     * This method write the User(admin) data to the file.
     * @param username
     *            Admin user name.
     * @param password
     *            Admin password.
     * @param parkigLot
     *            Parking area name.
     * @param lotCapacity
     *            Parking area capacity.
     * @return true if successfully write the data to file.
     * @throws IOException
     *             {@link IOException}
     */
    public boolean addNewUser(final String username, final String password,
            final String parkigLot, final int lotCapacity) throws IOException {
        /*
         * Set parking area if the user is new User.
         */
        parkingCapacity = lotCapacity;
        CurrentDate date = new CurrentDate();
      //Checking if file path is not exists create file.
        Path path = Paths.get(Constants.USER_DATA_FILE);
        if (Files.notExists(path)) {
            path = Files.createFile(path);
        }
        // Write data to the file.
        try (BufferedWriter bufW = Files.newBufferedWriter(path,
                StandardOpenOption.APPEND)) {
            bufW.write(username + "," + password + "," + parkigLot + ","
                    + lotCapacity + "," + date.getDate());
            bufW.newLine();
        }
        return true;
    }
}
