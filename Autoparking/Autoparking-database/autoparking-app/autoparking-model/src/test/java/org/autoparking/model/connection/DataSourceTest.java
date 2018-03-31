package org.autoparking.model.connection;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;

import org.autoparking.dao.connection.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DataSourceTest {
    @InjectMocks
    DataSource dataSource;

    @Test
    public void dataSourceTest() throws SQLException {
        Connection con = dataSource.getConnection();
        con.close();
        assertTrue(con.isClosed());
    }

}
