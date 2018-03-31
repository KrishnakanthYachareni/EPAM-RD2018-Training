/**
* This program implements an application that simply displays "Alphabets in Uppercase" to the standard output.
* 
*@author  Krishnakanth Yachareni
* @since   2018-01-12 
*/
package com.epam.rd.weekone;

/**
 * Write Java Class PrintAlphabetsUsingRecursuive to print output as "Alphabets
 * in Capital(A_Z)" using recursion.
 */
/**
 * @author Krishnakanth Yachareni
 * @since 18-01-2018
 */
public class PrintAlphabetsUsingRecursuive {
	static int limit = 65;

	/**
	 * This method iterate ASCII values from 65(A) to 90(Z).
	 */
	public static void printAzUsingRecursive() {
		if (limit < 91) {
			System.out.printf("%c ", limit++); // PrintStream formatting method to auto convert int to char.
			printAzUsingRecursive();
		}
	}

	public static void main(String[] args) {
		// Calling method.
		printAzUsingRecursive();
	}
}