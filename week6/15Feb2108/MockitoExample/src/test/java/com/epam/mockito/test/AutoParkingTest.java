/**
 * This is an example Mockito Spy Testing
 */
package com.epam.mockito.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.epam.mockito.ReadData;
import com.epam.mockito.VehicleManager;

/**
 * This class test the autoparking application.
 * @author Krishnakanth
 *
 */
public class AutoParkingTest {

    /**
     * {@link VehicleManager}.
     */
    private VehicleManager vehicleManager;

    /**
     * Spying {@link ReadData} class.
     */
    @Spy
    private ReadData read = new ReadData();

    /**
     * {@link MockitoRule}.
     */
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    /**
     * Junit SetUp method.It can Spy the {@link ReadData} class method.
     */
    @Before
    public void setup() {
        vehicleManager = new VehicleManager();
        vehicleManager.setvehicleDetails(read);
        when(read.getvehicleDetails()).thenReturn("TS12345678_20:02:2018");
    }

    /**
     * Testing the vehcile details.
     */
    @Test
    public void testVehicleDetails() {
        String vehicleDetails = vehicleManager.getvehicleDetails();
        assertEquals("TS12345678_20:02:2018", vehicleDetails);
    }
}
