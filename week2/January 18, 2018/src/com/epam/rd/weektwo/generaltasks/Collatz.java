/**
 * The CollatzSequence class can accept command line argument and should produce 
 * collatz sequence starting from a_0 = N (N<100)until a_n = 1.
 * an = {(1/2)an-1 for an-1 even
 * 		{3an-1+1 for odd
 * 
 * Sample output:
 * > java Collatz 3
 * 3 10 5 16 8 4 2 1
 * > java Collatz 5
 * 5 16 8 4 2 1
 * > java Collatz 7
 * 7 22 11 34 52 26 13 40 20 10 5 16 8 4 2 1 
 *
 */
package com.epam.rd.weektwo.generaltasks;

/**
 * @author Krishnakanth Yachareni
 * @since 18-01-2018
 */
public class Collatz {

	/**
	 * @param n
	 *            int starting value for collatz sequence. collatzSequence recursive
	 *            method can check 'n' is even or odd. if even recursive call with
	 *            value of n/2. if odd recursive call with value of 3 * n + 1. if
	 *            'n' == 1 return nothing.
	 */
	public void collatzSequence(int n) {
		System.out.print(n + " ");
		if (n == 1)
			return;
		else if (n % 2 == 0)
			collatzSequence(n / 2);
		else
			collatzSequence(3 * n + 1);
	}

	/**
	 * Main method will handle and raise an exception if passed command line argument is not one an argument &  the number should not be more 100.
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * creating instance for Collatz class.
		 */
		Collatz object = new Collatz();
		/* Handling NumberFormatException */
		try {
			/* Condtion for can accept only integer argument */
			if (args.length == 1) {
				// convert string to int.
				int n = Integer.parseInt(args[0]);
				/*
				 * Checking given number should be in between 1 to 100.
				 */
				if (n > 0 && n <= 100)
					object.collatzSequence(n); // method calling
				else
					throw new Exception();
			} else
				throw new Exception();
		} catch (Exception e) {
			System.out.println("Pass only one valid Integer from 1 to 100");
		}
	}

}
