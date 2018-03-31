/**
 * This is an observer pattern example.
 */
package com.epam.observerpattern;

/**
 * This is an Observer interface.
 * @author Krishnakanth Yachareni
 *
 */
public interface Observer {
    /**
     * Observer update method.
     */
    void update();

    /**
     * @param subject
     *            {@link Subject}
     */
    void setSubject(Subject subject);
}
