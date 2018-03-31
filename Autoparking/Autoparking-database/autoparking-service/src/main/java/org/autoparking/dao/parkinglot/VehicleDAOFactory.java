/**
 * Autaparking application using database.
 */
package org.autoparking.dao.parkinglot;

/**
 * This is a singleton class for vehicleDAO.
 * 
 * @author Krishnakanth
 *
 */
public class VehicleDAOFactory {
    /**
     * @return {@link VehicleDAOImpl}
     */
    public static VehicleDAO create() {
        return new VehicleDAOImpl();
    }
}
