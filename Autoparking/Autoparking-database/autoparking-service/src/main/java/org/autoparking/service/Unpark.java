/**
 * Autaparking application using database.
 */
package org.autoparking.service;

import org.autoparking.dao.parkinglot.VehicleDAOFactory;
import org.autoparking.service.exception.InvalidParkingLotException;
import org.autoparking.service.util.ParkingSlot;

/**
 * @author Krishnakanth
 *
 */
public class Unpark extends ParkingSlot {
    
    /**
     * This method can accept the vehicle ID and then check the vehcile is available or If found it can unpark the
     * vehilce.
     * 
     * @param registrationID
     * @return
     * @throws InvalidParkingLotException
     */
    public boolean unPark(String registrationID) throws InvalidParkingLotException {

        if (VehicleDAOFactory.create().occupiedSlots() <= 0) {
            throw new InvalidParkingLotException(ParkingLot.LOT_EMPTY_MSG);
        }
        if (!VehicleDAOFactory.create().isExist(registrationID)) {
            throw new InvalidParkingLotException(
                    registrationID + ParkingLot.VEHICLE_NOT_PRESENT_MSG);
        }
        int slotNumber = VehicleDAOFactory.create().getVehicle(registrationID).getSoltNumber();
        ParkingSlot.getParkingSlots().remove(slotNumber);
        return VehicleDAOFactory.create().deleteVehicle(registrationID);
    }
}
