/**
* This program implements an application that simply displays "Alphabets in Uppercase" to the standard output.
* 
*@author  Krishnakanth Yachareni
* @since   2018-01-12 
*/
package com.epam.rd.weekone;

/**
 * Write Java Class PrintAlphabetsUsingDoWhile to print output as "Alphabets in
 * Capital(A_Z)" using 'do-while' loop.
 */
/**
 * @author Krishnakanth Yachareni
 * @since 18-01-2018
 */
public class PrintAlphabetsUsingDoWhile {
	/**
	 * This method iterate ASCII values from 65(A) to 90(Z).
	 */
	public static void printAzUsingDoWhile() {

		// Method 1
		int i = 65;
		do {
			System.out.printf("%c ", i++); // PrintStream formatting method to auto convert int to char.
		} while (i < 91);

		// Method 2
		/*
		 * char i = 'A'; do { System.out.print(i+++" "); } while (i < 'Z');
		 */
	}

	public static void main(String[] args) {
		printAzUsingDoWhile(); // Calling method
	}

}