/**
 * Autaparking application using database.
 */
package org.autoparking.dao.parkinglot;

import java.util.Set;

import org.autoparking.model.Vehicle;

/**
 * @author Krishnakanth
 *
 */
public interface VehicleDAO {

    /**
     * This method returns the vehicle from vehicle object based on respective id.
     * 
     * @param registrationID
     * @return {@link Vehicle}
     */
    Vehicle getVehicle(String registrationID);

    /**
     * This method can return the list of vehicle object from the database.
     * 
     * @return
     */
    Set<Vehicle> getALLVehicles();

    /**
     * It can insert the vehicle details into database.
     * 
     * @param vehicle
     * @return true if the vehicle has inserted else false.
     */
    boolean insertVehicle(Vehicle vehicle);

    /**
     * It can update the vehicle in a databse.
     * 
     * @param vehicle
     * @return true if record has updated else return false.
     */
    boolean updateVehicle(Vehicle vehicle);

    /**
     * It can delete the records from the database
     * 
     * @param registrationID
     * @return true if record has deleted from the database else return false.
     */
    boolean deleteVehicle(String registrationID);

    /**
     * @param registrationID
     * @return true if vehicle exists else return false.
     */
    boolean isExist(String registrationID);

    /**
     * @return number of occupied slots.
     */
    int occupiedSlots();

}
