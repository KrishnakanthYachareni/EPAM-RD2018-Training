/**
 * This is an Abstract Factory example.
 */
package com.epam;

import com.epam.factories.UnixFactory;
import com.epam.factories.Widget;
import com.epam.factories.WindowsFactory;

/**
 * The Demo class that can return corresponding OS widget reference.
 * @author Krishnakanth_Yachare
 */
public class Demo {

    /**
     * This method check type of OS and then return corresponding class object.
     * @param osName
     *            String type of Operating System.
     * @return {@link WidgetFactoryCreator} reference.
     */
    public WidgetFactoryCreator configureApp(final String osName) {
        WidgetFactoryCreator widget;
        Widget factory;
        // Checking for null reference.
        if (osName == null) {
            return null;
        } else if (osName.equalsIgnoreCase("Windows 10")) {
            // Windows widget reference
            factory = new WindowsFactory();
            widget = new WidgetFactoryCreator(factory);
        } else {
            // Unix widget reference.
            factory = new UnixFactory();
            widget = new WidgetFactoryCreator(factory);
        }
        return widget;
    }
}