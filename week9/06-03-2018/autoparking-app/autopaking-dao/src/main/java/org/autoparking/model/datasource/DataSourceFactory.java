/**
 * This application is example datasource for MYSQL database.
 */
package org.autoparking.model.datasource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import oracle.jdbc.pool.OracleDataSource;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

/**
 * @author Krishnakanth Yachareni
 *
 */
public final class DataSourceFactory {

    /**
     * Logging initialization.
     */
    private static final Logger LOGGER =
            Logger.getLogger(DataSourceFactory.class);

    /**
     * Default constructor.
     */
    private DataSourceFactory() {
        // Nothing to do
    }

    /**
     * This method can set the MySQL data source.
     * 
     * @return MySQL Data source.
     */
    public static DataSource getMySQLDataSource() {
        Properties props = new Properties();
        FileInputStream fis = null;
        MysqlDataSource mysqlDS = null;

        try {
            fis = new FileInputStream("D://db.properties");
            props.load(fis);
            mysqlDS = new MysqlDataSource();
            mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
            mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
            mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return mysqlDS;
    }

    /**
     * This method can set the MySQL data source.
     * 
     * @return Oracle Data source.
     */
    public static DataSource getOracleDataSource() {
        Properties props = new Properties();
        FileInputStream fis = null;
        OracleDataSource oracleDS = null;
        try {
            fis = new FileInputStream("src/main/resources/db.properties");
            props.load(fis);
            oracleDS = new OracleDataSource();
            oracleDS.setURL(props.getProperty("ORACLE_DB_URL"));
            oracleDS.setUser(props.getProperty("ORACLE_DB_USERNAME"));
            oracleDS.setPassword(props.getProperty("ORACLE_DB_PASSWORD"));
        } catch (SQLException | IOException e) {
            LOGGER.error(e);
        }
        return oracleDS;
    }
}
