/** Auto Car Parking Application that accept parking area and number of parking slots in a parking area. 
 * After accepting the prompt will stay and accept commands to accept the parking cars one by one. Also accept command to unpark the car. 
 * Valid inputs:
	1. Parking area should have all alphanumeric with max 100 chars.
	2. capacity of parking area should be in between 10 to 100, if not assign default capacity as 10 slots.
	3. Car Registration number should have at least 2 digits and remaining alphabets.
	4. Registration number length should be 10.
	5. User has to use 'p', 'u','e' commands for parking, unparking, exit the car respectively.
 */
package com.epam.rd.weektwo.autoparkingv1.client;

import java.util.Scanner;

import com.epam.rd.weektwo.autoparkingv1.Exceptions.InvalidRegistrationNumberException;
import com.epam.rd.weektwo.autoparkingv1.sevices.Validator;
import com.epam.rd.weektwo.autoparkingv1.sevices.Vehicle;
import com.epam.rd.weektwo.autoparkingv1.sevices.VehicleManager;

/**
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
/**
 * The Park can ask for vehicle registration number then it will validates by
 * validationVehicleNo(String). After that search for vehicle in parking hash
 * set whether given vehicle present or not if not present vehicle will add to
 * list. otherwise will display some message.
 * @throws InvalidRegistrationNumberException
 *             InvalidRegistrationNumberException raised if vehicle no not in format
 */
public class Park implements Vehicle {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.epam.rd.weektwo.taskone.Vehicle#doTask(com.epam.rd.weektwo.taskone.
	 * VehicleManager)
	 */
	public void doTask(VehicleManager vm) throws InvalidRegistrationNumberException {
		/* Creating object for Validator class*/
		Validator validate = new Validator();
		Scanner sc = new Scanner(System.in);
		// Declare variable 
		String vehicleNumber = null;
		/*
		 * checking for available slots in hash set.
		 */ 
		if (vm.checkingOccupiedSlots()) {
			System.out.println("Enter Vehicle Registration Number.");
			/* reading input for vehicle registration number*/
			vehicleNumber = sc.next().toLowerCase();;
			/* Validating vehicle number, If vehicle Number is not in correct format 
			 * it can throw InvalidRegistrationNumberException *
			 */
			validate.validateVehicleNo(vehicleNumber);
			/* searching whether hash set contain that given vehicle number or not. */
			if (!vm.searchVehicle(vehicleNumber)) {
				// adding vehicle number to hash set.
				vm.getHashSet().add(vehicleNumber);
				System.out.println(vehicleNumber + " vehicle has successfully parked");
			} else
				System.out.println(vehicleNumber + " vehicle has already present");
		} else
			System.out.println("Parking slots are full.");
	}

}
