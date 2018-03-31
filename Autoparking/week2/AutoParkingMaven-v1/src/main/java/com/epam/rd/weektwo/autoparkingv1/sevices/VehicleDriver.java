/** Auto Car Parking Application that accept parking area and number of parking slots in a parking area. 
 * After accepting the prompt will stay and accept commands to accept the parking cars one by one. Also accept command to unpark the car. 
 * Valid inputs:
	1. Parking area should have all alphanumeric with max 100 chars.
	2. capacity of parking area should be in between 10 to 100, if not assign default capacity as 10 slots.
	3. Car Registration number should have at least 2 digits and remaining alphabets.
	4. Registration number length should be 10.
	5. User has to use 'p', 'u','e' commands for parking, unparking, exit the car respectively.
 */
package com.epam.rd.weektwo.autoparkingv1.sevices;

import java.util.Scanner;

import com.epam.rd.weektwo.autoparkingv1.Exceptions.InvalidCommandException;
import com.epam.rd.weektwo.autoparkingv1.Exceptions.InvalidParkingAreaException;
import com.epam.rd.weektwo.autoparkingv1.Exceptions.InvalidRegistrationNumberException;
import com.epam.rd.weektwo.autoparkingv1.client.Park;
import com.epam.rd.weektwo.autoparkingv1.client.Unpark;

/**
 * The VehicleDriver class is validates the arguments first then it can accept
 * commands to park & unpark the car It can call respective class to do an
 * operation.
 * 
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class VehicleDriver {
	public VehicleManager manager;

	/**
	 * This method validate parking area name & parking capacity by calling
	 * validateParkingNameCapacity(String[]) of Validater class. and assign parking
	 * name and parking area to Vehicle Manager methods. after that will call
	 * vehicleDriver() .
	 * 
	 * @param args
	 *            String array
	 */
	public void isValidate(String[] args) {
		// creating Validator class object.
		Validator validate = new Validator();
		try {
			// validating parking area name and capacity and it returns parking area
			// capacity.
			int capacity = validate.validateParkingNameCapacity(args);
			// assign Manager class instance to manager reference variable.
			manager = new VehicleManager();
			// assigning parking area name.
			manager.setParkingAreaName(args[0]);
			// assigning parking area capacity.
			manager.setParkingCapacity(capacity);
			// calling vehicleDriver method to accept parking commands.
			vehicleDriver();
		} catch (InvalidParkingAreaException e) {
			System.out.println(e.getMessage());
		}
	}

	public void vehicleDriver() {
		Scanner sc = new Scanner(System.in);
		// Menu class object
		Menu ob = new Menu();
		try {
			while (true) { 
				// calling menu method to display Menu.
				ob.menu();
				// switch case accept string command & convert it to lower case.
				switch (sc.next().toLowerCase()) {
				// Constants class parking command
				case Constants.PARK_COMMAND:
					Park p = new Park(); // Creating object for Park class
					p.doTask(manager); // calling doTask method to park a vehicle.
					break;
				// Constants class parking command
				case Constants.UNPARK_COMMAND:
					Unpark up = new Unpark(); // Creating object for Unpark class
					up.doTask(manager); // calling doTask method to unpark a vehicle.
					break;
				// Constants class parking
				case Constants.EXIT:
					return; // return nothing to exit.
				default:
					throw new InvalidCommandException("Invalid Command, Enter proper command.");
				} // switch end
			} // Loop end
		} catch (InvalidRegistrationNumberException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCommandException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close(); // closing scanner resource.
		}
	}
}
