/**
 * This package has Liskov substitution principle example. bird fly example.
 */
package com.epam.rd.lskv;

/**
 * The Bird class is base class for all the birds.it has latitude, longitude of
 * bird for location.
 * @author Krishnakanth_Yachareni
 * @since 23-01-2018
 */
public class Bird {
    /**
     * Bird latitude.
     */
    private double latitude;
    /**
     * bird longitude.
     */
    private double longitude;

    /**
     * @param latitudes
     *            set latitude.
     */
    public final void setLatitude(final double latitudes) {
        this.latitude = latitudes;
    }

    /**
     * @param logititudes
     *            longitude
     */
    public final void setLongitude(final double logititudes) {
        this.longitude = logititudes;
    }

    /**
     * @return location of bird.
     */
    public String getLocation() {
        return this.latitude + "," + this.longitude;
    }
}
