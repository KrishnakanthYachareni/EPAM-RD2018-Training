/**
 * This is basic Junit Testing example.
 */
package com.epam.junit;

/**
 * The AgeValidation class validates person age.
 * @author Krishnakanth Yachareni.
 *
 */
public class AgeValidation {
    /**
     * Minimum age limit.
     */
    private static final int MIN_AGE_LIMIT = 16;
    /**
     * Maximum age limit.
     */
    private static final int MAX_AGE_LIMIT = 60;

    /**
     * @param age
     *            person age.
     * @return true or false.It returns true if age is in between 16 to
     *         60.Otherwise will return false.
     */
    public boolean ageValidation(final int age) {
        boolean bool = true;
        if (age < MIN_AGE_LIMIT || age > MAX_AGE_LIMIT) {
            bool = false;
        }
        return bool;
    }
}
