/**
 * 
 * The CelsiusFahrenheit class can accept only two command line arguments 
 * if we pass more than two will raise an exception.
 * If parameter is 0 then can convert the second parameter from celsius to fahrenheit, 
 * otherwise it can reverse the conversion.   
 * The way to do the first conversion is the following: C = (F-32) * 5 / 9 
 * # first parameter should be int.
 * # second parameter should be float.
 */
package com.epam.rd.weektwo.generaltasks;
/**
 * @author Krishnakanth
 * @since 19-01-2018
 */
public class CelsiusFahrenheit {

	/**
	 * @param args
	 *            Main() method accepts only two integer arguments, other wise it
	 *            can throw an exception. if command line parameters are non
	 *            integers it will handle NumberFormatException. If first parameter
	 *            is equal to 0 it can convert & print second parameter from celsius
	 *            to fahrenheit, if not fahrenheit to celcius.
	 * 
	 */
	public static void main(String[] args) {
		/* Handle NumberFormatException */
		try {
			/* Checking given arguments should not be empty & must be two arguments. */
			if (args.length != 0 && args.length == 2) {
				int firstParameter = Integer.parseInt(args[0]);
				float secondParameter = Float.parseFloat(args[1]);
				/* Temperature conversion using ternary operator */
				System.out.println(firstParameter == 0 ? (9 * secondParameter) / 5.0 + 32 : (secondParameter - 32) * 5 / 9.0);
			} else
				throw new Exception();

		} catch (Exception e) {
			System.out.println("Pass only two integer arguments");
		}

	}

}
