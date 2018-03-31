/**
 * This is Connection Pool example using MySql database.
 */
package com.epam.connectionpool;

import java.sql.Connection;

/**
 * The DataSource class can manage the connection pool releasing and get the
 * connection.
 */
public class DataSource {

    /**
     * @see {@link JdbcConnectionPool}.
     */
    private static JdbcConnectionPool connectionPool = new JdbcConnectionPool();

    /**
     * @return Jdbc Connection.
     */
    public Connection getConnection() {
        return connectionPool.getConnection();
    }

    /**
     * @param connection
     *            release the connection.
     */
    public void releaseConnection(final Connection connection) {
        connectionPool.releaseConnection(connection);
    }
}
