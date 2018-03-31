/**
 * Autaparking application using database.
 */
package org.autoparking.service;

import static org.junit.Assert.assertTrue;

import org.autoparking.service.exception.InvalidParkingLotException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class UnParkTest {

    /**
     * {@link Unpark}
     */
    @InjectMocks
    Unpark unPark;

    /**
     * @throws InvalidParkingLotException
     */
    @Test
    public void testUnPark() throws InvalidParkingLotException {
        assertTrue(unPark.unPark("TS12345679"));
    }

    /**
     * @throws InvalidParkingLotException
     */
    @Test(expected = InvalidParkingLotException.class)
    public void invalidUnParkTest() throws InvalidParkingLotException {
        assertTrue(unPark.unPark("TS12345678"));
    }

}
