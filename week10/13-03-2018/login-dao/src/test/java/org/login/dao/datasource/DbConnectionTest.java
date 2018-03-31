/**
 * This is a simple login example.
 */
package org.login.dao.datasource;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.sql.Connection;
import java.sql.SQLException;


/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class DbConnectionTest {

    /**
     * This method can test the database connection.
     * 
     * @throws SQLException {@link SQLException}.
     */
    @Test
    public void dbConnectionTest() throws SQLException {
        Connection connection = DbConnection.getConnection();
        connection.close();
        assertTrue(connection.isClosed());
    }

}
