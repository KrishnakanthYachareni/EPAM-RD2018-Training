/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.util;

/**
 * The Constants class contain constant values used in auto parking application.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public final class Constants {
    /**
     * Default constructor.
     */
    private Constants() {
    }

    /*
     ********************* Auto Parking Data storage files *****************
     */
    /**
     * Temporary file to store parking vehicle data.
     */
    public static final String PARKINGLOT_TRANSCATION_LOG =
            "AutoTranscationLog.txt";
    /**
     * Permanent file to store parked and unparked vehicle data.
     */
    public static final String PARKINGLOT_TRANSCATION = "AutoTranscation.txt";
    /**
     * File to store the admin info.
     */
    public static final String USER_DATA_FILE = "UserData.txt";

    /*
     ********** Parking area & vehicle registration number validation constants
     * *****************************************************************
     */

    /**
     * Regular expression for validating user name validation.
     */
    public static final String REGEX_USERNAME_VALID = "^[a-z]{5,20}$";

    /**
     * Regular expression for password validation. Password minimum length is 8,
     * Maximum length is 20.
     */
    public static final String REGEX_PASSWORD_VALIDATION =
            "^[a-zA-Z0-9]{8,20}$";

    /**
     * Regular expression for validating vehicle registration number.
     */
    public static final String REGISTRATION_NUM_VALID_REGEX = "(?=.*[0-9])"
            + "(?=.*[a-zA-Z])" + "[a-zA-Z0-9]*";

    /**
     * Regular expression for validating Parking area name.
     */
    public static final String PARKING_AREA_NAME_VALID_REGEX = "[a-zA-Z0-9]+";

    /**
     * Parking area name maximum length is 100.
     */
    public static final int PARKING_AREA_NAME_MAX_LENGTH = 100;

    /**
     * Parking area minimum capacity is 10.
     */
    public static final int PARKING_AREA_MIN_CAPACITY = 10;

    /**
     * Parking area maximum capacity is 100.
     */
    public static final int PARKING_AREA_MAX_CAPACITY = 100;

    /**
     * Vehicle registration number length is 10.
     */
    public static final int VEHICLE_REGISTRATION_NUM_LENGTH = 10;

    /**
     * Vehicle registration number minimum length is 2.
     */
    public static final int VEHICLE_REGISTRATION_NUM_MIN_DIGITS = 2;
    /*
     ****************** Auto Parking commands ********************
     */

    /**
     * Park command.
     */
    public static final String PARK_COMMAND = "P";

    /**
     * Unpark command.
     */
    public static final String UNPARK_COMMAND = "U";

    /**
     * Log Report command.
     */
    public static final String LOG_REPORT = "L";
    /**
     * Exit command.
     */
    public static final String EXIT = "E";
}
