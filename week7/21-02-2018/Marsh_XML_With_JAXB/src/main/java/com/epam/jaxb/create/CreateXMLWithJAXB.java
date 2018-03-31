/***************************************************************
 * Copyright Feb 21, 2018 www.epam.com To Present All Rights reserved.
 ***************************************************************/
package com.epam.jaxb.create;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.epam.jaxb.model.Book;
import com.epam.jaxb.model.BookStore;

/**
 * This class has a main method,It can Marsh the data to xml using JAXB Marsh.
 * @author Krishnakanth_Yachare
 *
 */
public final class CreateXMLWithJAXB {
    /**
     * Default Constructor.
     */
    private CreateXMLWithJAXB() {
    }

    /**
     * @param args
     *            command line arguments.
     * @throws IOException
     *             {@link IOException}.
     */
    public static void main(final String[] args) {

        BookStore books = new BookStore();
        // setting the values in POJO class
        Book bookObject = new Book();
        bookObject.setIsbn("123456789");
        bookObject.setAuthor("Krishnakanth");
        bookObject.setCategory("Java");
        bookObject.setEdition("1");
        bookObject.setLanguage("English");
        bookObject.setTitle("Java In Depth");
        bookObject.setPrice(200);
        bookObject.setYear(2018);

        List<Book> bookList = new ArrayList<Book>();

        bookList.add(bookObject);
        books.setBooks(bookList);

        try {
            // creating the JAXB context
            JAXBContext context = JAXBContext.newInstance(BookStore.class);
            // creating the marshall object
            Marshaller marshaller = context.createMarshaller();
            // setting the property to show xml format output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Its just for print the xml format on console.
            StringWriter sw = new StringWriter();
            marshaller.marshal(books, sw);

            File f = new File("./output/bookstore.xml");
            // calling the marshall method
            marshaller.marshal(books, f);

            System.out.println(sw.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
