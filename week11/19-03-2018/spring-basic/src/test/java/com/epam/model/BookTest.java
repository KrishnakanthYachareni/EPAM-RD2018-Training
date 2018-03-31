/*
 * This is spring XML based configuration basic example.
 */
package com.epam.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This is simple spring junit testing.
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:context.xml"})
public class BookTest {

    /**
     * {@link Book}.
     */
    @Autowired
    private Book book;

    /**
     * Book ID test.
     */
    @Test
    public void bookIdTest() {
        assertEquals(book.getId(), 1);
    }

    /**
     * Book name test.
     */
    @Test
    public void bookNameTest() {
        assertEquals(book.getBookName(), "Krishna");
    }
}
