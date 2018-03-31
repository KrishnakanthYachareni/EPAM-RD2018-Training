/**
 * This is an example Mockito Spy.
 */
package com.epam.mockito;

/**
 * This class should have implementation of reading parking area data from file.
 * @author Krishnakanth_Yachareni
 */
public class ReadData {

    /**
     * Vehicle Registration Number.
     */
    private String vehicleID;
    /**
     * parking time and date.
     */
    private String date;

    /**
     * @return vehicle data.
     */
    public String getvehicleDetails() {
        // let's say this is file read operation
        return vehicleID + "_" + date;
    }
}
