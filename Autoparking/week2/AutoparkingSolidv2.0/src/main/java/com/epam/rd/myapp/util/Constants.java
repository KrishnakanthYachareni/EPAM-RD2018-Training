/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.util;

/**
 * The Constants class contain constant values used in auto parking application.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public final class Constants {
    /**
     * Default constructor.
     */
    private Constants() {
    }

    /*
     * Parking area & vehicle registration number validation constants.
     */
    /**
     * PARKING AREA NAME MAX LENGTH is 100.
     */
    public static final int PARKING_AREA_NAME_MAX_LENGTH = 100;
    /**
     * PARKING AREA MIN CAPACITY is 10.
     */
    public static final int PARKING_AREA_MIN_CAPACITY = 10;
    /**
     * PARKING AREA MAX CAPACITY is 100.
     */
    public static final int PARKING_AREA_MAX_CAPACITY = 100;
    /**
     * PARKING AREA DEFAULT CAPACITY is 10.
     */
    public static final int PARKING_AREA_DEFAULT_CAPACITY = 10;
    /**
     * VEHICLE REGISTRATION NUM LENGTH is 10.
     */
    public static final int VEHICLE_REGISTRATION_NUM_LENGTH = 10;
    /**
     * VEHICLE REGISTRATION NUM MIN DIGITS is 2.
     */
    public static final int VEHICLE_REGISTRATION_NUM_MIN_DIGITS = 2;
    /*
     * Parking commands
     */
    /**
     * PARK COMMAND.
     */
    public static final String PARK_COMMAND = "p";
    /**
     * UNPARK COMMAND.
     */
    public static final String UNPARK_COMMAND = "u";
    /**
     * REPORT COMMAND.
     */
    public static final String REPORT = "r";
    /**
     * EXIT.
     */
    public static final String EXIT = "e";

}
