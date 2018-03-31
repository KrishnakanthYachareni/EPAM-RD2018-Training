package com.epam.observerpatterntest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.epam.observerpattern.Blog;
import com.epam.observerpattern.User;

/**
 * This class will test the observer pattern.
 * @author Krishnakanth Yachareni
 *
 */
public class ObserverTest {
    /**
     * {@link Blog} class reference.
     */
    private Blog blog;
    /**
     * {@link User} class references.
     */
    private User user1, user2;

    /**
     * @throws Exception
     *             {@link Exception}
     */
    @Before
    public void setUp() throws Exception {
        blog = new Blog();
        user1 = new User();
        user2 = new User();
        blog.registerObserver(user1);
        blog.registerObserver(user2);
    }

    /**
     * This method tests the Observer pattern before updating the content.
     */
    @Test
    public void testBeforeUpdate() {
        user1.setSubject(blog);
        user2.setSubject(blog);
        assertEquals("No New Article!", user1.getArticle());
    }

    /**
     * This method tests the Observer pattern after updating the content.
     */
    @Test
    public void testAfterUpdate() {
        user1.setSubject(blog);
        user2.setSubject(blog);
        blog.postNewArticle();
        assertEquals("Observer Design Pattern", user1.getArticle());
    }
}
