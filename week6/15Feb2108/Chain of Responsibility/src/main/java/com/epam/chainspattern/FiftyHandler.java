/**
 * This is example of chain of responsibility design pattern.
 */
package com.epam.chainspattern;

/**
 * This class dispense 50 Rs notes.
 *
 */
public class FiftyHandler extends CurrencyHandler {
    /**
     * 50 Rs notes.
     */
    private static final long NOTES_50 = 50;

    /**
     * (non-Javadoc).
     * @see com.epam.chainspattern.CurrencyHandler#dispense(long)
     */
    @Override
    public void dispense(final long amount) {
        long numberofNotesToBeDispatched = amount / NOTES_50;
        if (numberofNotesToBeDispatched > 0) {
            System.out.println(
                    numberofNotesToBeDispatched + " notes 50 are dispatched");
        }
        long pendingAmountToBeProcessed = amount % NOTES_50;

        if (pendingAmountToBeProcessed > 0) {
            currencyHandler.dispense(pendingAmountToBeProcessed);
        }
    }

}
