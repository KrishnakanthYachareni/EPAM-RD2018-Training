/**
 * This is an Abstract Factory example.
 */
package com.epam.checkbox;

/**
 * @author Krishnakanth_Yachare
 */
public class UnixCheckBox implements CheckBox {
    /**
     * This is method where Unix button implementation.
     * @see com.epam.checkbox.CheckBox#checkBoxImplement()
     * @return String message about CheckBox.
     */
    public String checkBoxImplement() {
        return "Unix CheckBox";
    }

}
