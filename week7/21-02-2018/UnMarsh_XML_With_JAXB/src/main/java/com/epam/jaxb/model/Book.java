/***************************************************************
 * Copyright Feb 21, 2018 www.epam.com To Present All Rights reserved.
 ***************************************************************/
package com.epam.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This is POJO class for Book.
 * @author Krishnakanth_Yachare
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "title", "author", "category", "language", "year",
        "edition", "price" })
public class Book {
    /**
     * Book ISBN Number.
     */
    @XmlAttribute
    private String isbn;
    /**
     * Book Title.
     */
    private String title;
    /**
     * Book Author.
     */
    private String author;
    /**
     * Book Type.
     */
    private String category;
    /**
     * Language type in book.
     */
    private String language;
    /**
     * book Year.
     */
    private int year;
    /**
     * Book Edition.
     */
    private String edition;
    /**
     * Book price.
     */
    private double price;

    /**
     * @return Book ISBN Number.
     */
    @XmlAttribute
    public String getISBN() {
        return isbn;
    }

    /**
     * @param iSB
     *            set Book ISBN Number.
     */
    public void setISBN(final String iSB) {
        this.isbn = iSB;
    }

    /**
     * @return Book title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param titl
     *            set book title.
     */
    public void setTitle(final String titl) {
        this.title = titl;
    }

    /**
     * @return author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param authr
     *            Author.
     */
    public void setAuthor(final String authr) {
        this.author = authr;
    }

    /**
     * @return Category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param categry
     *            Book Category.
     */
    public void setCategory(final String categry) {
        this.category = categry;
    }

    /**
     * @return language.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param languag
     *            language in book.
     */
    public void setLanguage(final String languag) {
        this.language = languag;
    }

    /**
     * @return book year.
     */
    public int getYear() {
        return year;
    }

    /**
     * @param yr
     *            year.
     */
    public void setYear(final int yr) {
        this.year = yr;
    }

    /**
     * @return edition.
     */
    public String getEdition() {
        return edition;
    }

    /**
     * @param editin
     *            set book edition.
     */
    public void setEdition(final String editin) {
        this.edition = editin;
    }

    /**
     * @return price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param pric
     *            price.
     */
    public void setPrice(final double pric) {
        this.price = pric;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ISBN: " + this.isbn + " Author: " + this.author + " Title: "
                + this.title + " Category: " + this.category + "Language: "
                + this.language + " Year: " + this.year + " Edition: "
                + this.edition + " Price: " + this.price;
    }

}
