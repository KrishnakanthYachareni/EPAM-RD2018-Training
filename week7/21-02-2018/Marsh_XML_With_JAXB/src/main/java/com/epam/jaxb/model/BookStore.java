/***************************************************************
 * Copyright Feb 21, 2018 www.epam.com To Present All Rights reserved.
 ***************************************************************/
package com.epam.jaxb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The {@link BookStore} class has methods to holds {@link Book} object
 * references.
 * @author Krishnakanth_Yachare
 *
 */
@XmlRootElement(name = "bookstore")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookStore {
    /**
     * List to holds to book object references.
     */
    @XmlElement(name = "book", type = Book.class)
    private List<Book> books;

    /**
     * @return book object list.
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * @param book
     *            set book list.
     */
    public void setBooks(final List<Book> book) {
        this.books = book;
    }
}
