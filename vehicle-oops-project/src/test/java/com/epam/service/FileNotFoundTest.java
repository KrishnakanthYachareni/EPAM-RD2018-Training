/**
 * This is test case for {@link CsvParser}
 */
package com.epam.service;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.epam.exception.InvalidPropertiesException;
import com.epam.exception.NoVehicleFoundException;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class FileNotFoundTest {

    /**
     * Method to test file exists or not.
     * @throws InvalidPropertiesException
     *             {@link InvalidPropertiesException}
     * @throws NoVehicleFoundException
     *             {@link NoVehicleFoundException}
     * @throws FileNotFoundException
     *             {@link FileNotFoundException}
     */
    @Test(expected = NoVehicleFoundException.class)
    public void invalidCommandTest() throws FileNotFoundException,
            NoVehicleFoundException, InvalidPropertiesException {
        CsvParser csvParser = new CsvParser();
        csvParser.parseVehicle("sghsdv");
    }
}
