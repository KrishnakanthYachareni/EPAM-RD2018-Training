/**
 * This is an Abstract Factory example.
 */
package com.epam.button;

/**
 * The {@link UnixButton} class can implement the unix button.
 * @author Krishnakanth_Yachare
 */
public class UnixButton implements Button {

    /**
     * This is method where Unix button implementation.
     * @see com.epam.abstractfactory.Button#buttonImplement()
     * @return String message about button.
     */
    public String buttonImplement() {
        return "Unix Button";
    }

}
