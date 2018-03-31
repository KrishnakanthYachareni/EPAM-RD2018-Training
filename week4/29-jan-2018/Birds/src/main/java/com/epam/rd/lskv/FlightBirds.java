/**
 * This package has Liskov substitution principle example. bird fly example.
 */
package com.epam.rd.lskv;

/**
 * The Bird class is sub class of Bird.it has altitude. bird for location.
 * @author Krishnakanth_Yachareni
 * @since 23-01-2018
 */
public class FlightBirds extends Bird {

    /**
     * altitude for flying birds.
     */
    private double altitude;

    /**
     * @return get altitude
     */
    public final double getAltitude() {
        return altitude;
    }

    /**
     * @param altitudes
     *            set altitude.
     */
    public final void setAltitude(final double altitudes) {
        this.altitude = altitudes;
    }

    @Override
    public final String getLocation() {
        return super.getLocation() + "," + this.altitude;
    }

}
