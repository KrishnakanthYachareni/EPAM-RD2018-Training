/**
 * This is an Abstract Factory example.
 */
package com.epam.button;

/**
 * @author Krishnakanth_Yachare
 */
public class WindowsButton implements Button {

    /**
     * This is method where Windows button implementation.
     * @see com.epam.abstractfactory.Button#buttonImplement()
     * @return String message about button.
     */
    public String buttonImplement() {
        return "Windows Button";
    }
}
