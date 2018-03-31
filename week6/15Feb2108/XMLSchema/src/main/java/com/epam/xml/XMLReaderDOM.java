/**
 * This example of XML Schema and XML parsing example.
 */
package com.epam.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * This class parse the XML file and then we can get the XML data from memory.
 */
public class XMLReaderDOM {
    /**
     * @param xmlFilePath
     *            XML file path.
     */
    public void setXmlPath(final String xmlFilePath) {
        try {
            File stocks = new File(xmlFilePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(stocks);
            doc.getDocumentElement().normalize();

            System.out.println("root of xml file"
                    + doc.getDocumentElement().getNodeName());
            NodeList nodes = doc.getElementsByTagName("Employee");
            System.out.println("==========================");

            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out
                            .println("Employee ID: " + getValue("id", element));
                    System.out.println("Employee FirstName: "
                            + getValue("firstname", element));
                    System.out.println("Employee LastName: "
                            + getValue("lastname", element));
                    System.out.println(
                            "Employee Dob: " + getValue("dob", element));
                    System.out.println(
                            "Employee Salary: " + getValue("salary", element));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @param tag
     *            tag name in XML file.
     * @param element
     *            element name XMl file.
     * @return value of element from XML file.,
     */
    private String getValue(final String tag, final Element element) {
        NodeList nodes = element.getElementsByTagName(tag).item(0)
                .getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }
}
