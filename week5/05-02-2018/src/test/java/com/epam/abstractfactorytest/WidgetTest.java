/**
 * This is an Abstract Factory example.
 */
package com.epam.abstractfactorytest;

import org.junit.Test;

import com.epam.Demo;
import com.epam.WidgetFactoryCreator;

import junit.framework.TestCase;

/**
 * @author Krishnakanth_Yachare
 */
public class WidgetTest extends TestCase {
    /**
     * Windows OS Name.
     */
    private static final String WINDOWS_OS = "Windows 10";
    /**
     * Unix OS Name.
     */
    private static final String UNIX_OS = "Unix";

    /**
     * (non-Javadoc).
     * 
     * @see junit.framework.TestCase#setUp()
     * @throws Exception
     *             {@link Exception}.
     */
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * (non-Javadoc).
     * 
     * @see junit.framework.TestCase#tearDown()
     * @throws Exception
     *             {@link Exception}.
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * This method test windows widget creation.
     */
    @Test
    public void testWindowsWidget() {
        Demo demo = new Demo();
        WidgetFactoryCreator widget = demo.configureApp(WINDOWS_OS);
        assertEquals("Windows Button Windows CheckBox", widget.createWidget());
    }

    /**
     * This method test the Unix widget creation.
     */
    @Test
    public void testUnixWidget() {
        Demo demo = new Demo();
        WidgetFactoryCreator widget = demo.configureApp(UNIX_OS);
        assertEquals("Unix Button Unix CheckBox", widget.createWidget());
    }

    /**
     * This method test configureApp method can return NULL or not.
     */
    @Test
    public void testIsNull() {
        Demo demo = new Demo();
        assertNull(demo.configureApp(null));
    }
}
