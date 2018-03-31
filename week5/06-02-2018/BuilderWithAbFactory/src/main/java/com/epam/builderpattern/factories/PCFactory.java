/**
 * This an example for builder pattern using abstract factory.
 */
package com.epam.builderpattern.factories;

import com.epam.builderpattern.PC;

/**
 * This is factory class for {@link PC}.
 * @author Krishnakanth Yachreni
 *
 */
public class PCFactory {
    /**
     * @param hdd
     *            harddisk.
     * @param ram
     *            RAM.
     * @param processor
     *            Processor.
     * @return {@link PC } class object reference.
     */
    public PC createPC(final String hdd, final String ram,
            final String processor) {
        return new PC.PCBuilder().setHdd(hdd).setRam(ram)
                .setProcessor(processor).buildPC();
    }
}
