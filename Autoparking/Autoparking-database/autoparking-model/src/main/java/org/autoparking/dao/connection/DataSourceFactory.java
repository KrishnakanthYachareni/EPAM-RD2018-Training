/**
 * Autaparking application using database.
 */
package org.autoparking.dao.connection;

/**
 * @author Krishnakanth_Yachare
 *
 */
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
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
    private static final Logger LOGGER = Logger.getLogger(DataSourceFactory.class);

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
            fis = new FileInputStream("D://db.properties");
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
