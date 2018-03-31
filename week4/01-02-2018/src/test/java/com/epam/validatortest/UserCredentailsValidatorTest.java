/**
 * This is a basic user validation J unit example.
 */
package com.epam.validatortest;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.epam.junit.exceptions.InvalidAgeException;
import com.epam.junit.exceptions.InvalidCredentialsException;
import com.epam.junit.validators.AgeValidation;
import com.epam.junit.validators.PasswordValidation;
import com.epam.junit.validators.UseNameValidation;
import com.epam.junit.validators.UserCredentialsValidator;

/**
 * @author Krishnakanth_Yachare
 */
public class UserCredentailsValidatorTest {

    /**
     * {@link UserCredentialsValidator} reference.
     */
    private UserCredentialsValidator userCredentialsValidator;

    /**
     * Invalid credential exception message.
     */
    private static final String
    INVALID_CREDENTIALS_EXCEPTION_MESSAGE = "Invalid Credentials";

    /**
     * Invalid Age exception.
     */
    private static final String INVALID_AGE_EXCEPTION_MESSAGE = "Invalid AGE";

    /**
     * Valid user name.
     */
    private static final String VALID_USER_NAME = "krishna";

    /**
     * Valid password.
     */
    private static final String VALID_PASSWORD = "Krishnakanth123";

    /**
     * Valid age.
     */
    private static final int VALID_AGE = 21;

    /**
     * @throws java.lang.Exception
     *             {@link Exception}
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     *             {@link Exception}
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * This method create object for {@link UserCredentailsValidator} class
     * every time when class is call.
     * @throws java.lang.Exception
     *             {@link Exception}
     */
    @Before
    public void setUp() throws Exception {
        userCredentialsValidator = new UserCredentialsValidator(
                new UseNameValidation(), new AgeValidation(),
                new PasswordValidation());
    }

    /**
     * @throws java.lang.Exception
     *             {@link Exception}
     */
    @After
    public void tearDown() throws Exception {
    }

    /*
     * ************** Valid Credentials Test ***************
     */

    /**
     * This method test for valid credentials only.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void validCredentialsTest()
            throws InvalidCredentialsException, InvalidAgeException {
        userCredentialsValidator.isValidCredentials(VALID_USER_NAME, VALID_AGE,
                VALID_PASSWORD);
        assertTrue(true);
    }

    /**
     * This is Junit rule to expect the Exception in a TestCase.
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    /*
     * ***************** User name test **************************
     */

    /**
     * This method test the special symbols(user name should not contains the
     * special symbols).
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidUserNameSpecialSymbolsTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidUserName = "krishn@";
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(invalidUserName, VALID_AGE,
                VALID_PASSWORD);

    }

    /**
     * This method checks the user name should not contain upper case letter.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidUserNameUpperCaseTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidUserName = "Krishna";
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(invalidUserName, VALID_AGE,
                VALID_PASSWORD);

    }

    /**
     * This method test user name should not have numbers.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */

    @Test
    public void invalidUserNameNumberTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidUserName = "kris12";
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(invalidUserName, VALID_AGE,
                VALID_PASSWORD);

    }

    /**
     * This method test user name should not contain space.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidUserNameSpaceTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidUserName = "kris hn";
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(invalidUserName, VALID_AGE,
                VALID_PASSWORD);

    }

    /**
     * This method test user name length should not be less than 5.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidUserNameMinLengthTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidUserName = "kri";
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(invalidUserName, VALID_AGE,
                VALID_PASSWORD);

    }

    /**
     * This method test user name length should not be more than 8.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidUserNameMaxLengthTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidUserName = "krishnakanth";
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);

        userCredentialsValidator.isValidCredentials(invalidUserName, VALID_AGE,
                VALID_PASSWORD);

    }

    /**
     * This method test user name should not be NULL.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidUserNameisNullTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidUserName = null;
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);

        userCredentialsValidator.isValidCredentials(invalidUserName, VALID_AGE,
                VALID_PASSWORD);

    }
    /*
     * ******************* Password test ***************************
     */

    /**
     * This method test the password should not contain the special symbols.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidPasswordSpecialSymbolsTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidPassword = "krishna@";
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(VALID_USER_NAME, VALID_AGE,
                invalidPassword);

    }

    /**
     * This method test password should not contain space.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidPasswordSpaceTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidPassword = "krishna kant12";
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(VALID_USER_NAME, VALID_AGE,
                invalidPassword);

    }

    /**
     * This method test password length should not be less than 8.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidPasswordMinLengthTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidPassword = "kris";
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(VALID_USER_NAME, VALID_AGE,
                invalidPassword);

    }

    /**
     * This method test password length should not be more than 20.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidPasswordMaxLengthTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidPassword = "Yacahrenikrishnakanth";
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(VALID_USER_NAME, VALID_AGE,
                invalidPassword);
    }

    /**
     * This method test password should not be NULL.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidPasswordIsNullTest()
            throws InvalidCredentialsException, InvalidAgeException {
        final String invalidPassword = null;
        thrown.expect(InvalidCredentialsException.class);
        thrown.expectMessage(INVALID_CREDENTIALS_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(VALID_USER_NAME, VALID_AGE,
                invalidPassword);
    }

    /*
     * *************** Age Test *************************
     */
    /**
     * This method test age should not be less than 16.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidMinAgeException()
            throws InvalidCredentialsException, InvalidAgeException {
        final int invalidAge = 15;
        thrown.expect(InvalidAgeException.class);
        thrown.expectMessage(INVALID_AGE_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(VALID_USER_NAME, invalidAge,
                VALID_PASSWORD);
    }

    /**
     * This method test age should not be more than 60.
     * @throws InvalidCredentialsException
     *             {@link InvalidCredentialsException}
     * @throws InvalidAgeException
     *             {@link InvalidAgeException}
     */
    @Test
    public void invalidMaxAgeException()
            throws InvalidCredentialsException, InvalidAgeException {
        final int invalidAge = 61;
        thrown.expect(InvalidAgeException.class);
        thrown.expectMessage(INVALID_AGE_EXCEPTION_MESSAGE);
        userCredentialsValidator.isValidCredentials(VALID_USER_NAME, invalidAge,
                VALID_PASSWORD);

    }
}
