/**
 * This code accept user's first name and last name and display format.
 * Then display the user name according to the display format.
 */
package com.epam.rd.weektwo.taskthree;

import java.io.Console;

/**
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-16
 */
public class FirstNameLastName {

	/**
	 * It takes first name, last name and display format either LF or FL. if display
	 * format is FL will display First name followed by last name else if it is LF
	 * will display Last name followed by first name. Default display format is FL
	 * all these are done by java io console.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String firstName, lastName, format;
		Console con = System.console();
		System.out.println("enter first name");
		firstName = con.readLine(); // console readLine for input
		System.out.println("enter last name");
		lastName = con.readLine(); // console readLine for input
		System.out.println("enter display format FL or LF");
		format = con.readLine(); // console readLine for input
		if (format.equalsIgnoreCase("FL"))
			con.printf("%s%2s", firstName, lastName); // console printf format
		else if (format.equalsIgnoreCase("LF"))
			con.printf("%s%2s", lastName, firstName); // console printf format
		else
			con.printf("%s%2s", firstName, lastName); // console printf format

	}

}
