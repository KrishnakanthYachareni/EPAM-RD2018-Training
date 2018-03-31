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

import com.epam.rd.weektwo.autoparkingv2.Exceptions.InvalidParkingAreaException;
import com.epam.rd.weektwo.autoparkingv2.Exceptions.InvalidRegistrationNumberException;

/**
 * @author Krishnakanth Yachareni
 * @version 2.0
 * @since 2018-01-19
 */
public class Validator {

	/**
	 * @param vehicleNumber
	 *            vehicle registration number It will check parking area length can
	 *            have at most 100 characters and capacity should be in between 10
	 *            to 100. If capacity is not found n arguments default value 10 is
	 *            assigned.
	 * @return int returns given capacity if all conditions met else return default
	 *         capacity 10. will throw AutoParkingException if parking area &
	 *         capacity are not correct.
	 * @throws InvalidParkingAreaException
	 */
	public int validateParkingNameCapacity(String[] args) throws InvalidParkingAreaException {
		int parkingCapacity;
		/*
		 * If command line arguments are empty it can throw InvalidParkingAreaException. 
		 */
		if (args.length == 0)
			throw new InvalidParkingAreaException("Parking area name should not be null.");
		/*
		 * If command line arguments length more than 2 it can throw InvalidParkingAreaException.
		 */
		if (args.length <= 2) {
			/*
			 * checking parking area name length should not have more than 100 characters.
			 */
			if (args[0].length() <= Constants.PARKING_AREA_NAME_MAX_LENGTH) {
				/*
				 * If one argument is passed and if it alphanumeric then parking area default capacity set(10).
				 */
				if (args.length == 1) {
					if (args[0].matches("[a-zA-Z0-9]+"))
						parkingCapacity = Constants.PARKING_AREA_DEFAULT_CAPACITY;
					else
						throw new InvalidParkingAreaException(
								"Parking area name should have only alphanumeric characters\nExample: EPAMParking");
				} else {
					/*
					 * if command line are two argument then it can check second argument contains only letters or not.  
					 */
					if (!args[0].matches("[0-9]+")) {
						int secondValue = Integer.parseInt(args[1]);
						/*
						 * condition to check parking capacity should be in between 10 t0 100.
						 */
						if (secondValue >= 10 && secondValue <= 100)
							// Assign parking capacity.
							parkingCapacity = secondValue;
						else
							throw new InvalidParkingAreaException("Parking capacity should be in between 10 to 100");
					} else
						throw new InvalidParkingAreaException("Parking area capacity should be positive integer");
				}
			} else
				throw new InvalidParkingAreaException("Parking area name should not more than 100 characters");
		} else
			throw new InvalidParkingAreaException("Pass only two arguments");
		// returning parking capacity
		return parkingCapacity;
	}

	/**
	 * @param vehicleNumber vehicle registration number
	 * Initially it will check for null then it will check vehicle registration number 
	 * length should have 10 and minimum of 2 digits by using regular expression. 
	 * @return boolean returns true if all conditions met else false.
	 * @throws AutoParkingException
	 * will throw AutoParkingException if vehicle registration number not correct.
	 * @throws InvalidRegistrationNumberException
	 */
	public void validateVehicleNo(String vehicleNumber) throws InvalidRegistrationNumberException {
		/*
		 * If vehicle registration number is null it can throw InvalidRegistrationNumberException. .
		 */
		if (vehicleNumber == null)
			throw new InvalidRegistrationNumberException("Vehicle registration number should not be empty");

		/*
		 * Condition to check vehicleNo length should be 10, regular expression for vehicleNo
		 * should be alphanumeric
		 */

		if (vehicleNumber.length() == Constants.VEHICLE_REGISTRATION_NUM_LENGTH
				&& vehicleNumber.matches("(?=.*[0-9])" + "(?=.*[a-zA-Z])" + "[a-zA-Z0-9]*")) {
			/*
			 * Loop to find number of digits in vehicle number.
			 */
			int count = 0;
			for (char character : vehicleNumber.toCharArray()) {
				if (Character.isDigit(character))
					count++;
			}
			/* Checking vehicle number should have minimum of two digits. otherwise it can throw InvalidRegistrationNumberException  */
			if (count < Constants.VEHICLE_REGISTRATION_NUM_MIN_DIGITS)
				throw new InvalidRegistrationNumberException(
						"Vehicle registration number should have atleast two digit");
		} else {
			throw new InvalidRegistrationNumberException(
					"Vehicle registration number should be alpha numeric and length should be 10");
		}
	}
}
