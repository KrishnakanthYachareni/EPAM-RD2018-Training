/**
 * This is example of chain of responsibility design pattern.
 */
package com.epam.chainspattern;

/**
 * This class dispense 10 Rs notes.
 *
 */
public class TenHandler extends CurrencyHandler {
    /**
     * 10 Rs notes.
     */
    private static final long NOTES_10 = 10;

    /**
     * (non-Javadoc).
     * @see com.epam.chainspattern.CurrencyHandler#dispense(long)
     */
    @Override
    public void dispense(final long amount) {
        long numberofNotesToBeDispatched = amount / NOTES_10;
        if (numberofNotesToBeDispatched > 0) {
            System.out.println(
                    numberofNotesToBeDispatched + " notes 10 are dispatched");
        }
        long pendingAmountToBeProcessed = amount % NOTES_10;

        if (pendingAmountToBeProcessed > 0) {
            currencyHandler.dispense(pendingAmountToBeProcessed);
        }
    }

}
