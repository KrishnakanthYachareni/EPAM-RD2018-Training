/**
 * Autaparking application using database.
 */
package org.autoparking.service.util;

import org.autoparking.service.ParkingLot;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Krishnakanth
 *
 */
public class ParkingSlot {

    private static Set<Integer> parkingSlots = new HashSet<>();

    /**
     * @return the parkingSlots
     */
    public static Set<Integer> getParkingSlots() {
        return parkingSlots;
    }



    /**
     * This method can generate the parking slot numbers with in the limit of parking area capacity.
     * 
     * @return Integer as parking slot number.
     */
    public static int getParkingSlotNumber() {
        int slot = 0;
        // Generate the parking slot number
        for (int i = 1; i <= ParkingLot.PARKING_LOT_CAPACITY; i++) {
            if (!parkingSlots.contains(i)) {
                slot = i;
                break;
            }
        }
        return slot;
    }
}
