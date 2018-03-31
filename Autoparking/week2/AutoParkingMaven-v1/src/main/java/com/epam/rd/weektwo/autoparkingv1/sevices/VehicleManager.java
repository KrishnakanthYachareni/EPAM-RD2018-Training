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

import java.util.HashSet;

/**
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class VehicleManager {
	private HashSet<String> hashSet = new HashSet<String>();
	private String parkingAreaName;
	private int parkingCapacity;

	/**
	 * @return hasSet
	 */
	public HashSet<String> getHashSet() {
		return hashSet;
	}

	/**
	 * @return parkingAreaName parking area name.
	 */
	public String getParkingAreaName() {
		return parkingAreaName;
	}

	/**
	 * @param parkingAreaName set parking area name.
	 */
	public void setParkingAreaName(String parkingAreaName) {
		this.parkingAreaName = parkingAreaName;
	}

	/**
	 * @return parkingCapacity 
	 */
	public int getParkingCapacity() {
		return parkingCapacity;
	}

	/**
	 * @param parkingCapacity set parking Capacity
	 */
	public void setParkingCapacity(int parkingCapacity) {
		this.parkingCapacity = parkingCapacity;
	}

	/**
	 * @param vehicleNumber search vehicle in vehicle hash set.
	 * @return boolean true if passed vehicle registration number is present else
	 *         return false.
	 */
	public boolean searchVehicle(String vehicleNumber) {
		return hashSet.contains(vehicleNumber);
	}

	/**
	 * @return true if hash set size is less than parking capacity otherwise it will return false.
	 */
	public boolean checkingOccupiedSlots() {
		boolean slot = false;
		if (hashSet.size() < parkingCapacity)
			slot = true;
		return slot;
	}

	/**
	 * @return false if hash set size is less than 1 otherwise it will return true.
	 */
	public boolean checkingEmptySlots() {
		boolean slot = true;
		if (hashSet.size() < 1)
			slot = false;
		return slot;
	}
}
