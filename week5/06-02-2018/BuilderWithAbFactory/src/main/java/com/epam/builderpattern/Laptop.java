/**
 * This an example for builder pattern using abstract factory.
 */
package com.epam.builderpattern;

/**
 * This Laptop class is having specifications of Laptop.
 * @author Krishnakanth Yachareni
 *
 */
public class Laptop {
    /**
     * Lap top RAM.
     */
    private String ram;
    /**
     * Laptop Hard Disk.
     */
    private String hdd;
    /**
     * Laptop processor.
     */
    private String processor;
    /**
     * Laptop wifi Enable or disable.
     */
    private boolean isWifiEnable;

    /**
     * This constructor can initialize the above specifications.
     * @param builder
     *            {@link LaptopBuilder} class reference.
     */
    public Laptop(final LaptopBuilder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.processor = builder.processor;
        this.isWifiEnable = builder.isWifiEnable;
    }

    /**
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * @return hard disk
     */
    public String getHdd() {
        return hdd;
    }

    /**
     * @return processor
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * @return true if wifi is enable else return false.
     */
    public boolean getWifi() {
        return isWifiEnable;
    }

    /**
     * This is inner class of {@link Laptop } and it is a builder for this
     * Laptop class can set the data for that class.
     * @author Krishnakanth Yachareni
     *
     */
    public static class LaptopBuilder {
        /**
         * Lap top RAM.
         */
        private String ram;
        /**
         * Laptop Hard Disk.
         */
        private String hdd;
        /**
         * Laptop processor.
         */
        private String processor;
        /**
         * Laptop wifi Enable or disable.
         */
        private boolean isWifiEnable;

        /**
         * This method set the ram.
         * @param rm
         *            Laptop ram.
         * @return {@link LaptopBuilder}
         */
        public LaptopBuilder setRam(final String rm) {
            this.ram = rm;
            return this;
        }

        /**
         * This method set the hard disk.
         * @param hd
         *            Laptop hard disk.
         * @return {@link LaptopBuilder}
         */
        public LaptopBuilder setHdd(final String hd) {
            this.hdd = hd;
            return this;
        }

        /**
         * This method can set the processor.
         * @param procesor
         *            laptop processor
         * @return {@link LaptopBuilder}
         */
        public LaptopBuilder setProcessor(final String procesor) {
            this.processor = procesor;
            return this;
        }

        /**
         * @param wifi
         *            laptop wifi.
         * @return {@link LaptopBuilder}
         */
        public LaptopBuilder setWifi(final boolean wifi) {
            this.isWifiEnable = wifi;
            return this;
        }

        /**
         * @return {@link Laptop} object referene.
         */
        public Laptop buildLaptop() {
            return new Laptop(this);
        }
    }

}
