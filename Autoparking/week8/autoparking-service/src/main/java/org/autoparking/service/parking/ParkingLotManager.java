/**
 * This is an auto parking web application.
 */
package org.autoparking.service.parking;

import org.autoparking.api.exception.InvalidParkingLotException;
import org.autoparking.api.service.VehiclePark;
import org.autoparking.api.service.VehicleUnpark;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class ParkingLotManager {

    /**
     * {@link VehiclePark} reference.
     */
    private VehiclePark vehiclePark;

    /**
     * {@link VehicleUnpark} reference.
     */
    private VehicleUnpark vehicleUnpark;

    /**
     * Default constructor.
     */
    public ParkingLotManager() {
        vehiclePark = new VehiclePark();
        vehicleUnpark = new VehicleUnpark();
    }

    /**
     * This method can store the data to file and hash map.
     * 
     * @param registrationNum vehicle ID.
     * @return The no of parked vehicles.
     * @throws InvalidParkingLotException {@link InvalidParkingLotException}.
     */
    public int park(final String registrationNum)
            throws InvalidParkingLotException {
        int parkedVehicles = 0;
        if (!vehiclePark.checkingOccupiedSlots()) {
            throw new InvalidParkingLotException("Parking slots are full");
        }
        if (vehiclePark.searchVehicle(registrationNum)) {
            throw new InvalidParkingLotException(
                    registrationNum + " vehicle has already present");
        }
        // Park the vehicle.
        vehiclePark.execute(registrationNum);
        parkedVehicles = vehiclePark.getParkingLot().size();
        return parkedVehicles;
    }

    /**
     * This method can remove the vehicle data to file and hash map.
     * 
     * @param registrationNum vehicle ID.
     * @return The no of parked vehicles.
     * @throws InvalidParkingLotException {@link InvalidParkingLotException}.
     */
    public int unPark(final String registrationNum)
            throws InvalidParkingLotException {
        int parkedVehicles = 0;
        if (!vehicleUnpark.checkingEmptySlots()) {
            throw new InvalidParkingLotException("Parking slots are empty");
        }
        if (!vehicleUnpark.searchVehicle(registrationNum)) {
            throw new InvalidParkingLotException(
                    registrationNum + " vehicle has not present");
        }
        // unPark the vehicle.
        vehicleUnpark.execute(registrationNum);
        parkedVehicles = vehicleUnpark.getParkingLot().size();
        return parkedVehicles;
    }
}
