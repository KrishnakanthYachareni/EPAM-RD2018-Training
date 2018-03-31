/**
 * This is basic Junit Testing example.
 */
package com.epam.junitcase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.junit.AgeValidation;

/**
 * The AgeValidation class test the persons age.
 * @author Krishnakanth Yachareni
 */
public class AgeValidationTest {
    /**
     * This method test the age.Requirement: age should be within the range 16
     * -60.
     */
    @Test
    public void test() {
        final int belowAge = 10;
        final int aboveAge = 70;
        final int validAge = 21;
        AgeValidation age = new AgeValidation();
        assertFalse("Invalid,age should not be below 16",
                age.ageValidation(belowAge));
        assertFalse("Invalid,age should not be more than 60",
                age.ageValidation(aboveAge));
        assertTrue("Valid age", age.ageValidation(validAge));
    }

}
