/**
 * This is a simple login example.
 */
package org.login.dao.datasource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

/**
 * This class can create the DataSource.
 * 
 * @author Krishnakanth Yachareni
 *
 */
public final class DataSourceFactory {

    /**
     * Logging initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(DataSourceFactory.class);

    /**
     * Default constructor.
     */
    private DataSourceFactory() {
        // Nothing to do.
    }

    /**
     * This method can get the MySQL database credentials from the properties file and it can make the Data source then
     * it will return.
     * 
     * @return MySQL Data source.
     */
    public static DataSource getMySQLDataSource() {

        LOGGER.info("getMySQLDataSource() start executing");

        Properties properties = new Properties();
        FileInputStream fis = null;
        MysqlDataSource mysqlDatasource = null;

        try {
            fis = new FileInputStream("src/main/resources/db.properties");
            properties.load(fis);
            mysqlDatasource = new MysqlDataSource();
            mysqlDatasource.setURL(properties.getProperty("MYSQL_DB_URL"));
            mysqlDatasource.setUser(properties.getProperty("MYSQL_DB_USERNAME"));
            mysqlDatasource.setPassword(properties.getProperty("MYSQL_DB_PASSWORD"));
        } catch (IOException e) {
            LOGGER.error(e);
        }
        LOGGER.info("getMySQLDataSource() execution end");

        return mysqlDatasource;
    }
}
