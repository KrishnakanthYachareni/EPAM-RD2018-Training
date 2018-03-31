/**
 * This is a simple logger web application.
 */
package com.epam.autoparking.listener;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Krishnakanth
 *
 */
@WebListener("application context listener")
public class ContextListener implements ServletContextListener {

    /**
     * Initialize log4j when the application is being started.
     * @param event
     *            event.
     */
    public void contextInitialized(final ServletContextEvent event) {
        // initialize log4j here
        ServletContext context = event.getServletContext();
        String log4jConfigFile = context
                .getInitParameter("log4j-config-location");
        String fullPath = context.getRealPath("") + File.separator
                + log4jConfigFile;
        //PropertyConfigurator.configure(fullPath);
    }

    /**
     * (non-Javadoc).
     * @see javax.servlet.ServletContextListener#contextDestroyed
     * (javax.servlet.ServletContextEvent)
     * @param event event.
     */
    public void contextDestroyed(final ServletContextEvent event) {
        // do nothing
    }
}
