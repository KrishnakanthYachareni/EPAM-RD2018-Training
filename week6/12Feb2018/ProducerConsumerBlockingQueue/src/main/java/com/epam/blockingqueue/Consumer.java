/**
 * This is producer consumer example using Blocking Queue interface.
 */
package com.epam.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * This is consumer class implementation.
 */
public class Consumer implements Runnable {

    /**
     * BlockingQueue.
     */
    private BlockingQueue<?> queue;

    /**
     * @param queu
     *            BlockingQueue
     */
    public Consumer(final BlockingQueue<?> queu) {
        this.queue = queu;
    }

    @Override
    public final void run() {
        try {
            System.out.println("1 " + queue.take());
            System.out.println("2 " + queue.take());
            System.out.println("3 " + queue.take());
            System.out.println("4 " + queue.take());
            System.out.println("5 " + queue.take());
            System.out.println("6 " + queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
