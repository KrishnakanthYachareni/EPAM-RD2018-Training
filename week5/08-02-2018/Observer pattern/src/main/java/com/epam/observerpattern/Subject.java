/**
 * This is an observer pattern example.
 */
package com.epam.observerpattern;

/**
 * This is an Subject interface can have methods to register, unregister, notify
 * the observer.
 * @author Krishnakanth Yachareni.
 *
 */
public interface Subject {
    /**
     * @param observer
     *            {@link Observer}interface reference.
     */
    void registerObserver(Observer observer);

    /**
     * This is the method can notify the operations.
     */
    void notifyObserver();

    /**
     * This is method can unregister the Observer.
     * @param observer
     *            {@link Observer}interface reference.
     */
    void unRegisterObserver(Observer observer);

    /**
     * @return Object.
     */
    Object getUpdate();
}
