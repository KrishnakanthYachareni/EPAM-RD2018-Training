/**
 * This is simple dbUnit example.
 */
package com.epam.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * ResourceManager class loads the Driver class, and has getDBConnection method
 * to return the db connection.
 * 
 * @author Krishnakanth_Yachareni
 *
 */
public class DbManager {

    /**
     * Logging initialization.
     */
    private static final Logger LOGGER = LogManager.getLogger(DbManager.class);

    /*
     * Database info
     */
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/epamDB";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    /**
     * getDBConnection() loads the driver class, gets connection from
     * DriverManager class and returns the Connection object to the invoking
     * method.
     * @return Connection object.
     */
    public static Connection getDBConnection() {

        try {
            Class.forName(DRIVER);
            LOGGER.info("Driver class loaded successfully");
        } catch (ClassNotFoundException e) {
            LOGGER.error("Class not loaded: exception\n%s", e);
        }

        try {
            return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            LOGGER.warn("Connection not created %s", e);
        }

        return null;
    }

}
