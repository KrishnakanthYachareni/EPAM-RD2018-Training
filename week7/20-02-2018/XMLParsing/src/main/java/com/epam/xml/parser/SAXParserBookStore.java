/***************************************************************
 * Copyright Feb 20, 2018 www.epam.com To Present All Rights reserved.
 ***************************************************************/
package com.epam.xml.parser;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.epam.xml.model.Book;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class SAXParserBookStore extends DefaultHandler {
    /**
     * List to holds books objects.
     */
    private List<Book> bookList;
    /**
     * {@link Book} reference.
     */
    private Book bookStore;
    /**
     * String Builder to hold multiple Book Authors.
     */
    private StringBuilder author;
    /**
     * String Builder to hold multiple Book Category.
     */
    private StringBuilder category;

    /**
     * @return book objects list.
     */
    public List<Book> getBookList() {
        return bookList;
    }

    /**
     * Initially all tags are not read so set to False.
     */
   private boolean bTitle = false;
   private boolean bAuthor = false;
   private boolean bCatagory = false;
   private boolean bLanguage = false;
   private boolean bYear = false;
   private boolean bEdition = false;
   private boolean bPrice = false;

    /*
     * This method reads the start tags and then boolean values set to true.
     * (non-Javadoc).
     * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
     * java.lang.String, java.lang.String, org.xml.sax.Attributes)
     */
    @Override
    public void startElement(final String uri, final String localName,
            final String qName, final Attributes attributes)
            throws SAXException {
        if (qName.equalsIgnoreCase("book")) {
            String iSBN = attributes.getValue(0);
            bookStore = new Book();
            bookStore.setISBN(iSBN);
            author = new StringBuilder();
            category = new StringBuilder();
            if (bookList == null) {
                bookList = new ArrayList<Book>();
            }
        } else if (qName.equalsIgnoreCase("title")) {
            bTitle = true;
        } else if (qName.equalsIgnoreCase("author")) {
            bAuthor = true;
        } else if (qName.equalsIgnoreCase("category")) {
            bCatagory = true;
        } else if (qName.equalsIgnoreCase("language")) {
            bLanguage = true;
        } else if (qName.equalsIgnoreCase("edition")) {
            bEdition = true;
        } else if (qName.equalsIgnoreCase("year")) {
            bYear = true;
        } else if (qName.equalsIgnoreCase("price")) {
            bPrice = true;
        }
    }

    /*
     * (non-Javadoc).
     * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String,
     * java.lang.String, java.lang.String)
     */
    @Override
    public void endElement(final String uri, final String localName,
            final String qName) throws SAXException {
        if (qName.equalsIgnoreCase("book")) {
            bookStore.setAuthor(author.toString());
            bookStore.setCategory(category.toString());
            bookList.add(bookStore);
        }
    }

    /* This method can set the content to BookStore object.
     * (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
     */
    @Override
    public void characters(final char[] ch, final int start, final int length)
            throws SAXException {
        if (bTitle) {
            bookStore.setTitle(new String(ch, start, length));
            bTitle = false;
        } else if (bAuthor) {
            author.append(new String(ch, start, length) + ",");
            bAuthor = false;
        } else if (bCatagory) {
            category.append(new String(ch, start, length) + ",");
            bCatagory = false;
        } else if (bLanguage) {
            bookStore.setLanguage(new String(ch, start, length));
            bLanguage = false;
        } else if (bYear) {
            bookStore.setYear(Integer.parseInt(new String(ch, start, length)));
            bYear = false;
        } else if (bPrice) {
            bookStore.setPrice(
                    Double.parseDouble(new String(ch, start, length)));
            bPrice = false;
        } else if (bEdition) {
            bookStore.setEdition(new String(ch, start, length));
            bEdition = false;
        }
    }
}
