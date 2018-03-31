/*
 * This is spring XML based configuration basic example.
 */
package com.epam.model;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class Book {
    /**
     * Book id.
     */
    private int id;
    
    /**
     * Book name.
     */
    private String bookName;

    /**
     * @param id book id.
     * @param bookName book name.
     */
    public Book(final int id, final String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    /**
     * @return book id.
     */
    public int getId() {
        return id;
    }

    /**
     * @return book name.
     */
    public String getBookName() {
        return bookName;
    }


}
