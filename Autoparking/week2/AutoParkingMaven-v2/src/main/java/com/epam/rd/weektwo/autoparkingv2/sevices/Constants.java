/** Auto Car Parking Application that accept parking area and number of parking slots in a parking area. 
 * After accepting the prompt will stay and accept commands to accept the parking cars one by one. Also accept command to unpark the car. 
 * Valid inputs:
	1. Parking area should have all alphanumeric with max 100 chars.
	2. capacity of parking area should be in between 10 to 100, if not assign default capacity as 10 slots.
	3. Car Registration number should have at least 2 digits and remaining alphabets.
	4. Registration number length should be 10.
	5. User has to use 'p', 'u','e' commands for parking, unparking, exit the car respectively.
	In version2 'r' command has added to know current available slots and parked slots.
 */
package com.epam.rd.weektwo.autoparkingv2.sevices;

/**
 * The Constants class contain constant values used in auto parking application.
 * @author Krishnakanth Yachareni
 * @version 2.0
 * @since 2018-01-19
 */
public class Constants {
	/*
	 * Parking area & vehicle registration number validation constants.
	 */
	public static final int PARKING_AREA_NAME_MAX_LENGTH = 100;
	public static final int PARKING_AREA_MIN_CAPACITY = 10;
	public static final int PARKING_AREA_MAX_CAPACITY = 100;
	public static final int PARKING_AREA_DEFAULT_CAPACITY = 10;
	public static final int VEHICLE_REGISTRATION_NUM_LENGTH = 10;
	public static final int VEHICLE_REGISTRATION_NUM_MIN_DIGITS = 2;
	/*
	 * Parking commands
	 */
	public static final String PARK_COMMAND = "p";
	public static final String UNPARK_COMMAND = "u";
	public static final String REPORT_COMMAND = "r"; // version2 feature
	public static final String EXIT = "e";
	
}
