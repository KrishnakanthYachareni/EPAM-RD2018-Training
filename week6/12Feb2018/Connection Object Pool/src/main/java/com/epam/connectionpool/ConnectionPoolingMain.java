/**
 * This is Connection Pool example using MySql database.
 */
package com.epam.connectionpool;

import java.sql.Connection;

/**
 * This class has main method to test the connnections.
 */
public final class ConnectionPoolingMain {
    /**
     * Default constructor.
     */
    private ConnectionPoolingMain() {
    }

    /**
     * @param args
     *            Command line arguments.
     */
    public static void main(final String[] args) {

        DataSource dataSource = new DataSource();

        for (int index = 0; index < 10; index++) {
            Connection connection = dataSource.getConnection();
            dataSource.releaseConnection(connection);
            System.out.println(connection);
        }
    }
}
