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
 * The Menu class contains menu list.
 * @author Krishnakanth Yachareni
 * @version 2.0
 * @since 2018-01-19
 */
public class Menu {
	public void menu() {
		System.out.println("---------- AUTOPARKING ---------");
		System.out.println("Choose any one command in MENU.");
		System.out.println("p => park");
		System.out.println("u => unpark");
		System.out.println("r => report");
		System.out.println("e => exit");
		
	}
}
