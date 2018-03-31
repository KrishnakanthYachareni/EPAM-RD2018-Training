/**
 * This is a simple login example.
 */
package org.login.dao.datasource;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * @author Krishnakanth_Yachare
 *
 */
public final class DbConnection {

    private DbConnection() {
        // Nothing to do.
    }

    /**
     * Logging initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(DbConnection.class);

    /**
     * @return MySQL Connection Object.
     */
    public static Connection getConnection() {
        DataSource dataSource = DataSourceFactory.getMySQLDataSource();
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return connection;
    }
}
