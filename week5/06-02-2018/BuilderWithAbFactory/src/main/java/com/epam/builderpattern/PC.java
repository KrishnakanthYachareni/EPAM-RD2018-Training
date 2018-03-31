/**
 * This an example for builder pattern using abstract factory.
 */
package com.epam.builderpattern;

/**
 * @author Krishnakanth Yachareni.
 *
 */
public class PC {
    /**
     * PC RAM.
     */
    private String ram;
    /**
     * PC Hard Disk.
     */
    private String hdd;
    /**
     * PC processor.
     */
    private String processor;

    /**
     * This constructor can initialize the above specifications.
     * @param builder
     *            {@link PCBuilder} class reference.
     */
    public PC(final PCBuilder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.processor = builder.processor;
    }

    /**
     * @return the ram
     */
    public final String getRam() {
        return ram;
    }

    /**
     * @return the hdd
     */
    public final String getHdd() {
        return hdd;
    }

    /**
     * @return the processor
     */
    public final String getProcessor() {
        return processor;
    }

    /**
     * This is inner class of {@link PC } and it is a builder for this PC class
     * can set the data for that class.
     * @author Krishnakanth Yachareni
     *
     */
    public static class PCBuilder {
        /**
         * PC RAM.
         */
        private String ram;
        /**
         * PC Hard Disk.
         */
        private String hdd;
        /**
         * PC processor.
         */
        private String processor;

        /**
         * This method set the ram.
         * @param rm
         *            PC ram.
         * @return {@link PCBuilder}
         */
        public PCBuilder setRam(final String rm) {
            this.ram = rm;
            return this;
        }

        /**
         * This method set the hard disk.
         * @param hd
         *            PC hard disk.
         * @return {@link PCBuilder}
         */
        public PCBuilder setHdd(final String hd) {
            this.hdd = hd;
            return this;
        }

        /**
         * This method can set the processor.
         * @param procesor
         *            PC processor
         * @return {@link PCBuilder}
         */
        public PCBuilder setProcessor(final String procesor) {
            this.processor = procesor;
            return this;
        }

        /**
         * @return {@link PC} class object refernece.
         */
        public PC buildPC() {
            return new PC(this);
        }
    }
}
