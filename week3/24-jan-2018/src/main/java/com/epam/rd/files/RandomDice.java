/**
 * An interactive dice throwing program. The program should ask the user for
 * a number of D6s to use, and prints its result on the screen.
 */
package com.epam.rd.files;

import java.util.Random;

/**
 * The RandomDice class can ask the user for a number of D6s to use, and prints
 * its result on the screen.
 * @author Krishnakanth_Yachareni
 * @since 24-01-2018
 */
public final class RandomDice {
    /**
     * Default Constructor.
     */
    private RandomDice() {
    }

    /**
     * @param args
     *            String array.
     */
    public static void main(final String[] args) {
        /*
         * instance of Random class
         */
        Random rand = new Random();
        final int diceLimit = 6;
        while (true) {
            // Read input
            String dice = System.console().readLine("Enter number\n");
            try {
                // Validating string is empty or not.
                if (!dice.isEmpty()) {
                    // convert String to int.
                    int number = Integer.parseInt(dice);
                    // random number generator with range from 1 to 6.
                    int randomNumber = rand.nextInt(diceLimit);
                    if (number > 0 && number <= diceLimit) {
                        if (number == randomNumber) {
                            System.out.println("Excellent!");
                        } else {
                            System.out.println("Sorry!");
                        }
                    } else {
                        System.out.println(
                                "The number should be in between 1 to 6");
                    }
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter only number");
            }
        }

    }

}
