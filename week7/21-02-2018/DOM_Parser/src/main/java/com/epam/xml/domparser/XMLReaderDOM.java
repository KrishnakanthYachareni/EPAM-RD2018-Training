/***************************************************************
 * Copyright Feb 21, 2018 www.epam.com To Present All Rights reserved.
 ***************************************************************/
package com.epam.xml.domparser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.epam.xml.model.BookStore;
import com.epam.xml.model.Book;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class XMLReaderDOM {
    /**
     * {@link BookStore} reference.
     */
    private BookStore bookStore;

    /**
     * Default constructor.
     */
    public XMLReaderDOM() {
        bookStore = new BookStore();
    }

    /**
     * @return {@link BookStore} object reference.
     */
    public BookStore getBookStore() {
        return bookStore;
    }

    /**
     * This method accept the XML file path and can create the DOM object and
     * then iterate the DOM tree.
     * @param filePath
     *            XML file path.
     * @throws ParserConfigurationException
     *             {@link ParserConfigurationException}
     * @throws SAXException
     *             {@link SAXException}
     * @throws IOException
     *             {@link IOException}
     */
    public void parseData(final String filePath)
            throws ParserConfigurationException, SAXException, IOException {
        File xmlFile = new File(filePath);

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);
        // doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName("book");
        // now XML is loaded as Document in memory, lets convert it to Object
        // List
        List<Book> bookList = new ArrayList<Book>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            bookList.add(getBook(nodeList.item(i)));
        }
        bookStore.setBooks(bookList);
    }

    /**
     * @param node
     *            Node.
     * @return {@link Book} Object.
     */
    private Book getBook(final Node node) {
        Book book = new Book();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            book.setIsbn(element.getAttribute("isbn"));
            book.setAuthor(getTagValue("author", element));
            book.setCategory(getTagValue("category", element));
            book.setEdition(getTagValue("edition", element));
            book.setLanguage(getTagValue("language", element));
            book.setPrice(Double.parseDouble((getTagValue("price", element))));
            book.setTitle(getTagValue("title", element));
            book.setYear(Integer.parseInt((getTagValue("year", element))));

        }

        return book;
    }

    /**
     * This method can get the content from XML and then it can return.
     * @param tag
     *            Tag.
     * @param element
     *            ELEMENT.
     * @return tag content.
     */
    private String getTagValue(final String tag, final Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0)
                .getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }

}
