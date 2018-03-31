package com.epam.builderpatterntest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.epam.builderpattern.Laptop;
import com.epam.builderpattern.PC;
import com.epam.builderpattern.factories.LaptopFactory;
import com.epam.builderpattern.factories.PCFactory;

/**
 * This class contains j unit test cases.
 * @author Krishnakanth Yachreni
 *
 */
public class ComputerTest {

    /**
     * This method can tests the {@link PC} class.
     */
    @Test
    public void pcTest() {
        PCFactory pcFactory = new PCFactory();
        PC pc = pcFactory.createPC("1TB", "4GB", "AMD-A8");
        assertEquals("1TB", pc.getHdd());
        assertEquals("4GB", pc.getRam());
        assertEquals("AMD-A8", pc.getProcessor());
    }

    /**
     * This method can tests the {@link Laptop} class.
     */
    @Test
    public void laptopTest() {
        LaptopFactory laptopFactory = new LaptopFactory();
        Laptop pc = laptopFactory.createLaptop("2TB", "8GB", "intel-i7", true);
        assertEquals("2TB", pc.getHdd());
        assertEquals("8GB", pc.getRam());
        assertEquals("intel-i7", pc.getProcessor());
        assertTrue(pc.getWifi());
    }
}
