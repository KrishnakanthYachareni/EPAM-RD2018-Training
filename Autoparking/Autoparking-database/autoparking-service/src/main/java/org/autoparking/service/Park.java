/**
 * Autaparking application using database.
 */
package org.autoparking.service;

import org.autoparking.dao.parkinglot.VehicleDAOFactory;
import org.autoparking.model.Vehicle;
import org.autoparking.service.exception.InvalidParkingLotException;
import org.autoparking.service.util.ParkingSlot;

/**
 * @author Krishnakanth
 *
 */
public class Park {

    /**
     * This method can accept the vehicle object and then check the vehcile slots are available or If available it can
     * park the vehilce.
     * 
     * @param vehicle
     * @return true if vehicle parked else return false.
     * @throws InvalidParkingLotException
     */
    public boolean park(Vehicle vehicle) throws InvalidParkingLotException {
        int slotNumber = ParkingSlot.getParkingSlotNumber();

        if (VehicleDAOFactory.create().occupiedSlots() > ParkingLot.PARKING_LOT_CAPACITY) {
            throw new InvalidParkingLotException(ParkingLot.LOT_FULL_MSG);
        }
        if (VehicleDAOFactory.create().isExist(vehicle.getRegistrationID())) {
            throw new InvalidParkingLotException(
                    vehicle.getRegistrationID() + ParkingLot.VEHICLE_PRESENT_MSG);
        }
        vehicle.setSoltNumber(slotNumber);
        ParkingSlot.getParkingSlots().add(slotNumber);
        return VehicleDAOFactory.create().insertVehicle(vehicle);
    }
}
