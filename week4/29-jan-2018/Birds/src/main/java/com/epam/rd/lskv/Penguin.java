/**
 * This package has Liskov substitution principle example. bird fly example.
 */
package com.epam.rd.lskv;

/**
 * The Pengwin class is sub class of NonFlightBirds class. class method that is
 * getLocation. bird for location.
 * @author Krishnakanth_Yachareni
 * @since 23-01-2018
 */
public class Penguin extends NonFlightBirds {
    /**
     * This method is about food items of Penguins.
     */
    public void foodItems() {
        System.out.println("Penguins eats krill, squids, and fishes");
    }
}
