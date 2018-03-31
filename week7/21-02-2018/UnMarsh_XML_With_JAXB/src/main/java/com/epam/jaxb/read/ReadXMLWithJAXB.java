/***************************************************************
 * Copyright Feb 21, 2018 www.epam.com To Present All Rights reserved.
 ***************************************************************/
package com.epam.jaxb.read;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.epam.jaxb.model.Book;
import com.epam.jaxb.model.BookStore;

/**
 * This class has main method, It can UnMarsh the XMl file.
 * @author Krishnakanth_Yachare
 *
 */
public final class ReadXMLWithJAXB {
    /**
     * Default Constructor.
     */
    private ReadXMLWithJAXB() {
    }

    /**
     * @param args
     *            command line arguments.
     */
    public static void main(final String[] args) {
        try {
            // creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(src/main/resource/BookStore.class);
            // creating the unmarshall object
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();

            // getting the xml file to read
            File file = new File("./resource/bookstore.xml");

            BookStore bookStore = (BookStore) unmarshallerObj.unmarshal(file);
            List<Book> data = bookStore.getBooks();
            for (Book book : data) {
                System.out.println(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
