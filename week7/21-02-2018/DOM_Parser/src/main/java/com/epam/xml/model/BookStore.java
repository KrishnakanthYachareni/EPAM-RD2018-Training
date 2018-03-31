/***************************************************************
 * Copyright Feb 21, 2018 www.epam.com To Present All Rights reserved.
 ***************************************************************/
package com.epam.xml.model;

import java.util.List;

/**
 * The {@link BookStore} class has methods to holds {@link Book} object
 * references.
 * @author Krishnakanth_Yachare
 *
 */
public class BookStore {
    /**
     * List to holds to book object references.
     */
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
