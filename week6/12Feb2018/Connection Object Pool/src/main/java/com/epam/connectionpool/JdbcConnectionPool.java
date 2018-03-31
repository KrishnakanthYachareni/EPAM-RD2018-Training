/**
 * This is Connection Pool example using MySql database.
 */
package com.epam.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * This class has implemented for the JDBC connection.
 */
public class JdbcConnectionPool {

    /**
     * Linked List holds the connections.
     */
    private final List<Connection> idleConnections =
            new LinkedList<Connection>();

    /**
     * Connection Pool Maximum size.
     */
    private static final Integer MAX_POOL_SIZE = 5;

    /**
     * Default constructor.
     */
    public JdbcConnectionPool() {
        initializeConnectionPool();
    }

    /**
     * This method can add the connection object to Linked list.
     */
    private void initializeConnectionPool() {
        while (!isMaxPoolSizeReached()) {
            idleConnections.add(createNewConnection());
        }

    }

    /**
     * @return JDBC Connection Object.
     */
    private Connection createNewConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test2", "root", "root123$");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * @return boolean true if Max Pool size is not meet else returns false.
     */
    private boolean isMaxPoolSizeReached() {

        return idleConnections.size() > MAX_POOL_SIZE;
    }

    /**
     * This method can remove the connection object from linked list and then
     * returns that object.
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
     * This method can add the removed connection to the Linked list to reuse
     * the connection again.
     * @param connection
     *            Connection object.
     */
    public synchronized void releaseConnection(final Connection connection) {
        idleConnections.add(connection);
    }
}
