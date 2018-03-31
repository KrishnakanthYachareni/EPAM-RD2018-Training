/**
 * Autaparking application using database.
 */
package org.autoparking.dao.connection;

import java.sql.Connection;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class DataSource {
    /**
     * Database Connectionpool.
     */
    private static DataSourceConnectionPool connectionPool = new DataSourceConnectionPool();

    /**
     * @return Jdbc Connection.
     */
    public Connection getConnection() {
        return connectionPool.getConnection();
    }

    /**
     * @param connection release the connection.
     */
    public void releaseConnection(final Connection connection) {
        connectionPool.releaseConnection(connection);
    }

}
