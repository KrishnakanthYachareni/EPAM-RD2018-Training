/**
 * This is an example Mockito Spy.
 */
package com.epam.mockito;

import java.util.HashSet;
import java.util.Set;

/**
 * This class has implementation of vehicle Manager.
 * @author KrishnakanthYachareni
 *
 */
public class VehicleManager {

    /**
     * Set holds parking vehicles data.
     */
    private Set<String> set;
    /**
     * {@link ReadData}.
     */
    private ReadData read;

    /**
     * Default Constructor.
     */
    public VehicleManager() {
        set = new HashSet<>();
    }

    /**
     * @return String vehicles Data.
     */
    public String getvehicleDetails() {
        String vehicleData = read.getvehicleDetails();
        return vehicleData;
    }

    /**
     * @param readd
     *            {@link ReadData}
     */
    public void setvehicleDetails(final ReadData readd) {
        this.read = readd;
    }

    /**
     * @return the set
     */
    public Set<String> getSet() {
        return set;
    }
}
