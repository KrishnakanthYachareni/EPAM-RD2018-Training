/**
 * This test case of XML File read.
 */
package com.epam.xml.test;

import org.junit.Test;

import com.epam.xml.XMLReaderDOM;

/**
 * @author Krishnakanth
 *
 */
public class XMLParserTest {

    /**
     * Test case for XML Parser.
     */
    @Test
    public void test() {
        XMLReaderDOM xmlDom = new XMLReaderDOM();
        xmlDom.setXmlPath("Employee.xml");
    }
}
