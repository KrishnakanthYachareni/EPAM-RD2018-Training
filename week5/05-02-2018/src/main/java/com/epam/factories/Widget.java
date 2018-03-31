/**
 * This is an Abstract Factory example.
 */
package com.epam.factories;

import com.epam.button.Button;
import com.epam.checkbox.CheckBox;

/**
 * @author Krishnakanth_Yachare
 */
public interface Widget {
    /**
     * @return {@link Button} reference.
     */
    Button createButton();

    /**
     * @return {@link CheckBox} reference.
     */
    CheckBox createCheckBox();
}
