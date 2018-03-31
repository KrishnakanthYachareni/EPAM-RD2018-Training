/**
* This program implements an application that simply displays "Alphabets in Uppercase" to the standard output.
* 
*@author  Krishnakanth Yachareni
* @since   2018-01-12 
*/
package com.epam.rd.weekone;

/**
 * 
 * Write Java Class PrintAlphabetsUsingFor to print output as "Alphabets in
 * Capital(A_Z)" using 'for' loop.
 */
/**
 * @author Krishnakanth Yachareni
 * @since 18-01-2018
 */
public class PrintAlphabetsUsingFor {
	/**
	 * This method iterate ASCII values from 65(A) to 90(Z).
	 */
	public static void printA_zUsingFor() {
		// Method 1
		for (int i = 65; i < 91; i++)
			System.out.printf("%c ", i); // PrintStream formatting method to auto convert int to char.

		/*
		 * Method 2 for (char i = 'A'; i < 'Z'; i++) System.out.print(i+++" ");
		 */
	}

	public static void main(String[] args) {

		printA_zUsingFor(); // Calling method.
	}
}