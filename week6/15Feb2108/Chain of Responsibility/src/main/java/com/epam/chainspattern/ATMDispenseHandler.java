/**
 * This is example of chain of responsibility design pattern.
 */
package com.epam.chainspattern;

import com.epam.chainspattern.exception.InvalidAmountException;

/**
 * @author Krishnakanth Yachareni
 *
 */
public class ATMDispenseHandler {

    /**
     * @see {@link HundredHandler}.
     */
    private HundredHandler hundredHandler;
    /**
     * @see {@link FiftyHandler}.
     */
    private FiftyHandler fiftyHandler;
    /**
     * @see {@link TwentyHandler}.
     */
    private TwentyHandler twentyHandler;
    /**
     * @see {@link TenHandler}.
     */
    private TenHandler tenHandler;

    /**
     * Default constructor.
     */
    public ATMDispenseHandler() {
        hundredHandler = new HundredHandler();
        fiftyHandler = new FiftyHandler();
        twentyHandler = new TwentyHandler();
        tenHandler = new TenHandler();
        hundredHandler.nextHandler(fiftyHandler);
        fiftyHandler.nextHandler(twentyHandler);
        twentyHandler.nextHandler(tenHandler);
    }

    /**
     * @param amount
     *            amount to be dispatched.
     * @throws InvalidAmountException
     *             {@link InvalidAmountException}.
     */
    public void withdrawAmount(final long amount)
            throws InvalidAmountException {
        final int multiple = 10;
        if (amount % multiple != 0) {
            throw new InvalidAmountException(
                    "Amount should be in multiple of 10");
        } else if (amount <= 0) {
            throw new InvalidAmountException("Amount should be positive");
        } else {
            hundredHandler.dispense(amount);
        }
    }
}
