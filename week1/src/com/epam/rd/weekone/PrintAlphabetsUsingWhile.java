/**
* This program implements an application that simply displays "Alphabets in Uppercase" to the standard output.
* 
*@author  Krishnakanth Yachareni
* @since   2018-01-12 
*/
package com.epam.rd.weekone;

/**
 * Write Java Class PrintAlphabetsUsingWhile.java to print output as "Alphabets
 * in Capital(A_Z)" using 'while' Loop.
 */
/**
 * @author Krishnakanth Yachareni
 * @since 18-01-2018
 */
public class PrintAlphabetsUsingWhile {

	/**
	 * This method iterate ASCII values from 65(A) to 90(Z).
	 */
	public static void printAzUsingWhile() {
		int i = 65;
		while (i < 91)
			System.out.printf("%c ", i++); // PrintStream formatting method to auto convert int to char.
	}

	public static void main(String[] args) {
		// Calling method.
		printAzUsingWhile();
	}
}