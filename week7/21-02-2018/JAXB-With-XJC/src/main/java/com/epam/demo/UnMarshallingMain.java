/**
 * JAXB Unmarshalling example.
 */
package com.epam.demo;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.epam.model.Bookstore;
import com.epam.model.Bookstore.Book;

/**
 * @author Krishnakanth Yachareni
 *
 */
public final class UnMarshallingMain {
    /**
     * Default constructor.
     */
    private UnMarshallingMain() {
    }

    /**
     * @param args
     *            command line arguments.
     * @throws JAXBException
     *             {@link JAXBException}
     */
    public static void main(final String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Bookstore.class);
        File file = new File("./output/bookstore.xml");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Bookstore bookStoreOne = (Bookstore) unmarshaller.unmarshal(file);
        List<Bookstore.Book> bookListOne = bookStoreOne.getBook();
        for (Book book : bookListOne) {
            System.out.println(book.getAuthor() + "," + book.getCategory() + ","
                    + book.getIsbn() + "," + book.getPrice() + ","
                    + book.getTitle() + "," + book.getYear());
        }

    }
}
