/***************************************************************
 * Copyright Feb 20, 2018 www.epam.com To Present All Rights reserved.
 ***************************************************************/
package com.epam.xml;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.epam.xml.model.Book;
import com.epam.xml.parser.SAXParserBookStore;

/**
 * @author Krishnakanth_Yachare
 *
 */
public final class BookMain {
    /**
     * Default Constructor.
     */
    private BookMain() {
    }

    /**
     * @param args
     *            command line argument.
     */
    public static void main(final String[] args) {
        // create instance for SAXParseFactory.
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

        SAXParser saxParser;
        try {
            saxParser = saxParserFactory.newSAXParser();
            // creating instance for SAXParserBookStore class.
            SAXParserBookStore handler = new SAXParserBookStore();
            // Passing XML file path.
            saxParser.parse(new File(".reource/bookstore.xml"), handler);
            /*
             * This method can return the list which contains the BookStore
             * Objects and then we iterating the info.
             */
            List<Book> bookList = handler.getBookList();
            for (Book book : bookList) {
                System.out.println("ISBN " + book.getISBN());
                System.out.println("Price " + book.getPrice());
                System.out.println("Title " + book.getTitle());
                System.out.println("Author " + book.getAuthor());
                System.out.println("Category " + book.getCategory());
                System.out.println("Language " + book.getLanguage());
                System.out.println("Year " + book.getYear());
                System.out.println("Edition " + book.getEdition());
                System.out.println("\n");

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
