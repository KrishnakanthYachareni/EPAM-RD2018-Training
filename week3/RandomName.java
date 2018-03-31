package com;

import java.util.Random;

/**
 * The RandomName class generates random name from given string array.
 * 
 * @author Krishnakanth_Yachareni
 * @since 23-01-2018
 */
public class RandomName {

	public static void main(String[] args) {
		String[] array = { "Shiva Kumar Goud", "krishnakanth", "Venumadhav", "Ayush Srivastava", "Saurabhkumar",
				"Sivarama Koti Reddy", "Mahesh Kumar", "bhuvan", "rizwana", "Gruhit sai", "Sai Pavan", "pawan kumar",
				"Mohammed Akhter Rasool", "srinivas", "Rakesh Kumar", "sana parveen", "bhavya" };
		// creating random instance.
		Random random = new Random();
		// probability of total length of an array.
		String name = array[random.nextInt(array.length)];
		// String names converting to Upper case letters string.
		System.out.println(name.toUpperCase());
	}

}
