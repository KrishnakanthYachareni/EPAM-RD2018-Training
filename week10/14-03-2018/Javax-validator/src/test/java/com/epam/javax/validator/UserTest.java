/**
 * This is a simple javax validator example.
 */
package com.epam.javax.validator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class UserTest {

    /**
     * {@link ValidatorFactory} interface to create the validator factory.
     */
    private ValidatorFactory factory;

    /**
     * {@link Validator} an interface.
     */
    private Validator validator;

    @InjectMocks
    User user;

    @Before
    public void setUp() {
        factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void invalidNameTest() {

        user.setUsername(null);
        user.setPassword("krishna");

        assertThat(validator.validate(user).size(), is(1));
    }

    @Test
    public void invalidPasswordTest() {

        user.setUsername("Krishna");
        user.setPassword("12345");

        assertThat(validator.validate(user).size(), is(1));
    }

    @Test
    public void invalidNamePasswordTest() {

        user.setUsername(null);
        user.setPassword("12345");

        assertThat(validator.validate(user).size(), is(2));
    }

}
