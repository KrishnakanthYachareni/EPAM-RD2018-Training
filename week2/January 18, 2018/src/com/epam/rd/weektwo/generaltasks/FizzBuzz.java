/**
 * 
 * The FizzBuzz class can print 1 to 100. If number can be divided by 3, print "Fizz"
 * If divide by 5, print "Buzz" instead of the number, If both condition holds, print "FizzBuzz" instead of the number.
 * Sample Output:
 * 	1 2 Fizz 4 Buzz ...13 14 Buzz
 */
package com.epam.rd.weektwo.generaltasks;
/**
 * @author Krishnakanth Yachareni
 * @since 18-01-2018
 */
public class FizzBuzz {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* loop iterate from 1 to 100 
		 * ternary operator to check whether 3 or 5 or 15 means 3 and 5 divided or not
		 * if divided return respective value to print statement.*/
		for (int id_x = 1; id_x <= 100; id_x++)
			System.out.print(id_x % 15 == 0 ? "FizzBuzz " : id_x % 5 == 0 ? "Buzz " : id_x % 3 == 0 ? "Fizz " : id_x+" ");
	}
}
