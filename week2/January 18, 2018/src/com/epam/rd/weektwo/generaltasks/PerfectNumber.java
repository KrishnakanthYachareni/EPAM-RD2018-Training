/**
 * The PerfectNumber class can check given number is perfect number or not.
 * (a positive integer that is equal to the sum of its proper positive divisors, 1 included, the number is excluded.)  
 * The four smallest such integers are 6, 28, 496, 8128.
 * 
 */
package com.epam.rd.weektwo.generaltasks;

/**
 * @author Krishnakanth_Yachareni
 * @since 19-01-2018.
 */
public class PerfectNumber {

	/**
	 * @param number
	 *            integer value Checking passed number is perfect or not.
	 */
	public void perfectNumber(int number) {
		int factor = 0;
		/*
		 * Loop to find sum all factors of given number.
		 */
		for (int id_x = 1; id_x < number; id_x++) {
			if (number % id_x == 0)
				factor += id_x;
		}
		/*
		 * Ternary operator to checking sum of factors is equals to the given number or
		 * not. If equal to given number is perfect number otherwise not an perfect
		 * number.
		 */
		System.out.println(factor == number ? number + " is perfect number " : number + " is not a perfect number");
	}

	/**
	 * Main method can accept only one integer argument & will handle
	 * NumberFormatExcepton.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/* Handle NumberFormatExceptionException */
		try {
			/* validating only one argument it accept */
			if (args.length == 1) {
				/*
				 * Converting string to int and calling method.
				 */
				new PerfectNumber().perfectNumber(Integer.parseInt(args[0]));
			} else
				throw new Exception();
		} catch (Exception e) {
			System.out.println("pass only one integer value");
		}

	}

}
