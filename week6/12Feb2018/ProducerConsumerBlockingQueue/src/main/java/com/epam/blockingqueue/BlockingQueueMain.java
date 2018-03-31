/**
 * This is producer consumer example using Blocking Queue interface.
 */
package com.epam.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * This class has a main method to start the producer and consumer.
 */
public final class BlockingQueueMain {
    /**
     * Default Constructor.
     */
    private BlockingQueueMain() {
    }

    /**
     * @param args
     *            Command line arguments.
     */
    public static void main(final String[] args) {
        // Queue size.
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(9);
        Runnable producer = new Producer(queue);
        Runnable consumer = new Consumer(queue);
        new Thread(producer).start();
        new Thread(consumer).start();
        try {
            // 10 Seconds sleep
            TimeUnit.SECONDS.sleep(10);
            Test test = new Test(queue);
            test.execute();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
