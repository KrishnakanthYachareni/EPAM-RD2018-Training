/**
 * This autoparking test cases.
 */
package org.autoparking.service.validator;

import static org.junit.Assert.assertTrue;

import org.autoparking.service.exception.InvalidRegistrationNumberException;
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
public class RegNumberValidatorTest {

    /**
     * {@link RegNumberValidator}.
     */
    @InjectMocks
    private RegNumberValidator regValidator;

    /**
     * @throws InvalidRegistrationNumberException
     */
    @Test
    public void validRegNumberTest() throws InvalidRegistrationNumberException {
        assertTrue(regValidator.validate("TS12345678"));
    }

    /**
     * Junit Exception initialize.
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * @throws InvalidRegistrationNumberException
     */
    @Test
    public void lengthTest() throws InvalidRegistrationNumberException {
        thrown.expect(InvalidRegistrationNumberException.class);
        thrown.expectMessage("length should be 10");
        regValidator.validate("Ts1234");
    }

    /**
     * @throws InvalidRegistrationNumberException
     */
    @Test
    public void emptyRegNumberTest() throws InvalidRegistrationNumberException {
        thrown.expect(InvalidRegistrationNumberException.class);
        thrown.expectMessage("should not be empty");
        regValidator.validate("");
    }

    @Test
    public void minDigitsTest() throws InvalidRegistrationNumberException {
        thrown.expect(InvalidRegistrationNumberException.class);
        thrown.expectMessage("have atleast two digits");
        regValidator.validate("AB1DEFGHIJ");
    }
}
