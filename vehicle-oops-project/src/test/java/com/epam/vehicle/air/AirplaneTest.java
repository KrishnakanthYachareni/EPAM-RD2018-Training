/**
 * This program is for junit testcase for AirplaneTest.
 */
package com.epam.vehicle.air;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.epam.exception.InvalidPropertiesException;
import com.epam.exception.NoVehicleFoundException;
import com.epam.service.CsvParser;
import com.epam.service.VehicleServiceManager;
import com.epam.vehicle.Vehicle;

/**
 * @author Krishnakanth_Yachareni
 */
public class AirplaneTest {

    /**
     * @throws java.lang.Exception
     */
    /**
     * @throws Exception
     *             exception message.
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws FileNotFoundException
     *             exception message.
     * @throws NoVehicleFoundException
     *             exception message.ss
     * @throws InvalidPropertiesException
     *             {@link InvalidPropertiesException}
     */
    @Test
    public void test() throws FileNotFoundException, NoVehicleFoundException,
            InvalidPropertiesException {
        VehicleServiceManager serviceManager = new VehicleServiceManager();
        CsvParser csvParser = new CsvParser();
        List<List<String>> vehicleList = csvParser.parseVehicle("Airplane");
        for (List<String> vehicleProperty : vehicleList) {
            Vehicle vehicleObj = serviceManager
                    .getVehicleObject(vehicleProperty);
            assertTrue(vehicleObj instanceof Vehicle);
        }
    }
}
