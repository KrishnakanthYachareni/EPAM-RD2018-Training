/**
 * 
 */
package org.autoparking.dao.connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

/**
 * @author Krishnakanth_Yachare
 *
 */
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import oracle.jdbc.pool.OracleDataSource;

/**
 * @author Krishnakanth Yachareni
 *
 */
public final class DataSourceFactory {

    /**
     * Logging initialization.
     */
    private static final Logger LOGGER = Logger
            .getLogger(DataSourceFactory.class);

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
        LOGGER.info("getMySQLDataSource() start executing");
        Properties properties = new Properties();
        FileInputStream fis = null;
        MysqlDataSource mysqlDatasource = null;

        try {
            fis = new FileInputStream("I://db.properties");
            properties.load(fis);
            mysqlDatasource = new MysqlDataSource();
            mysqlDatasource.setURL(properties.getProperty("MYSQL_DB_URL"));
            mysqlDatasource
                    .setUser(properties.getProperty("MYSQL_DB_USERNAME"));
            mysqlDatasource
                    .setPassword(properties.getProperty("MYSQL_DB_PASSWORD"));
        } catch (IOException e) {
            LOGGER.error(e);
        }
        LOGGER.info("getMySQLDataSource() execution end");
        return mysqlDatasource;
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
