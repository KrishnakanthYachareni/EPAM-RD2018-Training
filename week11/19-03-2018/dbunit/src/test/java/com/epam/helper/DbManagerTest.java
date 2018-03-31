/**
 * This is simple dbUnit example.
 */
package com.epam.helper;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.Connection;
import java.sql.DriverManager;

import org.dbunit.DatabaseTestCase;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.junit.Test;

/**
 * LoginDatabaseTest uses DBUnit to test the login table read operation. It
 * creates a connection and reads the data from the login.xml file and checks
 * that the no of rows after doing read operation is same as the expected count
 * or not.
 * 
 * @author Krishnakanth_Yachareni
 *
 */
public class DbManagerTest extends DatabaseTestCase {

    public static final String LOGIN_TABLE = "login";
    private FlatXmlDataSet loadedDataSet;

    @Override
    protected IDatabaseConnection getConnection() throws Exception {

        // loads the driver meant for testing purpose.
        Class.forName("com.mysql.jdbc.Driver");
        Connection jdbcConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/epamDB", "root", "root");
        // returns the Connection object.

        return new DatabaseConnection(jdbcConnection);
    }

    @Override
    protected IDataSet getDataSet() throws Exception {
        // loads the data from login.xml file.
        loadedDataSet = new FlatXmlDataSet(this.getClass().getClassLoader()
                .getResourceAsStream("login.xml"));
        return loadedDataSet;

    }

    /**
     * testLoginTableRead test reads the data from Login table and asserts that
     * the count is equal to 2.
     * @throws DataSetException
     */
    @Test
    public void readLoginTableTest() throws DataSetException {
        assertNotNull(loadedDataSet);
        assertThat(3, is(loadedDataSet.getTable(LOGIN_TABLE).getRowCount()));
    }
}
