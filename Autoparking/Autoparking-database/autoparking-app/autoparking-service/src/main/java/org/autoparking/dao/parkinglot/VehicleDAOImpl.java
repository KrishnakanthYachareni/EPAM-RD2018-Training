/**
 * Autaparking application using database.
 */
package org.autoparking.dao.parkinglot;

import org.apache.log4j.Logger;
import org.autoparking.dao.connection.DataSource;
import org.autoparking.model.Vehicle;
import org.autoparking.service.util.CurrentTime;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Krishnakanth
 *
 */
public class VehicleDAOImpl implements VehicleDAO {

    /**
     * Logger initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(VehicleDAOImpl.class);

    private static final String VEHICLE_INSERT_QUERY =
            "INSERT INTO autoparkinglot VALUES (NULL, ?, ?, ?,?,?,?)";
    private static final String VEHICLE_UPDATE_QUERY =
            "UPDATE autoparkinglot SET slotNumber=?, registrationID=?, parkTime=?, unparkTime=?, createdTime=?, updatedTime=? WHERE id=?";
    private static final String SELECT_VEHICLE_QUERY =
            "SELECT * FROM autoparkinglot WHERE registrationID=?";
    private static final String SELECT_ALL_VEHICLE_QUERY = "SELECT * FROM autoparkinglot";
    private static final String DELETE_VEHICLE_QUERY =
            "DELETE FROM autoparkinglot WHERE registrationID=?";
    private static final String VEHICLE_EXIST_QUERY =
            "SELECT registrationID FROM autoparkinglot WHERE registrationID=?";
    private static final String OCCUPIED_VEHICLE_QUERY = "SELECT COUNT(*) FROM autoparkinglot";


    /**
     * {@link DataSource}
     */
    private DataSource dataSource;
    /**
     * {@link Connection}
     */
    private Connection connection;

    /**
     * This is constructor can initialize the database connection object.
     */
    public VehicleDAOImpl() {
        dataSource = new DataSource();
        connection = dataSource.getConnection();
    }

    /**
     * This method can return the vehicle objects by passing the ResultSet.
     * 
     * @param result
     * @return
     * @throws SQLException
     */
    private Vehicle extractVehicleFromResultSet(ResultSet result) throws SQLException {
        Vehicle vehicle = new Vehicle();

        vehicle.setId(result.getInt(1));
        vehicle.setSoltNumber(result.getInt(2));
        vehicle.setRegistrationID(result.getString(3));
        vehicle.setParkTime(result.getString(4));
        vehicle.setUnparkTime(result.getString(5));
        vehicle.setCreatedTime(result.getString(6));
        vehicle.setUpdatedTime(result.getString(7));

        return vehicle;
    }


    /**
     * This method can maintains the permanent storage of vehicle details.
     * 
     * @param registrationID
     * @return
     */
    private boolean insertToLogTable(String registrationID) {
        try (PreparedStatement preparedStmtSel =
                connection.prepareStatement("SELECT * FROM autoparkinglot WHERE registrationID=?");
                PreparedStatement preparedStmt = connection.prepareStatement(
                        "INSERT INTO autoparkinglotlog VALUES (?, ?, ?, ?,?,?,?)")) {
            preparedStmtSel.setString(1, registrationID);
            ResultSet result = preparedStmtSel.executeQuery();
            while (result.next()) {
                Vehicle vehicle = extractVehicleFromResultSet(result);
                preparedStmt.setInt(1, vehicle.getId());
                preparedStmt.setInt(2, vehicle.getSoltNumber());
                preparedStmt.setString(3, vehicle.getRegistrationID());
                preparedStmt.setString(4, vehicle.getParkTime());
                preparedStmt.setTimestamp(5, CurrentTime.getTime());
                preparedStmt.setTimestamp(6, CurrentTime.getTime());
                preparedStmt.setTimestamp(7, CurrentTime.getTime());
            }
            int i = preparedStmt.executeUpdate();
            if (i == 1) {
                return true;
            }
        } catch (SQLException e) {
            LOGGER.error("Exception in insertToLogTable()", e);
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.parkinglot.VehicleDAO#getVehicle(java.lang.String)
     */
    public Vehicle getVehicle(String registrationID) {
        try (PreparedStatement preparedStmt = connection.prepareStatement(SELECT_VEHICLE_QUERY)) {
            preparedStmt.setString(1, registrationID);
            ResultSet result = preparedStmt.executeQuery();
            if (result.next()) {
                return extractVehicleFromResultSet(result);
            }
        } catch (SQLException ex) {
            LOGGER.error("Exception in getVehicle()", ex);
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.parkinglot.VehicleDAO#getALLVehicles()
     */
    public Set<Vehicle> getALLVehicles() {
        try (Statement stmt = connection.createStatement();
                ResultSet result = stmt.executeQuery(SELECT_ALL_VEHICLE_QUERY)) {
            Set<Vehicle> vehicles = new HashSet<>();
            while (result.next()) {
                Vehicle vehicle = extractVehicleFromResultSet(result);
                vehicles.add(vehicle);
            }
            return vehicles;
        } catch (SQLException ex) {
            LOGGER.error("Exception in getALLVehicles()", ex);
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.parkinglot.VehicleDAO#insertVehicle(org.autoparking. model.User)
     */
    public boolean insertVehicle(Vehicle vehicle) {
        try (PreparedStatement preparedStmt = connection.prepareStatement(VEHICLE_INSERT_QUERY)) {
            preparedStmt.setInt(1, vehicle.getSoltNumber());
            preparedStmt.setString(2, vehicle.getRegistrationID());
            preparedStmt.setTimestamp(3, CurrentTime.getTime());
            preparedStmt.setTimestamp(4, null);
            preparedStmt.setTimestamp(5, CurrentTime.getTime());
            preparedStmt.setTimestamp(6, CurrentTime.getTime());

            int i = preparedStmt.executeUpdate();
            if (i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            LOGGER.error("Exception in insertVehicle()", ex);
        }

        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.parkinglot.VehicleDAO#updateVehicle(org.autoparking. model.User)
     */
    public boolean updateVehicle(Vehicle vehicle) {
        try (PreparedStatement preparedStmt = connection.prepareStatement(VEHICLE_UPDATE_QUERY)) {
            preparedStmt.setInt(1, vehicle.getSoltNumber());
            preparedStmt.setString(2, vehicle.getRegistrationID());
            preparedStmt.setString(3, vehicle.getParkTime());
            preparedStmt.setString(4, vehicle.getUnparkTime());
            preparedStmt.setString(5, vehicle.getCreatedTime());
            preparedStmt.setString(6, vehicle.getUpdatedTime());
            preparedStmt.setInt(7, vehicle.getId());

            int i = preparedStmt.executeUpdate();
            if (i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            LOGGER.error("Exception in updateVehicle()", ex);
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.parkinglot.VehicleDAO#deleteVehicle(java.lang.String)
     */
    public boolean deleteVehicle(String registrationID) {
        try (PreparedStatement preparedStmtDel =
                connection.prepareStatement(DELETE_VEHICLE_QUERY)) {

            preparedStmtDel.setString(1, registrationID);
            int i = preparedStmtDel.executeUpdate();

            if (i == 1) {
                // call internal method to store the vehicle details permanently into log table.
                insertToLogTable(registrationID);
                return true;
            }
        } catch (SQLException ex) {
            LOGGER.error("Exception in deleteVehicle", ex);
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.parkinglot.VehicleDAO#isExist(java.lang.String)
     */
    public boolean isExist(String registrationID) {
        try (PreparedStatement preparedStmt = connection.prepareStatement(VEHICLE_EXIST_QUERY)) {
            preparedStmt.setString(1, registrationID);
            ResultSet result = preparedStmt.executeQuery();
            while (result.next()) {
                if (result.getString("registrationID").equals(registrationID)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            LOGGER.error("Exception in isExist", ex);
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.autoparking.dao.parkinglot.VehicleDAO#occupiedSlots()
     */
    public int occupiedSlots() {
        int numberRow = 0;
        try (Statement stmt = connection.createStatement();
                ResultSet result = stmt.executeQuery(OCCUPIED_VEHICLE_QUERY)) {
            while (result.next()) {
                numberRow = result.getInt("count(*)");
            }
        } catch (SQLException ex) {
            LOGGER.error("Exception in occupiedSlots", ex);
        }
        return numberRow;
    }
}
