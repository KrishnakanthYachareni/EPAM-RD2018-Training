/**
 * Autaparking application using database.
 */
package org.autoparking.service;

/**
 * @author Krishnakanth
 *
 */
public interface ParkingLot {

    int PARKING_LOT_CAPACITY = 60;
    String LOT_FULL_MSG = "Parking slots are full";
    String LOT_EMPTY_MSG = "Parking slots are empty";
    String VEHICLE_PRESENT_MSG = "vehicle has already present";
    String VEHICLE_NOT_PRESENT_MSG = "vehicle has not present";

}
