/**
 * Autaparking application using database.
 */
package org.autoparking.dao.connection;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.sql.DataSource;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class DataSourceConnectionPool {

    /**
     * Logger initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(DataSourceConnectionPool.class);

    /**
     * Linked List holds the connections.
     */
    private final List<Connection> idleConnections = new LinkedList<Connection>();

    /**
     * Connection Pool Maximum size.
     */
    private static final Integer MAX_POOL_SIZE = 5;

    /**
     * Default constructor.
     */
    public DataSourceConnectionPool() {
        initializeConnectionPool();
    }

    /**
     * This method can add the connection object to Linked list.
     */
    private void initializeConnectionPool() {
        LOGGER.info("Initializing Connection Pool");
        while (!isMaxPoolSizeReached()) {
            idleConnections.add(createNewConnection());
        }
    }

    /**
     * @return JDBC Connection Object.
     */
    private Connection createNewConnection() {
        LOGGER.info("Executing start createNewConnection()");
        Connection connection = null;
        DataSource dataSource = DataSourceFactory.getMySQLDataSource();
        try {
            connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            LOGGER.error("SQL Exception", e);
        }
        LOGGER.info("Executing end createNewConnection()");
        return connection;
    }

    /**
     * @return boolean true if Max Pool size is not meet else returns false.
     */
    private boolean isMaxPoolSizeReached() {
        return idleConnections.size() > MAX_POOL_SIZE;
    }

    /**
     * This method can remove the connection object from linked list and then returns that object.
     * 
     * @return Connection object
     */
    public synchronized Connection getConnection() {
        Connection connection = null;
        if (idleConnections.size() > 0) {
            connection = idleConnections.remove(0);
        }
        return connection;
    }

    /**
     * This method can add the removed connection to the Linked list to reuse the connection again.
     * 
     * @param connection Connection object.
     */
    public synchronized void releaseConnection(final Connection connection) {
        idleConnections.add(connection);
    }
}
