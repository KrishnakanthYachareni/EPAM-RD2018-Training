/**
 * This is producer consumer example using Blocking Queue interface.
 */
package com.epam.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * This class has methods to start the process.
 */
public class Test {

    /**
     * BlockingQueue.
     */
    private BlockingQueue<String> queue;

    /**
     * @param queu
     *            BlockingQueue.
     */
    public Test(final BlockingQueue<String> queu) {
        this.queue = queu;
    }

    /**
     * This method will call the thread to start the process.
     */
    public void execute() {
        Runnable test = new Producer(queue);
        new Thread(test).start();
    }
}
