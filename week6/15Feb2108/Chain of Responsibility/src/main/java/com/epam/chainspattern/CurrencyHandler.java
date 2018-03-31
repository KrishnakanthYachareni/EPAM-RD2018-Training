/**
 * This is example of chain of responsibility design pattern.
 */
package com.epam.chainspattern;

/**
 * @author Krishnakanth
 *
 */
public abstract class CurrencyHandler {
    /**
     * @see {@link CurrencyHandler} reference.
     */
    public CurrencyHandler currencyHandler;

    /**
     * @param currencHandler
     *            reference.
     */
    public void nextHandler(final CurrencyHandler currencHandler) {
        this.currencyHandler = currencHandler;
    }

    /**
     * @param amount
     *            amount to be dispense.
     */
    public abstract void dispense(long amount);
}
