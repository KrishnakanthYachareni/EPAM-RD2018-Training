/**
 * This is example of chain of responsibility design pattern.
 */
package com.epam.chainspattern;

/**
 * This class dispense 20 Rs notes.
 *
 */
public class TwentyHandler extends CurrencyHandler {
    /**
     * 20 Rs notes.
     */
    private static final long NOTES_20 = 20;

    /**
     * (non-Javadoc).
     * @see com.epam.chainspattern.CurrencyHandler#dispense(long)
     */
    @Override
    public void dispense(final long amount) {
        long numberofNotesToBeDispatched = amount / NOTES_20;
        if (numberofNotesToBeDispatched > 0) {
            System.out.println(
                    numberofNotesToBeDispatched + " notes 20 are dispatched");
        }
        long pendingAmountToBeProcessed = amount % NOTES_20;
        if (pendingAmountToBeProcessed > 0) {
            currencyHandler.dispense(pendingAmountToBeProcessed);
        }
    }

}
