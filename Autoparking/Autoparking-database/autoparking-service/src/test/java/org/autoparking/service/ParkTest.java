/**
 * Autaparking application using database.
 */
package org.autoparking.service;

import static org.junit.Assert.assertTrue;

import org.autoparking.model.Vehicle;
import org.autoparking.service.exception.InvalidParkingLotException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ParkTest {

    /**
     * {@link Park}
     */
    @InjectMocks
    Park park;

    /**
     * @throws InvalidParkingLotException
     */
    @Test
    public void testPark() throws InvalidParkingLotException {
        Vehicle vehicle = new Vehicle();
        vehicle.setRegistrationID("TS123456");
        assertTrue(park.park(vehicle));
    }

    /**
     * @throws InvalidParkingLotException
     */
    @Test(expected = InvalidParkingLotException.class)
    public void invalidParkTest() throws InvalidParkingLotException {
        Vehicle vehicle = new Vehicle();
        vehicle.setRegistrationID("TS12345");
        assertTrue(park.park(vehicle));
    }

}
