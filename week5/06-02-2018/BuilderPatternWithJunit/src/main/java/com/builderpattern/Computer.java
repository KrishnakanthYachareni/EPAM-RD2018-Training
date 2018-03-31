/**
 * This is simple Builder pattern example.
 */
package com.builderpattern;

/**
 * @author Krishnakanth_Yachare
 */
public class Computer {
    /**
     * Default constructor.
     */
    public Computer() {
    }

    /**
     * Computer HardDisk size.
     */
    private String hardDisk;
    /**
     * Computer RAM size.
     */
    private String ram;
    /**
     * Computer Processor type.
     */
    private String processor;

    /**
     * GPU(Graphic Processing Unit) is enable or not.
     */
    private boolean isGraphicsCardEnabled;

    /**
     * @return String hard Disk
     */
    public String getHardDisk() {
        return hardDisk;
    }

    /**
     * @return String RAM.
     */
    public String getRam() {
        return ram;
    }

    /**
     * @return String Processor.
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * @return boolean true if Graphic card is enabled or else false.
     */
    public boolean isGraphicsCarjdEnabled() {
        return isGraphicsCardEnabled;
    }

    /**
     * This is {@link Computer}constructor it can initialize the above
     * parameters.
     * @param builder
     *            {@link ComputerBuilder} reference.
     */
    private Computer(final ComputerBuilder builder) {
        this.hardDisk = builder.hardDisk;
        this.ram = builder.ram;
        this.processor = builder.processor;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    // Builder Class
    /**
     * The {@link ComputerBuilder} is an inner class of {@link Computer}.
     */
    public static class ComputerBuilder {

        /**
         * Computer HardDisk.
         */
        private String hardDisk;
        /**
         * Computer RAM.
         */
        private String ram;
        /**
         * Processor.
         */
        private String processor;

        /**
         * Graphics card.
         */
        private boolean isGraphicsCardEnabled;

        /**
         * @param hdd
         *            Hard Disk.
         * @param ramm
         *            RAM.
         * @param procesor
         *            Processor.
         */
        public ComputerBuilder(final String hdd, final String ramm,
                final String procesor) {
            this.hardDisk = hdd;
            this.ram = ramm;
            this.processor = procesor;
        }

        /**
         * @param isGraphicsCardEnable
         *            boolean true if graphic card is enable or else false.
         * @return {@link ComputerBuilder} reference.
         */
        public ComputerBuilder setGraphicsCardEnabled(
                final boolean isGraphicsCardEnable) {
            this.isGraphicsCardEnabled = isGraphicsCardEnable;
            return this;
        }

        /**
         * This method return {@link Computer} object by passing parameter as
         * {@link ComputerBuilder} object reference.
         * @return {@link Computer} object.
         */
        public Computer build() {
            return new Computer(this);
        }

    }

}
