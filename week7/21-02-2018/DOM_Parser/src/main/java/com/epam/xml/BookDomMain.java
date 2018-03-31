/***************************************************************
 * Copyright Feb 21, 2018 www.epam.com To Present All Rights reserved.
 ***************************************************************/
package com.epam.xml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.epam.xml.domparser.XMLReaderDOM;
import com.epam.xml.model.Book;
import com.epam.xml.model.BookStore;

/**
 * @author Krishnakanth_Yachare
 *
 */
public final class BookDomMain {
    /**
     * Default constructor.
     */
    private BookDomMain() {
    }

    /**
     * @param args
     *            command line arguments.
     */
    public static void main(final String[] args) {
        // create object
        XMLReaderDOM dom = new XMLReaderDOM();
        try {
            // send XML path
            dom.parseData("src/main/resource/bookstore.xml");

            BookStore bookStore = dom.getBookStore();
            for (Book book : bookStore.getBooks()) {
                System.out.println(book);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
