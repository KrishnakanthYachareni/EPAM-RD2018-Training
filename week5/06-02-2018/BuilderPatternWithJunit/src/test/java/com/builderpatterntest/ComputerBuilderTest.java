/**
 * This is Test cases for simple Builder pattern example.
 */
package com.builderpatterntest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.builderpattern.Computer;

/**
 * @author Krishnakanth_Yachare
 */
public class ComputerBuilderTest {
    /**
     * {@link Computer} reference.
     */
    private Computer computer;
    /**
     * Hard Disk.
     */
    private static final String HARD_DISK = "1TB";
    /**
     * RAM.
     */
    private static final String RAM = "4GB";
    /**
     * s Processor.
     */
    private static final String PROCESSOR = "AMD-A8";
    /**
     * Graphic card enable.
     */
    private static final boolean GRAPHICS_CARD_ENABLED = true;
    /**
     * Graphic card disabled.
     */
    private static final boolean GRAPHICS_CARD_DISABLED = false;

    /**
     * @see junit.framework.TestCase#setUp()
     * @throws Exception
     *             {@link Exception}.
     */
    @Before
    public void setUp() throws Exception {
        computer = new Computer.ComputerBuilder(HARD_DISK, RAM, PROCESSOR)
                .build();
    }

    /**
     * Hard disk Testing.
     */
    @Test
    public void testGetHardDisk() {
        assertEquals(HARD_DISK, computer.getHardDisk());
    }

    /**
     * RAM Testing.
     */
    @Test
    public void testGetRam() {
        assertEquals(RAM, computer.getRam());
    }

    /**
     * Processor Testing.
     */

    public void testGetProcessor() {
        assertEquals(PROCESSOR, computer.getProcessor());
    }

    /**
     * Graphic Card Testing if enable.
     */
    @Test
    public void testIsGraphicsCarjdEnabled() {
        Computer computers = new Computer.ComputerBuilder(HARD_DISK, RAM,
                PROCESSOR).setGraphicsCardEnabled(GRAPHICS_CARD_ENABLED)
                        .build();
        assertTrue(computers.isGraphicsCarjdEnabled());
    }

    /**
     * Graphic Card Testing if disable.
     */
    @Test
    public void testIsGraphicsCardDisabled() {
        Computer computers = new Computer.ComputerBuilder(HARD_DISK, RAM,
                PROCESSOR).setGraphicsCardEnabled(GRAPHICS_CARD_DISABLED)
                        .build();
        assertFalse(computers.isGraphicsCarjdEnabled());
    }

}
