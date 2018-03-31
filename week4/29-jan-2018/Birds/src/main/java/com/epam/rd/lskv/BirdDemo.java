/**
 * This package has Liskov substitution principle example. bird fly example
 */
package com.epam.rd.lskv;

/**
 * The Demo class has main method .
 * @author Krishnakanth_Yachareni
 * @since 23-01-2018
 */
public final class BirdDemo {
    /**
     * Default Constructor.
     */
    private BirdDemo() {
    }

    /**
     * Main method to be called by JVM.
     * @param args
     *            main args
     */
    public static void main(final String[] args) {
        // Parrot instance assigned to type of FlightBirds
        FlightBirds parrot = new Parrot();
        parrot.setLatitude(200);
        parrot.setLongitude(300);
        parrot.setAltitude(100);
        // Parrot location
        System.out.println("Parrot Location is : " + parrot.getLocation());
        // Pengwin instance assigned to type of NonFlightBirds
        NonFlightBirds penguin = new Penguin();
        penguin.setLatitude(100);
        penguin.setLongitude(200);
        // pengwin location
        System.out.println("Pengwin Location is : " + penguin.getLocation());
    }
}
