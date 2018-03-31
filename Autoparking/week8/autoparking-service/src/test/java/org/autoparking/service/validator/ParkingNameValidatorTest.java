/**
 * This is autparking app test cases.
 */
package org.autoparking.service.validator;

import static org.junit.Assert.assertTrue;

import org.autoparking.api.exception.InvalidParkingLotException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ParkingNameValidatorTest {

    /**
     * {@link ParkingNameValidator} class injecting.
     */
    @InjectMocks
    private ParkingNameValidator pNameValidator;

    /**
     * @throws InvalidParkingLotException {@link InvalidParkingLotException}
     */
    @Test
    public void validNameTest() throws InvalidParkingLotException {
        boolean isBool = pNameValidator.validate("KRISHNAkanth");
        assertTrue(isBool);
    }

    /**
     * Junit exception rule.
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * @throws InvalidParkingLotException {@link InvalidParkingLotException}
     */
    @Test
    public void alphaNumericTest() throws InvalidParkingLotException {
        thrown.expect(InvalidParkingLotException.class);
        thrown.expectMessage("only alphanumeric");
        pNameValidator.validate("@kridnsh");
    }

    /**
     * @throws InvalidParkingLotException
     */
    @Test
    public void nameLengthTest() throws InvalidParkingLotException {
        thrown.expect(InvalidParkingLotException.class);
        thrown.expectMessage("only alphanumeric");
        pNameValidator.validate("abcdefghijklmnopqrstuvwxyzabcdef");
    }

}
