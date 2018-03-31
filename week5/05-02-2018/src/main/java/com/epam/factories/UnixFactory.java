/**
 * This is an Abstract Factory example.
 */
package com.epam.factories;

import com.epam.button.Button;
import com.epam.button.UnixButton;
import com.epam.checkbox.CheckBox;
import com.epam.checkbox.UnixCheckBox;

/**
 * @author Krishnakanth_Yachare
 */
public class UnixFactory implements Widget {

    /**
     * @see com.epam.factories.Widget#createButton()
     * @return instance of {@link UnixButton}
     */
    public Button createButton() {
        return new UnixButton();
    }

    /**
     * @see com.epam.factories.Widget#createCheckBox()
     * @return instance of {@link UnixButton}
     */
    public CheckBox createCheckBox() {
        return new UnixCheckBox();
    }

}
