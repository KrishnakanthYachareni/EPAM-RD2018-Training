/**
 * This an example for builder pattern using abstract factory.
 */
package com.epam.builderpattern.factories;

import com.epam.builderpattern.Laptop;

/**
 * This is a factory class {@link Laptop}.
 * @author Krishnakanth Yachareni
 *
 */
public class LaptopFactory {
    /**
     * @param hdd
     *            harddisk.
     * @param ram
     *            RAM.
     * @param processor
     *            Processor.
     * @param wifi
     *            Wifi.
     * @return {@link Laptop } class object reference.
     */
    public Laptop createLaptop(final String hdd, final String ram,
            final String processor, final boolean wifi) {
        return new Laptop.LaptopBuilder().setHdd(hdd).setRam(ram)
                .setProcessor(processor).setWifi(wifi).buildLaptop();
    }
}
