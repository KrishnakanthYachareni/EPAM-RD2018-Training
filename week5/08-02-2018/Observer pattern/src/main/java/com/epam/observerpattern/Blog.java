/**
 * This is an observer pattern example.
 */
package com.epam.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The Blog is implements the {@link Subject} interface.
 * @see {@link Subject} methods for more.
 * @author Krishnakanth Yachareni
 *
 */
public class Blog implements Subject {

    /**
     * {@link Observer} ArrayList.
     */
    private List<Observer> observersList;
    /**
     * Boolean variable to indicate state change.
     */
    private boolean stateChange;

    /**
     * This constructor can initialize array list with observer references. and
     * state change variable state false.
     */
    public Blog() {
        this.observersList = new ArrayList<Observer>();
        stateChange = false;
    }

    /**
     * (non-Javadoc).
     * @see com.epam.observerpattern.Subject#registerObserver(com.epam.
     *      observerpattern.Observer)
     * @param observer
     *            {@link Observer}
     */
    public void registerObserver(final Observer observer) {
        observersList.add(observer);
    }

    /**
     * (non-Javadoc).
     * @see com.epam.observerpattern.Subject
     *      #unRegisterObserver(com.epam.observerpattern.Observer)
     * @param observer
     *            {@link Observer}
     */
    public void unRegisterObserver(final Observer observer) {
        observersList.remove(observer);
    }

    /**
     * (non-Javadoc).
     * @see com.epam.observerpattern.Subject#notifyObserver()
     */
    public void notifyObserver() {

        if (stateChange) {
            for (Observer observer : observersList) {
                observer.update();
            }
        }
    }

    /**
     * (non-Javadoc).
     * @see com.epam.observerpattern.Subject#getUpdate()
     * @return boolean changedState.
     */
    public Object getUpdate() {
        Object changedState = null;
        // should have logic to send the
        // state change to querying observer
        if (stateChange) {
            changedState = "Observer Design Pattern";
        }
        return changedState;
    }

    /**
     * This method can set the state to true and then call the notifyObserver
     * method.
     */
    public void postNewArticle() {
        stateChange = true;
        notifyObserver();
    }
}
