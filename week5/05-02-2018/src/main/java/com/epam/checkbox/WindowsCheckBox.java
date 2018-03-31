/**
 * This is an Abstract Factory example.
 */
package com.epam.checkbox;

/**
 * The {@link WindowsCheckBox} class can implement the windows checkbox
 * implementation.
 * @author Krishnakanth_Yachare
 */
public class WindowsCheckBox implements CheckBox {
    /**
     * This is method where Windows button implementation.
     * @see com.epam.abstractfactory.Button#buttonImplement()
     * @return String message about CheckBox.
     */
    public String checkBoxImplement() {
        return "Windows CheckBox";
    }

}
