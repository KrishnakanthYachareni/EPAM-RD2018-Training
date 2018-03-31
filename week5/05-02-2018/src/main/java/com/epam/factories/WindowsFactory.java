/**
 * This is an Abstract Factory example.
 */
package com.epam.factories;

import com.epam.button.WindowsButton;
import com.epam.checkbox.WindowsCheckBox;

/**
 * @author Krishnakanth_Yachare
 */
public class WindowsFactory implements Widget {

    /**
     * @see com.epam.factories.Widget#createButton()
     * @return instance of {@link WindowsButton}
     */
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    /**
     * @see com.epam.factories.Widget#createCheckBox()
     * @return {@link WindowsCheckBox}
     */
    public WindowsCheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

}
