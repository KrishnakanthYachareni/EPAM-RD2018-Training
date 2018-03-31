/**
 * This package has Liskov substitution principle example. bird fly example.
 */
package com.epam.rd.lskv;

/**
 * The Parrot class is sub class of FlightBirds class. class method that is
 * getLocation. bird for location.
 * @author Krishnakanth_Yachareni
 * @since 23-01-2018
 */
public class Parrot extends FlightBirds {
    /**
     * This method is about food items of parrot.
     */
    public void foodItems() {
        System.out.println("Parrot eats are safflower seeds,"
                + "sunflower seeds, millet seed,"
                + "canary seed, hemp seed, thistle seed");
    }
}
