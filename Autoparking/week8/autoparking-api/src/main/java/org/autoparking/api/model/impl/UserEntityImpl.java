/**
 * This is Web based Auto Parking Application.
 */
package org.autoparking.api.model.impl;

import org.apache.log4j.Logger;
import org.autoparking.api.model.UserEntity;
import org.autoparking.api.util.CurrentDate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * This is class can manage the file operation of user.
 * 
 * @author Krishnakanth_Yachare
 *
 */
public class UserEntityImpl {
    /**
     * Admin Credentials data file.
     */
    private static final String USER_DATA_FILE = "D:/UserData.txt";
    /**
     * Logger initiallization.
     */
    private static final Logger LOGGER = Logger.getLogger(UserEntityImpl.class);

    /**
     * {@link UserEntity}.
     */
    private UserEntity userEntity;

    /**
     * Default constructor.
     */
    public UserEntityImpl() {
        userEntity = new UserEntity();
    }

    /**
     * This method write the User(admin) data to the file.
     * 
     * @param username Admin user name.
     * @param password Admin password.
     * @param parkigLotName Parking area name.
     * @return true if successfully write the data to file.
     */
    public boolean addNewUser(final String username, final String password,
            final String parkigLotName) {
        // Set user credentials to bean.
        userEntity.setParkingLotName(parkigLotName);
        userEntity.setUserName(username);
        userEntity.setPassword(password);

        CurrentDate date = new CurrentDate();
        Path filePath = Paths.get(USER_DATA_FILE);
        try {
            if (!filePath.toFile().exists()) {
                filePath = Files.createFile(filePath);
            }
            try (BufferedWriter bufW =
                    Files.newBufferedWriter(filePath, StandardOpenOption.APPEND)) {
                bufW.write(username + "," + password + "," + parkigLotName + "," + date.getDate());
                bufW.newLine();
            }
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return true;
    }

    /**
     * This method can checks the given user name password correct or not.If
     * correct returns true else returns false.
     * 
     * @param name Admin name.
     * @param password Admin password.
     * @return boolean It returns true if user name and password are matched
     *         else false.
     */
    public boolean checkUser(final String name, final String password) {
        boolean isuser = false;
        Path filePath = Paths.get(USER_DATA_FILE);
        try {
            if (!filePath.toFile().exists()) {
                filePath = Files.createFile(filePath);
            }
            try (BufferedReader reader = Files.newBufferedReader(filePath)) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(name) && line.contains(password)) {
                        isuser = true;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return isuser;
    }
}
