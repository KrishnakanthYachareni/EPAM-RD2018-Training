/**
 * JAXB Unmarshalling example.
 */
package com.epam.demo;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.epam.model.Bookstore;
import com.epam.model.ObjectFactory;

/**
 * @author Krishnakanth Yachareni
 *
 */
public final class MarshallingMain {
    /**
     * Default constructor.
     */
    private MarshallingMain() {
    }

    /**
     * @param args
     *            comandLine arguments.
     * @throws JAXBException
     *             {@link JAXBException}
     */
    public static void main(final String[] args) throws JAXBException {
        // create JAXB Instance.
        JAXBContext context = JAXBContext.newInstance(Bookstore.class);
        ObjectFactory objectF = new ObjectFactory();
        File file = new File("./output/bookstore.xml");
        Bookstore bookStoreOb = objectF.createBookstore();
        Bookstore.Book bookObj = objectF.createBookstoreBook();
        List<Bookstore.Book> bookList = bookStoreOb.getBook();

        bookObj.setAuthor("Krishnakanth");
        bookObj.setCategory("JAVA");
        bookObj.setIsbn("12345678");
        bookObj.setPrice(200);
        bookObj.setTitle("Java for Beginners");
        bookObj.setYear(2018);

        bookList.add(bookObj);
        bookStoreOb.getBook().add(bookObj);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
        marshaller.marshal(bookStoreOb, System.out);

        marshaller.marshal(bookStoreOb, file);
    }

}
