/**
 * This is an Abstract Factory example.
 */
package com.epam;

import com.epam.button.Button;
import com.epam.checkbox.CheckBox;
import com.epam.factories.Widget;

/**
 * @author Krishnakanth_Yachare
 */
public class WidgetFactoryCreator {
    /**
     * {@link Button} button interface.
     */
    private Button button;
    /**
     * {@link CheckBox} checkbox interface.
     */
    private CheckBox checkBox;

    /**
     * This constructor can initialize the {@link Button} and {@link CheckBox}
     * references.
     * @param widget
     *            {@link Widget}
     */
    public WidgetFactoryCreator(final Widget widget) {
        button = widget.createButton();
        checkBox = widget.createCheckBox();
    }

    /**
     * @return String Widget message for type of Operating System.
     */
    public String createWidget() {
        return button.buttonImplement() + " " + checkBox.checkBoxImplement();
    }
}
