/**
 * This is producer consumer example using Blocking Queue interface.
 */
package com.epam.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * This is producer implementation.
 */
public class Producer implements Runnable {

    /**
     * BlockingQueue.
     */
    private BlockingQueue<String> queue;

    /**
     * @param queu
     *            BlockingQueue.
     */
    public Producer(final BlockingQueue<String> queu) {
        this.queue = queu;
    }

    @Override
    public final void run() {
        try {
            queue.put("Resource 1");
            TimeUnit.SECONDS.sleep(2);
            queue.put("Resource 2");
            TimeUnit.SECONDS.sleep(2);
            queue.put("Resource 3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
