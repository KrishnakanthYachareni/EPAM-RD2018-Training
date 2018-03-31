/**
 * This application is example datasource for MYSQL database.
 */
package org.autoparking.service;

import org.apache.log4j.Logger;
import org.autopaking.model.bean.ParkingLotBean;
import org.autoparking.model.datasource.DataSourceFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


/**
 * @author Krishnakanth_Yachreni
 *
 */
public class ParkingLotDao {

    /**
     * Logging declaration.
     */
    private static final Logger LOGGER = Logger.getLogger(ParkingLotDao.class);

    /**
     * SQL query for get the auto parking database from MySQL database.
     */
    private static final String LOT_QUERY =
            "SELECT * FROM AUTOPARKINGTRANSCATION";

    /**
     * {@link Connection}.
     */
    private Connection con;

    /**
     * {@link Statement}.
     */
    private Statement stmt;

    /**
     * {@link ResultSet}.
     */
    private ResultSet result;

    /**
     * ParkingLot List can hold the parkingLot.
     */
    private List<ParkingLotBean> parkingLotList;

    /**
     * {@link DataSource}.
     */
    private DataSource dataSource;

    /**
     * it can initialize data resource.
     */
    public ParkingLotDao() {
        dataSource = DataSourceFactory.getMySQLDataSource();
        parkingLotList = new ArrayList<>();
    }

    /**
     * This method can get the parking lot data form the database
     * and then it can set the data to Parkinglot bean and
     * add to list then it can return the list.
     * 
     * @return parking lot list of objects
     */
    public List<ParkingLotBean> getParkingLotReport() {
        try {
            // Get the connection
            con = dataSource.getConnection();
            stmt = con.createStatement();
            result = stmt.executeQuery(LOT_QUERY);

            // get the data from database.
            while (result.next()) {

                int id = result.getInt("id");
                int slotNumber = result.getInt("slotNumber");
                String registrationID = result.getString("registrationNumber");
                String parkTime = result.getString("parkTime");
                String unParkTime = result.getString("unparkTime");
                String updatedTime = result.getString("updatedTime");
                String createdTime = result.getString("createdTime");

                // create the object
                ParkingLotBean parkingLotBean =
                        new ParkingLotBean(id, slotNumber, registrationID,
                                parkTime, unParkTime, updatedTime, createdTime);

                // add the object to list
                parkingLotList.add(parkingLotBean);
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                LOGGER.error(e);
            }
        }
        return parkingLotList;
    }
}
