/**
 * This is example of chain of responsibility design pattern.
 */
package com.epam.chainspattern;

/**
 * This class dispense 100 Rs notes.
 *
 */
public class HundredHandler extends CurrencyHandler {
    /**
     * 100 Rs notes.
     */
    private static final long NOTES_100 = 100;

    /**
     * (non-Javadoc).
     * @see com.epam.chainspattern.CurrencyHandler#dispense(long)
     */
    @Override
    public void dispense(final long amount) {
        long numberofNotesToBeDispatched = amount / NOTES_100;
        if (numberofNotesToBeDispatched > 0) {
            System.out.println(
                    numberofNotesToBeDispatched + " notes 100 are dispatched");
        }
        long pendingAmountToBeProcessed = amount % NOTES_100;
        if (pendingAmountToBeProcessed > 0) {
            currencyHandler.dispense(pendingAmountToBeProcessed);
        }
    }
}
