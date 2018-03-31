/**
 * This is a simple login example.
 */
package org.login.dao.datasource;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.login.dao.datasource.DataSourceFactory;
import org.mockito.runners.MockitoJUnitRunner;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * This is Junit test case for {@link DataSourceFactory} class.
 * 
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class DataSourceFactoryTest {

    /**
     * This method can test the database connection.
     * 
     * @throws SQLException {@link SQLException}.
     */
    @Test
    public void databaseConnectionTest() throws SQLException {
        DataSource dataSource = DataSourceFactory.getMySQLDataSource();
        Connection connection = dataSource.getConnection();
        connection.close();
        assertTrue(connection.isClosed());
    }
}
